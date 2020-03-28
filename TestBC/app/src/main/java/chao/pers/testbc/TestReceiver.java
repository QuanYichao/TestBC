package chao.pers.testbc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 权毅超 on 2020/3/28.
 */
public class TestReceiver extends BroadcastReceiver {
    public TestReceiver(){
        System.out.println("TestReceiver");
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onReceiver");
    }
}
