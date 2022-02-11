package com.ilya.mihailenko.newweatherforecast.common.messageShower;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.Toast;

import com.ilya.mihailenko.newweatherforecast.R;


public class ToastMessageShower implements MessageShower {

    private final Context context;

    public ToastMessageShower(Context context) {
        this.context = context;
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(@StringRes int messageRes) {
        showMessage(context.getString(messageRes));
    }

    @Override
    public void showMessage(Throwable throwable) {
        if (throwable instanceof HasLocalizedMessage) {
            showMessage(((HasLocalizedMessage) throwable).getMessage(context));
            return;
        }
        showMessage(R.string.unexpected_error);
    }

}
