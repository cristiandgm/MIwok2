package com.example.miwok2;

/**
 * {@link Word} represents a vocabulary  word  that the user wants to learn.
 * It contains a default translation and a Miwok translation  for that word.
 */
public class Word {

    //Default translation for the word
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;
    //Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

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
        mDefaultTranslation = defaultTranslation;
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
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @returns wheter or not is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
