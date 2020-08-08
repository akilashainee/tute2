package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtmsg2 = findViewById(R.id.Tvmsg2);
        txtmsg2.setText(R.string.Msg2);

        Log.i("life cycle","on create called..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("life cycle", "on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("life cycle","on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("life cycle","on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("life cycle","on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    Log.i("life cycle", "on destroy called");
    }

}