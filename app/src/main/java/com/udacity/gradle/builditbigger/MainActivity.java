package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import me.sabareesh.udacity.javajokelibrary.JokeShop;
import me.sabareesh.udacity.jokeactivity.ViewJoke;


public class MainActivity extends AppCompatActivity {

    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.context = getApplicationContext();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new DisplayJokeTask(this).execute();
    }

    private static class DisplayJokeTask extends GetJokeTask {
        private final Context mContext;

        public DisplayJokeTask(Context context) {
            mContext = context;
        }

        @Override
        protected void onPostExecute(@Nullable String jokeText) {
            if (jokeText == null) {
                Toast.makeText(mContext, "Error - Sorry, Joker is all out", Toast.LENGTH_SHORT).show();
                return;
            }
            Intent intent = new Intent(mContext, ViewJoke.class);
            intent.putExtra(ViewJoke.INTENT_EXTRA_JOKE,jokeText);
            mContext.startActivity(intent);
        }

    }


}
