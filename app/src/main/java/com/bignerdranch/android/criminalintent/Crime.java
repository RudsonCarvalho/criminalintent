package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by rudsonkiyoshi on 27/03/17.
 */

public class Crime {

    private UUID mId;

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
