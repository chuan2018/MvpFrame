package com.android.mvpframe.ui.repository;

import com.android.mvpframe.http.ResultDisposable;
import com.android.mvpframe.http.ScheduleTranformer;
import com.android.mvpframe.bean.Movie;
import com.android.mvpframe.bean.ScoreAllStateBean;
import com.android.mvpframe.bean.ShopBean;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/30 0030 10:45
 */
public class ScoreModel extends BaseModel {
    @Inject
    public ScoreModel() {

    }

    /**
     * 比分页
     *
     * @return
     */
    public Observable<ScoreAllStateBean> getScoreList(String search, String startDate, int searchType) {
        return apiService.getScoreList(search,startDate,searchType)
                .compose(new ResultDisposable<ScoreAllStateBean>())
                .compose(new ScheduleTranformer<ScoreAllStateBean>());
    }

    public Observable<List<ShopBean>> getShopList(int pageSize,int currentPage){
        return apiService.getShopList(pageSize,currentPage)
                .compose(new ResultDisposable<List<ShopBean>>())
                .compose(new ScheduleTranformer<List<ShopBean>>());
    }

    public Observable<List<Movie>> getTop250(int type, int page){
        return apiService.getTop250(type,page)
                .compose(new ResultDisposable<List<Movie>>())
                .compose(new ScheduleTranformer<List<Movie>>());
    }
}
