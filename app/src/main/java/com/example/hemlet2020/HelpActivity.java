package com.example.hemlet2020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    TextView help_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        help_txt= (TextView) findViewById(R.id.txt);

        String para ="Helmet 2020 is a companion app for the helmet\n."+
        "It connects the helmet to the mobile,and mirrors the mobile display on to the projector screen in the helmet\n."+
        "\n"+
        "Features:\n"+
        "1.Speedometer(speedometer icon)\n"+
        "     - Diplays speed,trip meter,speed limit and overspeeding warning).\n"+
        "2.Android Auto (Circular helmet image at the center)\n"+
        "     - Displays the notifications including navigation,music,whatsapp messages,calls,and messages.\n"+
        "     - navigation using Google Maps.\n"+
        "     - Music (All major music apps supported)\n"+
        "3.Contact button(Call icon)\n"+
        "     - Displays the recent call list.\n"+
        "4.Whatsapp(Whatsapp icon)\n"+
        "     - Redirects to the whatsapp application.\n"+
        "5.Android Assistant -Say 'OK Google' catchphrase to activate it\n"+
        "6.SOS\n"+
        "     - On detecting crash, the app sends an SOS to specified contacts.\n"+
        "Contact Us at - \n"+
        "7204787088"+
        "https://louizinnovations.com";

        help_txt.setText(para);
        help_txt.setMovementMethod(new ScrollingMovementMethod());

    }
}
