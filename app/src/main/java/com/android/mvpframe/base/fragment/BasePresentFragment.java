package com.android.mvpframe.base.fragment;

import android.text.TextUtils;

import com.android.mvpframe.base.mvp.presenter.BasePresenter;
import com.android.mvpframe.base.mvp.view.BaseView;
import com.android.mvpframe.common.util.ToastUtils;

import javax.inject.Inject;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/30 0030 11:18
 */
public abstract class BasePresentFragment<T extends BasePresenter> extends BaseFragment implements BaseView {

    @Inject
    protected T presenter;

    @Override
    protected  void initFragment() {
        if (presenter != null) {
            presenter.attachView(this);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.detachView();
        }
    }

    @Override
    public void showError(String msg) {
        if(!TextUtils.isEmpty(msg)) {
            if(!TextUtils.isEmpty(msg)) {
                ToastUtils.showShortToast(getActivity(),msg);
            }
        }
    }
}
