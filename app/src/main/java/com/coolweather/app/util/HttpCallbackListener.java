package com.coolweather.app.util;

/**
 * Created by root on 17-7-6.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);

}
