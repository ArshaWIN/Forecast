package com.ilya.mihailenko.newweatherforecast.common.messageShower;

import android.content.Context;
import android.support.annotation.NonNull;

public interface HasLocalizedMessage {
    String getMessage(@NonNull Context context);
}
