package com.android.mvpframe.ui.fragment;

import android.view.View;

import com.android.mvpframe.R;
import com.android.mvpframe.base.fragment.BaseFragment;
import com.android.mvpframe.common.util.ToastUtils;

import butterknife.OnClick;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/28 0028 21:07
 */
public class TestFragment extends BaseFragment {

    public static TestFragment newInstance() {
        TestFragment fragment = new TestFragment();
        return fragment;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_test;
    }

    @Override
    protected void initFragment() {

    }

    @OnClick(R.id.button2)
    public void onClick(View view) {
        ToastUtils.showShortToast(getContext(),"jjjj");
        getActivity().finish();
    }
}
