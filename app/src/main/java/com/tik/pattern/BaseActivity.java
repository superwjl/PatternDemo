package com.tik.pattern;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tik.pattern.util.Utils;

public abstract class BaseActivity extends AppCompatActivity{

    protected abstract String getPatternFileName();

    protected abstract void afterInitViews();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_pattern);
        try {
            ((TextView)findViewById(R.id.tv_text)).setText(Utils.getStringFromAssets(this, getPatternFileName()));
            setTitle(getPatternFileName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        afterInitViews();
    }
}
