package com.example.phsau.fab;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button iut = (Button) findViewById(R.id.iut);
        Button sust = (Button) findViewById(R.id.sust);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final CoordinatorLayout coordinatorlayout = (CoordinatorLayout) findViewById(R.id.coordinatelayout);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinatorlayout,"Action",Snackbar.LENGTH_LONG);
                snackbar.show();
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("Action Button"));
//                intent.putExtra("App","Aciton Button");
//                startActivity(intent);
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
