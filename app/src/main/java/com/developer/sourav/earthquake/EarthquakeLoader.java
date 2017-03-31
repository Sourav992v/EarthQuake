package com.developer.sourav.earthquake;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.net.URL;
import java.util.List;

/**
 * Created by Sourav on 3/30/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getSimpleName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"Test: onStartLoading() called....");
        forceLoad();

    }

    /**
     * This is on a background thread.
     */

    @Override
    public List<Earthquake> loadInBackground() {

        Log.i(LOG_TAG,"Test: onLoadInBackground() called....");


        if (mUrl == null) {
            return null;
        }
        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
