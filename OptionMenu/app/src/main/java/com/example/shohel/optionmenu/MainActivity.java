package com.example.shohel.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_Setting) {

            Toast.makeText(MainActivity.this, "you have clicked setting option menuu", Toast.LENGTH_SHORT).show();

            if (item.getItemId() == R.id.action_about) {
             return true;

            }


            if (item.getItemId() == R.id.action_Logout) {
                return true;

            }

        }
        return super.onOptionsItemSelected(item);
    }

}