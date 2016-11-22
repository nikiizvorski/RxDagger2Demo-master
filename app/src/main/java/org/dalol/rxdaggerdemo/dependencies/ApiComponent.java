package org.dalol.rxdaggerdemo.dependencies;

import org.dalol.rxdaggerdemo.ui.MainActivity;

import dagger.Component;

@CustomScope
@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {

    void inject(MainActivity activity);
}
