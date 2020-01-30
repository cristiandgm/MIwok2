package com.example.miwok2;

import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary  word  that the user wants to learn.
 * It contains a default translation and a Miwok translation  for that word.
 */
public class Word {

    //Image resource ID
    private int mImageResourceId;

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param miwokTranslation   is the miwok word.
     * @param defaultTranslation is the english word.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the image resource id.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
