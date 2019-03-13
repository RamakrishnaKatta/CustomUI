package com.genelco.churchtalk.customui;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Boolean isFabOpen = false;
    private FloatingActionButton fab,fab1,fab2;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    Button primary, secondary, teritary;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        primary = findViewById(R.id.PrimaryButton);
        secondary = findViewById(R.id.SecondaryButton);
        teritary = findViewById(R.id.teritaryButton);
        primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ToastMessage.getInstance(context).showSmallMessage("welcome jhkksajkas");
                ToastMessage.getInstance(context).showLongCustomToast("this is Primary Button", "Error");
            }
        });
        secondary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastMessage.getInstance(context).showLongCustomToast("this is Seconday Button", "success");

            }
        });
        teritary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastMessage.getInstance(context).showLongCustomToast("this is tertiary Button", "Warning");
            }
        });


        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab1 = (FloatingActionButton)findViewById(R.id.fab1);
        fab2 = (FloatingActionButton)findViewById(R.id.fab2);

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);

        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        fab.setOnClickListener(this);
        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.fab:

                animateFAB();
                break;
            case R.id.fab1:

                Log.e("Ramky", "Fab 1");
                break;
            case R.id.fab2:

                Log.d("Krishna", "Fab 2");
                break;
        }
    }

    private void animateFAB() {

        if(isFabOpen){

            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);
            fab1.setClickable(false);
            fab2.setClickable(false);
            isFabOpen = false;
            Log.d("Raj", "close");

        } else {

            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);
            fab1.setClickable(true);
            fab2.setClickable(true);
            isFabOpen = true;
            Log.d("Raj","open");

        }
    }
}
