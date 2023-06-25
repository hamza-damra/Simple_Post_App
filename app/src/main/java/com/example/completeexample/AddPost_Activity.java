package com.example.completeexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPost_Activity extends AppCompatActivity {
   EditText et_name, et_description, et_date, et_followers, et_following, et_posts;
   Button button;
   Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);
        et_name = findViewById(R.id.et_add_post_name);
        et_description = findViewById(R.id.et_add_post_descreption);
        et_date = findViewById(R.id.et_add_post_date);
        et_followers = findViewById(R.id.et_add_post_followers);
        et_following = findViewById(R.id.et_add_post_following);
        et_posts = findViewById(R.id.et_add_post_posts);
        button = findViewById(R.id.btn_add_post_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String description = et_description.getText().toString();
                String date = et_date.getText().toString();
                int followers = Integer.parseInt(et_followers.getText().toString());
                int following = Integer.parseInt(et_following.getText().toString());
                int posts = Integer.parseInt(et_posts.getText().toString());
                Post post = new Post(date,name,description,followers,following,posts);
                intent = new Intent();
                intent.putExtra("post",post);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}