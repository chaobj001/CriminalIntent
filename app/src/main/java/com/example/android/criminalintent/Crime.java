package com.example.android.criminalintent;

import java.util.UUID;

/**
 * Created by wangchao on 2017/6/9.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        //创建唯一标识
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
