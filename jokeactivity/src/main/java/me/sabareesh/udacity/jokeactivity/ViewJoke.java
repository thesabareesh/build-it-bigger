package me.sabareesh.udacity.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ViewJoke extends AppCompatActivity {

    public static final String INTENT_EXTRA_JOKE = "intent:extra:joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joke);
        getSupportActionBar().setTitle("Here's a joke");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String joke=getIntent().getStringExtra(INTENT_EXTRA_JOKE);
        TextView jokeTextView=(TextView) findViewById(R.id.joke);
        if(jokeTextView!=null){
            jokeTextView.setText(joke);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }


}
