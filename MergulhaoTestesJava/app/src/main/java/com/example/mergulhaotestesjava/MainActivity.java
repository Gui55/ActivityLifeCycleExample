package com.example.mergulhaotestesjava;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Log.d("DebuggingOnCreate", "CHAMOU O ONCREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debugging", "CHAMOU O ONSTART");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DebuggingRestart", "CHAMOU O ONRESTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DebuggingResume", "CHAMOU O ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DebuggingOnPause", "CHAMOU O ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DebuggingStop","CHAMOU O ONSTOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DebuggingDestroy", "CHAMOU O ONDESTROY");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
