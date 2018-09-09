package com.dongnao.lsn3_paint_minions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {

    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    private MinionView mMinionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMinionView = (MinionView) findViewById(R.id.minion);
    }
}
