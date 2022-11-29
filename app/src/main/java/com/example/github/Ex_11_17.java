package com.example.github;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Ex_11_17 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex11_16);
        setTitle("스피너 테스트");

        final String[] movie = { "옥자","가을로","루터","판도라",
                "톰보이","감금","E.T",
                "백두산","블랙팬서","히말라야" };

        final Integer[] posterID = { R.drawable.mov01, R.drawable.mov02,
                R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10 };

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, movie);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                ImageView ivPoster = (ImageView) findViewById(R.id.ivPoster);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setPadding(5, 5, 5, 5);
                ivPoster.setImageResource(posterID[arg2]);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });

    }
}