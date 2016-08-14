package com.example.srima.fragaddition;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by srima on 02-08-2016.
 */
public class defaultcl extends Fragment {
    View view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        view=inflater.inflate(R.layout.layout,container,false);
        return view;
    }
}
