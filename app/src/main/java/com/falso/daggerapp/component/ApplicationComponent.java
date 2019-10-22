package com.falso.daggerapp.component;

import android.app.Application;
import android.content.Context;

import com.falso.daggerapp.ApplicationContext;
import com.falso.daggerapp.ApplicationModule;
import com.falso.daggerapp.DataManager;
import com.falso.daggerapp.DbHelper;
import com.falso.daggerapp.DemoApplication;
import com.falso.daggerapp.SharedPrefsHelper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
