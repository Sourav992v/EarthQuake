package com.developer.sourav.earthquake;

/**
 * Created by Sourav on 3/23/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mUrl;
    private long mTimeInMilliseconds;

    // Construct a new (@Link Earthquake) object
    //@Parameters Magnitude, Location, Date


    public Earthquake(String magnitude, String location, String url, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mUrl = url;
        mTimeInMilliseconds = timeInMilliseconds;
    }



    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getUrl() {
        return mUrl;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
