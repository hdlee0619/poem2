package com.example.poem;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPoem(View v) {
        int id = v.getId();
        LinearLayout layout = v.findViewById(id);
        String tag = (String)layout.getTag();

        Intent it = new Intent(this, Poem.class);
        it.putExtra("it_tag", tag);
        startActivity(it);

    }
}