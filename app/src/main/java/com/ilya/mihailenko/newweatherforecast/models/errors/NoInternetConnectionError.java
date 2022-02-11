package com.ilya.mihailenko.newweatherforecast.models.errors;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ilya.mihailenko.newweatherforecast.R;
import com.ilya.mihailenko.newweatherforecast.common.messageShower.HasLocalizedMessage;

import java.io.IOException;

/**
 * Created by Ilya Mihailenko on 22/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 22/06/2018.
 */
public class NoInternetConnectionError extends IOException implements HasLocalizedMessage {
    @Override
    public String getMessage(@NonNull Context context) {
        return context.getString(R.string.error_network);
    }
}
