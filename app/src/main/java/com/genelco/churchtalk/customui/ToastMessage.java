package com.genelco.churchtalk.customui;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ToastMessage  {

    private Context context;

    private static ToastMessage instance;

    private ToastMessage(Context context) {

        this.context = context;

    }

    public synchronized static ToastMessage getInstance(Context context) {
        if (instance == null) {
            instance = new ToastMessage(context);
        }
        return instance;
    }

    public void showLongMessage(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public void showSmallMessage(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void showLongCustomToast(String message, String status) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.customtoast, null);

        switch (status) {
            case "success":
                layout.setBackgroundColor(context.getResources().getColor(R.color.sec_seagreen));
                break;
            case "info":
                layout.setBackgroundColor(context.getResources().getColor(R.color.sec_blue_dark));
                break;
            case "Warning":
                layout.setBackgroundColor(context.getResources().getColor(R.color.sec_yellow_light));
                break;
            case "Error":
                layout.setBackgroundColor(context.getResources().getColor(R.color.sec_yellow_dark));
                break;
            default:
                break;
        }
        TextView msgTv = layout.findViewById(R.id.custom_text);
        msgTv.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 100, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setView(layout);
        toast.show();

    }


}
