package georeach.volleydemo;

import android.app.Application;

import com.android.volley.toolbox.Volley;

/**
 * Created by cepl-pc on 31-03-2017.
 */
public class VolleyApplication extends Application {

    private static VolleyApplication sInstance;

    private com.android.volley.RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();

        mRequestQueue = Volley.newRequestQueue(this);

        sInstance = this;
    }

    public synchronized static VolleyApplication getInstance() {
        return sInstance;
    }

    public com.android.volley.RequestQueue getRequestQueue() {
        return mRequestQueue;
    }









}
