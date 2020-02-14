package com.example.aleartdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private AlertDialog.Builder aleartDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.ButtonId);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        aleartDialogBuilder =new AlertDialog.Builder(MainActivity.this);

        aleartDialogBuilder.setTitle("Do you want to exit?");
        aleartDialogBuilder.setTitle("Alert Dialog box.");
        aleartDialogBuilder.setCancelable(false);
        aleartDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            finish();
            }
        });
        aleartDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              dialog.cancel();
            }
        });
        aleartDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Clicked is On Cancel button.",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=aleartDialogBuilder.create();
        alertDialog.show();
    }
}
