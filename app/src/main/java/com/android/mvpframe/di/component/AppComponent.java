package com.android.mvpframe.di.component;

import com.android.mvpframe.di.module.ApiServiceModule;
import com.android.mvpframe.di.module.AppModule;
import com.android.mvpframe.http.APIService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 首先这个先定义一个全局的AppComponent，为什么需要全局的AppComponent呢？
 * 因为这里放得都是一些公共的对象，它们的生命周期是和Application一致的。
 */
@Component(modules = {AppModule.class, ApiServiceModule.class})
@Singleton
public interface AppComponent {
    APIService getService();
}
