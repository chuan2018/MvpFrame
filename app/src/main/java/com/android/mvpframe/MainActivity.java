package com.android.mvpframe;

import androidx.fragment.app.FragmentTransaction;

import com.android.mvpframe.base.activity.BaseActivity;
import com.android.mvpframe.ui.fragment.MainFragment;
import com.android.mvpframe.di.component.ActivityComponent;

public class MainActivity extends BaseActivity {

    private MainFragment homeFragment;

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }


    @Override
    public void initActivity() {
        super.initActivity();
        showFragment();
    }

    @Override
    public void injectActivityComponent(ActivityComponent component) {
        super.injectActivityComponent(component);
    }

    private void showFragment(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        homeFragment = new MainFragment();
        ft.add(R.id.fragment_content, homeFragment, MainFragment.class.getName());
        ft.commitAllowingStateLoss();
    }

}
