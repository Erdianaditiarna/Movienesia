package com.erdian.app.favoritemovies.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.erdian.app.favoritemovies.rest.UtilsConstant.BASE_URL;

/**
 * Created by muherdianullah on 09/08/18.
 */
public class MovieClient {
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
