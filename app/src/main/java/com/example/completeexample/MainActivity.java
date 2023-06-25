package com.example.completeexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button button;
    Intent intent;
    PostAdapter postAdapter;

    public static final int REQ_CODE_ADD = 1;
    public static final String POST_CONSTANT_NAME = "post";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        button = findViewById(R.id.button_add);

        ArrayList<Post> posts = new ArrayList<>();


         postAdapter = new PostAdapter(getBaseContext(),R.layout.custom_post,posts);

        listView.setAdapter(postAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getBaseContext(), AddPost_Activity.class);
                startActivityForResult(intent,REQ_CODE_ADD);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_CODE_ADD && resultCode == RESULT_OK)
        {
            assert data != null;
            Post post = (Post) data.getSerializableExtra(POST_CONSTANT_NAME);
            postAdapter.addPost(post);
            postAdapter.notifyDataSetChanged();
        }
    }
}