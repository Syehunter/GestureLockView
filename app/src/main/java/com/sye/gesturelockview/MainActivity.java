package com.sye.gesturelockview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sye.library.GestureLockView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        ll.setBackgroundResource(R.mipmap.bg1);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("请绘制手势密码图案");

        GestureLockView gestureLockView = (GestureLockView) findViewById(R.id.gestureLockView);
        gestureLockView.setOnDrawFinishedListener(new GestureLockView.OnDrawFinishedListener() {
            @Override
            public boolean OnDrawFinished(List<Integer> passList) {
                if(passList.size() < 4){
                    Toast.makeText(MainActivity.this, "绘制的图案不能少于4个点!", Toast.LENGTH_LONG).show();
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                for(Integer i : passList){
                    sb.append(i);
                }
                SpUtils.putString(MainActivity.this, "GestureLock", sb.toString());
                handler.sendEmptyMessageDelayed(0, 500);
                return true;
            }
        });
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
            MainActivity.this.finish();
        }
    };

}
