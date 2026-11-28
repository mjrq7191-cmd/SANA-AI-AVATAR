package com.sana.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(17);
        layout.setBackgroundColor(Color.rgb(25, 10, 45));

        TextView title = new TextView(this);
        title.setText("SANA AI");
        title.setTextColor(Color.WHITE);
        title.setTextSize(32);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your Anime Virtual Assistant");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
