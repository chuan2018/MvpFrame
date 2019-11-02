package com.android.mvpframe.ui.repository;

import com.android.mvpframe.http.APIService;
import com.android.mvpframe.http.ResultDisposable;
import com.android.mvpframe.http.ScheduleTranformer;
import com.android.mvpframe.bean.ResultBean;



import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/29 0029 21:46
 */
public class BaseModel {
    @Inject
    protected APIService apiService;

    public <T> Observable<T> convert(Observable<ResultBean<T>> observable){
        return observable
                .compose(new ResultDisposable<T>())
                .compose(new ScheduleTranformer<T>());
    }
}
