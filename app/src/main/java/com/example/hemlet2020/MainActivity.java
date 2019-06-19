package com.example.hemlet2020;

import android.content.Intent;
import android.media.Image;
import android.provider.CallLog;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_call,btn_whatsapp,btn_music,btn_SOS,btn_speedometer,btn_assistant;
    ImageView auto_view;
    Button btn_setting,btn_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_assistant = (ImageButton) findViewById(R.id.assist_btn);
        btn_call = (ImageButton) findViewById(R.id.call_btn);
        btn_music = (ImageButton) findViewById(R.id.music_btn);
        btn_SOS = (ImageButton) findViewById(R.id.SOS_btn);
        btn_speedometer = (ImageButton) findViewById(R.id.speed_btn);
        btn_whatsapp = (ImageButton) findViewById(R.id.whatsapp_btn);

        btn_setting = (Button) findViewById(R.id.setting_btn);
        btn_help = (Button) findViewById(R.id.help_btn);

        auto_view = (ImageView) findViewById(R.id.auto_view);

        btn_SOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("es.pymasde.blueterm");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }
            }
        });

        btn_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent messageIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(messageIntent);
            }
        });

        btn_speedometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent speedIntent = getPackageManager().getLaunchIntentForPackage("org.mrchops.android.digihud");
                startActivity(speedIntent);
            }
        });

        btn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicintent = new Intent(MediaStore.INTENT_ACTION_MUSIC_PLAYER);
                startActivity(musicintent);
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent showCallLog = new Intent();
                showCallLog.setAction(Intent.ACTION_VIEW);
                showCallLog.setType(CallLog.Calls.CONTENT_TYPE);
                startActivity(showCallLog);

            }
        });

        auto_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent autoIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.projection.gearhead");
                startActivity(autoIntent);
            }
        });

        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_SETTINGS));
            }
        });
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpIntent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(helpIntent);
            }
        });


       btn_assistant.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "say ok Google! to work", Toast.LENGTH_SHORT).show();
           }
       });

    }
}
