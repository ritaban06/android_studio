package com.example.bluescreenofdeath;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.app.Activity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(0xff0000ff);

        TextView textView = new TextView(this);
        textView.setTextSize(24);
        textView.setTextColor(0xffffffff);

        StringBuilder sb = new StringBuilder();
        sb.append("A problem has benn detected and Android has been shut down to prevent damage to your phone.\n");
        sb.append("\n");
        sb.append("SPECIAL_POOL_DETECTED_MEMORY_CORRUPTION\n");
        sb.append("\n");
        sb.append("If this is the first time you've seen this error screen, restart your android.");
        sb.append("If problems continue, disable any newly installed software. Disable BIOS memory options " +
                "such as caching or shadowing. If you need to access safe mode, power down your android, " +
                "hold power button and volume down button button together then select safe mode from the options.\n");
        sb.append("\n");
        sb.append("*** STOP: 0x000000C1 (0x61AF2FF8, 0xEDCCAEBE, 0xB663BAE9, 0x8E2DF694)\n");
        textView.setText(sb.toString());

        layout.addView(textView);
        setContentView(layout);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            finish();
        }else if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_HOME || keyCode == KeyEvent.KEYCODE_MENU) {
            return true; // ignore these keys
        }
        return super.onKeyDown(keyCode, event);
    }
}