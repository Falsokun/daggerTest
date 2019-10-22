package com.falso.daggerapp.component;

import com.falso.daggerapp.ActivityModule;
import com.falso.daggerapp.MainActivity;
import com.falso.daggerapp.activity_scope.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
