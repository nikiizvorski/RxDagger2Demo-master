package org.dalol.rxdaggerdemo.dependencies;

import org.dalol.rxdaggerdemo.service.FlowerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Provides
    @CustomScope
    FlowerService provideFlowerService(Retrofit retrofit) {
        return retrofit.create(FlowerService.class);
    }
}
