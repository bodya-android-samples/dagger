package ru.popov.bodya.basicdagger.net;

/**
 * Created by Popov Bogdan.
 */

public class NetworkApiWrapper {

    private INetworkApi mINetworkApi;

    public NetworkApiWrapper(INetworkApi INetworkApi) {
        mINetworkApi = INetworkApi;
    }
}
