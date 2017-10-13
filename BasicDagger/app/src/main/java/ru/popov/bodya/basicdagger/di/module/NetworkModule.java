package ru.popov.bodya.basicdagger.di.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import ru.popov.bodya.basicdagger.di.Names;
import ru.popov.bodya.basicdagger.net.DefaultNetworkApi;
import ru.popov.bodya.basicdagger.net.INetworkApi;
import ru.popov.bodya.basicdagger.net.NetworkApiWrapper;
import ru.popov.bodya.basicdagger.net.StubNetworkApi;

/**
 * @author Popov Bogdan.
 */

@Module
public class NetworkModule {

    @Named(Names.BACKEND_API)
    @Provides
    INetworkApi provideProdNetworkApi() {
        return new DefaultNetworkApi();
    }

    @Named(Names.STUB_API)
    @Provides
    INetworkApi provideStubNetworkApi() {
        return new StubNetworkApi();
    }

    @Provides
    NetworkApiWrapper provideNetworkApiWrapper(@Named(Names.STUB_API) INetworkApi networkApi) {
        return new NetworkApiWrapper(networkApi);
    }
}
