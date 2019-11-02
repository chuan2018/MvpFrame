package com.android.mvpframe.base.mvp.view.ui_view;

import android.os.Bundle;

import com.android.mvpframe.base.fragment.BaseFragment;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/28 0028 06:49
 */
public interface FragmentStartHelperView {

    /**
     * 启动BaseActivity
     *
     * @param baseFragment
     */
    void startFragment(BaseFragment baseFragment);

    void startFragmentForResult(BaseFragment baseFragment, int requestCode);

    /**
     * 启动CustomActivity
     */
    void startActivity(Class<?> cls, Bundle bundle);

    void startActivityForResult(Class<?> cls,Bundle bundle,int requestCode);

    /**
     * @param baseFragment
     * @param cls
     * @param bundle
     * @param requestCode
     */
    void startFragmentForResult(BaseFragment baseFragment,Class<?> cls,Bundle bundle,int requestCode);
}
