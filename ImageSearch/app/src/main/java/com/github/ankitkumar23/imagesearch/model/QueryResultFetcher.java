package com.github.ankitkumar23.imagesearch.model;

import java.util.Map;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Interface for configuring retrofit for fetching
 * the images
 * Created by ankitkumar23 on 10/23/2015.
 */
public interface QueryResultFetcher {
    @GET("/ajax/services/search/images")
    Call<QueryResult> query(@QueryMap Map<String, String> options);
}
