package com.batchmates.android.adventurerclasses;

import android.util.Log;

/**
 * Created by Android on 8/31/2017.
 */

public class Barbarian {

    private static final String TAG = "Barbarian";

    public int increaseLevel(int level)
    {
        Log.d(TAG, "increaseLevel: ");
        return ++level;
    }


}
