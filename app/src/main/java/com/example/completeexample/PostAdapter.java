package com.example.completeexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {
    Context context;
    int recourse;
    ArrayList<Post> posts;
    public PostAdapter(Context context, int recourse, ArrayList<Post> posts)
    {
        this.context = context;
        this.recourse = recourse;
        this.posts = posts;
    }

    public void addPost(Post post)
    {
        this.posts.add(post);

    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null)
        {
            view = LayoutInflater.from(context).inflate(recourse,null,false);
        }

        TextView tv_date = view.findViewById(R.id.tv_custom_post_date);
        TextView tv_name = view.findViewById(R.id.custom_tv_name);
        TextView tv_following = view.findViewById(R.id.custom_tv_following_data);
        TextView tv_followers = view.findViewById(R.id.custom_tv_followers_data);
        TextView tv_posts = view.findViewById(R.id.custom_tv_posts_data);
        TextView tv_description = view.findViewById(R.id.custom_post_tv_body);

        Post post = (Post) getItem(position);

        tv_date.setText(post.getDate());
        tv_name.setText(post.getName());
        tv_following.setText(String.valueOf(post.getFollowing()));
        tv_followers.setText(String.valueOf(post.getFollowers()));
        tv_posts.setText(String.valueOf(post.getPosts()));
        tv_description.setText(post.getDescription());


        return view;
    }
}
