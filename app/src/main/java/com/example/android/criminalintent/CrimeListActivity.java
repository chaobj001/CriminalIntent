package com.example.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wangchao on 2017/6/13.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
