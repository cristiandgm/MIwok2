package com.example.miwok2;

import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary  word  that the user wants to learn.
 * It contains a default translation and a Miwok translation  for that word.
 */
public class Word {

    //Image resource ID for the word
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
     * Create a new Word object.
     *
     * @param miwokTranslation   is the miwok word.
     * @param defaultTranslation is the english word.
     * @param imageResource is the drawable resource id associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {
        mImageResourceId = imageResource;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResource;
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

    /**
     * Get the image resource id.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
