package com.android.mvpframe.ui.score.constract;

import com.android.mvpframe.base.mvp.presenter.BasePresenter;
import com.android.mvpframe.base.mvp.view.BaseView;
import com.android.mvpframe.bean.Movie;
import com.android.mvpframe.bean.ScoreAllStateBean;
import com.android.mvpframe.bean.ShopBean;

import java.util.List;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/29 0029 21:30
 */
public interface ScoreConstract {
    interface View extends BaseView {
        /**
         * 设置比分列表
         *
         * @param bean
         */
        void setScoreList(ScoreAllStateBean bean);

        void setShopList(List<ShopBean> list);

        void serError(String mesg);

        void setTop250(List<Movie> list);
    }
    interface Presenter extends BasePresenter<View> {
        /**
         * 处理关注
         *
         * @param search
         * @param startDate
         * @param searchType
         */
        void getScoreList(String search, String startDate, int searchType);

        void getShopList(int size, int page);

        void getTop250(int type, int page);
    }
}
