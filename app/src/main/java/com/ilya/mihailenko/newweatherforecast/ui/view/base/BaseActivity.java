package com.ilya.mihailenko.newweatherforecast.ui.view.base;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.ilya.mihailenko.newweatherforecast.common.messageShower.CanShowMessage;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by Ilya Mihailenko on 31/05/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 31/05/2018.
 */
public abstract class BaseActivity<TBinding extends ViewDataBinding> extends MvpAppCompatActivity
        implements HasSupportFragmentInjector {

    protected TBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        binding = inflateBinding();
    }

    protected abstract TBinding inflateBinding();

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

}
