package com.example.srima.fragaddition;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by srima on 02-08-2016.
 */
public class fragclass extends Fragment {
    View view;
   static EditText ed;
    TextView tx;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){



        view=inflater.inflate(R.layout.fraglay,container,false);
        ed=(EditText)getActivity().findViewById(R.id.edit);
        tx=(TextView)view.findViewById(R.id.textv);
        tx.setText(ed.getText().toString());
        return view;
    }
}
