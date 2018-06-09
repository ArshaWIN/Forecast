package com.ilya.mihailenko.newweatherforecast;

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by Ilya Mihailenko on 04/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 04/06/2018.
 */
public class TestFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }
}
