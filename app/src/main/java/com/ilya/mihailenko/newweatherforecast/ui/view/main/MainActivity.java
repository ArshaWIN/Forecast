package com.ilya.mihailenko.newweatherforecast.ui.view.main;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.ilya.mihailenko.newweatherforecast.R;
import com.ilya.mihailenko.newweatherforecast.databinding.ActivityMainBinding;
import com.ilya.mihailenko.newweatherforecast.ui.presenters.main.MainPresenter;
import com.ilya.mihailenko.newweatherforecast.ui.view.base.BaseActivity;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainActivity extends BaseActivity<ActivityMainBinding>
        implements MainView {

    @InjectPresenter
    MainPresenter presenter;

    @Inject
    Provider<MainPresenter> presenterProvider;

    @ProvidePresenter
    MainPresenter providePresenter() {
        return presenterProvider.get();
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        starter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ActivityMainBinding inflateBinding() {
        return DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
