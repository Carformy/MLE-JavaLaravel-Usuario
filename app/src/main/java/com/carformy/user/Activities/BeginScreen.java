 package com.carformy.user.Activities;
/**
 * @Developer android
 * @Company android
 **/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.carformy.user.R;

public class BeginScreen extends AppCompatActivity {

    TextView enter_ur_mailID;
    LinearLayout social_layout, lnrBegin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_begin);
        enter_ur_mailID = (TextView)findViewById(R.id.enter_ur_mailID);
        social_layout = (LinearLayout) findViewById(R.id.social_layout);
        lnrBegin = (LinearLayout) findViewById(R.id.lnrBegin);
        enter_ur_mailID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(BeginScreen.this, ActivityEmail.class);
                startActivity(mainIntent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });
        social_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(BeginScreen.this, ActivitySocialLogin.class);
                startActivity(mainIntent);
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });

    }


}
