package com.example.poem;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.poem);

        LinearLayout layout_poem = findViewById(R.id.poem);
        TextView tv_title   = findViewById(R.id.title);
        TextView tv_author  = findViewById(R.id.author);
        TextView tv_body    = findViewById(R.id.body);

        Intent it = getIntent();
        String tag = it.getStringExtra("it_tag");

        Resources res = getResources();

        int id_title = res.getIdentifier("title" + tag, "string", getPackageName());
        String title = res.getString(id_title);
        tv_title.setText(title);

        int id_author = res.getIdentifier("author" + tag, "string", getPackageName());
        String author = res.getString(id_author);
        tv_author.setText(author);

        int id_body = res.getIdentifier("body" + tag, "string", getPackageName());
        String body = res.getString(id_body);
        tv_body.setText(body);

        int id_background = res.getIdentifier("background" + tag, "string", getPackageName());
        String background = res.getString(id_background);
        int id_img = res.getIdentifier(background, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(id_img, null);
        layout_poem.setBackground(drawable);
    }
}