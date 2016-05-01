package com.github.ankitkumar23.imagesearch.datastore;
import android.app.Fragment;
import android.os.Bundle;

import com.github.ankitkumar23.imagesearch.model.QueryResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Mainly used for saving data across configuration changes.
 * This fragment doesn't have an UI.
 * Created by ankitkumar23 on 10/23/2015.
 */
public class RetainedFragment extends Fragment {
    private boolean mIsLoadingComplete;
    private List<QueryResult.Result> mResults;
    private String query;
    public RetainedFragment() {
        if(mResults == null) {
            mResults = new ArrayList<QueryResult.Result>();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public List<QueryResult.Result> getData() {
        return mResults;
    }

    public QueryResult.Result getDataItem(int pos) {
        return mResults.get(pos);
    }

    public void addData(List<QueryResult.Result> data) {
        mResults.addAll(data);
    }

    public void addDataItem(QueryResult.Result dataItem) {
        mResults.add(dataItem);
    }

    public void resetData() {
        mResults.clear();
    }
    public void resetLoadComplete() {
        mIsLoadingComplete = false;
    }
    public void setLoadComplete() {
        mIsLoadingComplete = true;
    }

    public boolean isLoadComplete() {
        return mIsLoadingComplete;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String _query) {
        query = _query;
    }
}
