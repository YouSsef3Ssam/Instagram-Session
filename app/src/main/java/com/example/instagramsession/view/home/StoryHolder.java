package com.example.instagramsession.view.home;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramsession.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryHolder extends RecyclerView.ViewHolder {

    private CircleImageView storyIV;
    public StoryHolder(@NonNull View itemView) {
        super(itemView);
        storyIV = itemView.findViewById(R.id.item_story_image);
    }

    public void bind(String imageUrl){
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.image_outline)
                .into(storyIV);
    }

}
