package com.codebar.sgolcea.cookiemonster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer currentCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCookie = (ImageView)findViewById(R.id.imgCookie);
        final TextView counter = (TextView)findViewById(R.id.counter);

        imgCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hola!", Toast.LENGTH_SHORT).show();
                currentCount++;
                counter.setText(""+currentCount);
            }
        });
    }

}
