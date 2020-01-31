package com.example.miwok2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.).
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The view for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link Word} object located at this position in the list
        Word currentWord = (Word) getItem(position);

        //Find the ImageView in the list_item.xml layout with the image_word id.
        ImageView imageAboutWord = listItemView.findViewById(R.id.image_word);

        // Find the TextView in the list_item.xml layout with the ID miwok_word.
        TextView miwokWord = listItemView.findViewById(R.id.miwok_word);
        // Get the miwok word  from the current Word object and
        // set this text on the miwok TextView
        miwokWord.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_word.
        TextView defaultWord = listItemView.findViewById(R.id.default_word);
        // Get the default word  from the current Word object and
        // set this text on the default TextView
        defaultWord.setText(currentWord.getDefaultTranslation());


        if (currentWord.hasImage()) {
            // Get the image of the current Word object and
            // set this on the ImageView.
            imageAboutWord.setImageResource(currentWord.getImageResourceId());

            // Make sure that view is visible
            imageAboutWord.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView
            imageAboutWord.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
