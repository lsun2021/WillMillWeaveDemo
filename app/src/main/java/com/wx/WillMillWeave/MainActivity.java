package com.wx.WillMillWeave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private WindMillView mWindMill;
    private Button mBtStart;
    private Button mBtStop;
    private WindMillView mWindMill2;

    private void initView() {
        mWindMill = (WindMillView) findViewById(R.id.wm1);
        mWindMill2 = (WindMillView) findViewById(R.id.wm2);
        mBtStart = (Button) findViewById(R.id.bt_start);
        mBtStop = (Button) findViewById(R.id.bt_stop);

        mBtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindMill.startRotate();
                mWindMill2.startRotate();
            }
        });

        mBtStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindMill.stop();
                mWindMill2.stop();
            }
        });
    }
}