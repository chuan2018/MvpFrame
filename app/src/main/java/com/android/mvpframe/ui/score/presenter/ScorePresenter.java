package com.android.mvpframe.ui.score.presenter;

import com.android.mvpframe.base.mvp.presenter.RxPresenter;
import com.android.mvpframe.http.ResultObserver;
import com.android.mvpframe.bean.Movie;
import com.android.mvpframe.bean.ScoreAllStateBean;
import com.android.mvpframe.bean.ShopBean;
import com.android.mvpframe.ui.repository.ScoreModel;
import com.android.mvpframe.ui.score.constract.ScoreConstract;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/29 0029 21:41
 */
public class ScorePresenter extends RxPresenter<ScoreConstract.View> implements ScoreConstract.Presenter {
    @Inject
    ScoreModel scoreModel;

    @Inject
    public ScorePresenter() {
    }

    @Override
    public void getScoreList(String search, String startDate, int searchType) {
        Disposable disposable = scoreModel.getScoreList(search,startDate,searchType)
                .subscribeWith(new ResultObserver<ScoreAllStateBean>() {
                    @Override
                    public void onSuccess(ScoreAllStateBean scoreAllStateBean) {
                        mView.setScoreList(scoreAllStateBean);
                    }

                    @Override
                    public void onFail(String msg) {
                        mView.showError(msg);
                    }
                });
        addSubscribe(disposable);
    }

    @Override
    public void getShopList(int size, int page) {
        Disposable disposable = scoreModel.getShopList(size,page)
                .subscribeWith(new ResultObserver<List<ShopBean>>() {
                    @Override
                    public void onSuccess(List<ShopBean> list) {
                        mView.setShopList(list);
                    }

                    @Override
                    public void onFail(String msg) {
                        mView.serError(msg);
                    }
                });
        addSubscribe(disposable);
    }

    @Override
    public void getTop250(int type, int page) {
        Disposable disposable = scoreModel.getTop250(type,page)
                .subscribeWith(new ResultObserver<List<Movie>>() {
                    @Override
                    public void onSuccess(List<Movie> list) {
                        mView.setTop250(list);
                    }

                    @Override
                    public void onFail(String msg) {
                        mView.serError(msg);
                    }
                });
        addSubscribe(disposable);
    }
}
