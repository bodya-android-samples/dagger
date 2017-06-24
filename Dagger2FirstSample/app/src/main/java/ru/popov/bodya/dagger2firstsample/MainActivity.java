package ru.popov.bodya.dagger2firstsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

import ru.popov.bodya.dagger2firstsample.di.DaggerTestComponent;
import ru.popov.bodya.dagger2firstsample.model.ImageModel;
import ru.popov.bodya.dagger2firstsample.model.Speaker;

public class MainActivity extends AppCompatActivity {

    Speaker speaker;

    @Inject
    ImageModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerTestComponent component = DaggerTestApplication.component(this);
        component.inject(this);
        speaker = component.speaker();
        initViews();
    }

    private void initViews() {
        ImageView imageView = (ImageView) findViewById(R.id.super_image_view);
        model.downloadTask(imageView);
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(speaker.getName() + " : " + speaker.getSpeech());
    }
}
