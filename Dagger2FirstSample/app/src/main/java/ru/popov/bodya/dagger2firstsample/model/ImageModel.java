package ru.popov.bodya.dagger2firstsample.model;

import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageModel {

    private static final String SRC_NAME = "lighter";
    private static final String TAG = ImageModel.class.getSimpleName();

    private String imageURL;
    private ImageView imageView;

    public void downloadTask(ImageView imageView) {
        new DownloadImageTask(this).execute(imageURL);
        this.imageView = imageView;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Drawable> {
        ImageModel imageModel;

        DownloadImageTask(ImageModel imageModel) {
            this.imageModel = imageModel;
        }

        @Override
        protected Drawable doInBackground(String... urls) {
            Log.e(TAG, "doInBackground");
            Drawable drawable = null;
            InputStream is = null;
            String url = urls[0];
            try {
                is = (InputStream) new URL(url).getContent();
                drawable = Drawable.createFromStream(is, SRC_NAME);
            } catch (Exception exception) {
                Log.e(TAG, "doBack", exception);
            } finally {
                closeStream(is);
            }
            return drawable;
        }

        private void closeStream(InputStream stream) {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected void onPostExecute(Drawable result) {
            imageView.setImageDrawable(result);
        }
    }


    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}