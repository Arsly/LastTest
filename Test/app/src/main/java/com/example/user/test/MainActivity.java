package com.example.user.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClickWeb(View view){
        Intent it = new Intent(view.getContext(),Main2Activity.class);
        startActivity(it);
    }
    public void onClickBMI(View view){
        Intent it = new Intent(view.getContext(),Main3Activity.class);
        startActivity(it);
    }
    public void onClickFinsh(View view){
        new AlertDialog.Builder(this)
                .setMessage("確定要結束程式嗎?")
                .setIcon(android.R.drawable.ic_menu_edit)
                .setTitle("詢問")
                .setPositiveButton("確定",this)
                .setNegativeButton("取消",this)
                .show();
    }
    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == DialogInterface.BUTTON_POSITIVE){
            finish();
            System.exit(0);
        }
    }
}
