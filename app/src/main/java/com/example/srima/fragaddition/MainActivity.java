package com.example.srima.fragaddition;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button)findViewById(R.id.but);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               frm(v);
            }
        });
    }
    public void frm(View view){
        Fragment fr;
        fr=new defaultcl();
        if(view==findViewById(R.id.but)){
            fr=new fragclass();
        }
        FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }

}
