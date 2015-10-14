package com.sye.gesturelockview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sye.library.GestureLockView;

import java.util.List;

/**
 * Created by Sye on 2015/10/14.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String gestureLock = SpUtils.getString(this, "GestureLock", "");

        LinearLayout ll = (LinearLayout) findViewById(R.id.ll);
        ll.setBackgroundResource(R.mipmap.bg2);

        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("请确认手势密码图案");

        GestureLockView gestureLockView = (GestureLockView) findViewById(R.id.gestureLockView);
        gestureLockView.setOnDrawFinishedListener(new GestureLockView.OnDrawFinishedListener() {
            @Override
            public boolean OnDrawFinished(List<Integer> passList) {
                if(null != passList){
                    StringBuilder sb = new StringBuilder();
                    for(Integer i : passList){
                        sb.append(i);
                    }
                    if(sb.toString().equals(gestureLock)){
                        Log.i(SecondActivity.this.toString(), "pattern ============== " + sb.toString());
                        Toast.makeText(SecondActivity.this, "手势密码设置成功!", Toast.LENGTH_LONG).show();
                        return true;
                    } else {
                        Toast.makeText(SecondActivity.this, "两次绘制的图案不一致!", Toast.LENGTH_LONG).show();
                        return false;
                    }
                }
                return false;
            }
        });
    }
}
