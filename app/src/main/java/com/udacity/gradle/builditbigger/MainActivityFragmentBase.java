package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragmentBase extends Fragment {
    ProgressBar spinner;

    public MainActivityFragmentBase() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        spinner=(ProgressBar)root.findViewById(R.id.progressBar);
        spinner.setVisibility(View.GONE);
        return root;
    }
}
