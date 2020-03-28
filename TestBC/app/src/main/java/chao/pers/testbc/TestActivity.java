package chao.pers.testbc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        sendButton=(Button)findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new BroadcastListener());
    }

    class BroadcastListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            TestReceiver tr=new TestReceiver();
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_EDIT);
            TestActivity.this.sendBroadcast(intent);
        }
    }
}
