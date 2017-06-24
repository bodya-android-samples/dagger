package ru.popov.bodya.dagger2firstsample.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.dagger2firstsample.model.Speaker;

@Module
public class DaggerTestSpeakerModule {

    @Provides
    @Singleton
    Speaker provideSpeaker() {
        Speaker speaker = new Speaker();
        speaker.setName("Popov Bogdan");
        speaker.setSpeech("I love dagger 2!");
        return speaker;
    }

}
