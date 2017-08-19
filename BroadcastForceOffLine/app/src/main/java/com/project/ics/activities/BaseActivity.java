package com.project.ics.activities;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2017/8/19.
 */

public class BaseActivity extends Activity {//创建 BaseActivity 类作为所有活动的父类
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
