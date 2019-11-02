package com.android.mvpframe.http;


import com.android.mvpframe.bean.Movie;
import com.android.mvpframe.bean.ResultBean;
import com.android.mvpframe.bean.ScoreAllStateBean;
import com.android.mvpframe.bean.ShopBean;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * @author : Bruce Lee
 * @description : 接口文件
 * @date : 2019/10/26 0026 09:58
 */
public interface APIService {

    /**
     * 获取商城列表
     *
     * @param pageSize    每页多少条数据
     * @param currentPage 第几页
     * @return
     */
    @GET("mall/mall/commodity/list")
    Observable<ResultBean<List<ShopBean>>> getShopList(@Query("pageSize") int pageSize, @Query("currentPage") int currentPage);

    @FormUrlEncoded
    @POST("mat/match/live/query/score")
    Observable<ResultBean<ScoreAllStateBean>> getScoreList(@Field("search") String search, @Field("startDate") String startDate, @Field("searchType") int searchType);

    //获取豆瓣Top250 榜单
    @FormUrlEncoded
    @POST("satinApi")
    Observable<ResultBean<List<Movie>>> getTop250(@Field("type") int type, @Field("page")int page);
}
