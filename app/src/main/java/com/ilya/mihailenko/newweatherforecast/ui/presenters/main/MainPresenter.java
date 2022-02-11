package com.ilya.mihailenko.newweatherforecast.ui.presenters.main;

import com.arellomobile.mvp.InjectViewState;
import com.ilya.mihailenko.newweatherforecast.ui.presenters.base.BasePresenter;
import com.ilya.mihailenko.newweatherforecast.ui.view.main.MainView;

import javax.inject.Inject;

/**
 * Created by Ilya Mihailenko on 12/06/2018.
 * i.mihailenko@fasten.com
 * Last edit by Ilya Mihailenko on 12/06/2018.
 */

@InjectViewState
public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    public MainPresenter() {
    }
}
