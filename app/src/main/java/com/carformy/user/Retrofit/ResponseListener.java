package com.carformy.user.Retrofit;
/**
 * @Developer android
 * @Company android
 **/

import org.json.JSONArray;


public interface ResponseListener {
    void getJSONArrayResult(String strTag, JSONArray arrayResponse);
}
