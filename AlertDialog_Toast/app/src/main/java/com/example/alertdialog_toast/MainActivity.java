package com.example.alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_toast(View v){
        Toast.makeText(this, "你好!!",
                Toast.LENGTH_SHORT).show();
    }
    public void btn_alertDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("對話框");
        builder.setMessage("對話視窗");
        builder.setCancelable(true);
        builder.setPositiveButton("關閉視窗", null);
        builder.show();
    }
}