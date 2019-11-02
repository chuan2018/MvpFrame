package com.android.mvpframe.ui.fragment;

import android.view.View;
import android.widget.Button;
import com.android.mvpframe.R;
import com.android.mvpframe.base.fragment.BaseFragment;
import com.android.mvpframe.common.util.ToastUtils;
import com.android.mvpframe.di.component.ActivityComponent;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author : Bruce Lee
 * @description :
 * @date : 2019/10/28 0028 21:16
 */
public class MainFragment extends BaseFragment {
    @BindView(R.id.button)
    Button button;

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initFragment() {
    }

    @Override
    public void injectFragmentComponent(ActivityComponent component) {
        super.injectFragmentComponent(component);
    }

    @OnClick(R.id.button)
    public void onClick(View view) {
        ToastUtils.showShortToast(getContext(),"kkkk");
        startFragment(new ScoreFragment());
    }
}
