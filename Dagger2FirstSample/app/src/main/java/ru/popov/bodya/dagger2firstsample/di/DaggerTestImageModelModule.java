package ru.popov.bodya.dagger2firstsample.di;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.dagger2firstsample.model.ImageModel;

@Module
public class DaggerTestImageModelModule {

    @Provides
    ImageModel provideImageModel(String url) {
        ImageModel model = new ImageModel();
        model.setImageURL(url);
        return model;
    }

    @Provides
    String provideUrl() {
        return "https://goo.gl/R98GJU";
    }

}
