package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import java.util.concurrent.ExecutionException;

/**
 * Created by SABAREESH on 01-Sep-16.
 */
public class GetJokeTaskTest extends AndroidTestCase {

    private static final String TAG = GetJokeTaskTest.class.getSimpleName();

    public void testFetchesNonEmptyString() {
        GetJokeTask fetchJokeTask = new GetJokeTask();
        fetchJokeTask.execute();
        try {
            String joke = fetchJokeTask.get();
            Log.d(TAG, "Joke: " + joke);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException e) {
            Log.e(TAG, Log.getStackTraceString(e));
        }
    }

}