package com.udacity.gradle.builditbigger;


import android.os.AsyncTask;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import java.io.IOException;
import java.net.UnknownHostException;

import me.sabareesh.udacity.jokebackend.jokeApi.JokeApi;

/**
 * Created by SABAREESH on 01-Sep-16.
 */
public class GetJokeTask extends AsyncTask<Void, Void, String> {
    private static JokeApi myApiService = null;

    @Override
    protected String doInBackground(Void... params) {
        if(myApiService == null) {
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://udacity-and-jokebackend.appspot.com/_ah/api/");
            myApiService = builder.build();
        }

        try {
            return myApiService.getAJoke().execute().getJokeText();
        }
        catch (UnknownHostException e){
            return "Unable to connect to the internet";
        }
        catch (IOException e) {
            return e.getMessage();
        }

    }

}