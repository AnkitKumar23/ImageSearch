package com.github.ankitkumar23.imagesearch.model;

/**
 * Interface for listening to the results
 * Created by ankitkumar23 on 10/23/2015.
 */
public interface IResultsAvailable {
    public void onResultsAvailable(QueryResult results);
}