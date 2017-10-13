package ru.popov.bodya.basicdagger.net;

/**
 * @author Popov Bogdan.
 */

public class NetworkApiWrapper {

    private INetworkApi mINetworkApi;

    public NetworkApiWrapper(INetworkApi INetworkApi) {
        mINetworkApi = INetworkApi;
    }

    public INetworkApi getINetworkApi() {
        return mINetworkApi;
    }
}
