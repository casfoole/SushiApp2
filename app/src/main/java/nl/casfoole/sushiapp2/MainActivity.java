package nl.casfoole.sushiapp2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.Subject;

public class MainActivity extends Activity {
    Button btn;
    EditText et;
    EditText et2;
    TextView tv;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.button);
        et =(EditText)findViewById(R.id.editText);
        et2 =(EditText)findViewById(R.id.editText2);
        tv =(TextView)findViewById(R.id.textView);
        tv2 =(TextView)findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {

            ArrayList<String> sushis = new ArrayList<String>();
            int totaal = 0;

            public void onClick(View v) {
                String name = et.getText().toString();
                String value = et2.getText().toString();
                int hoeveelheid = Integer.parseInt(value);

                String a = "1100";
                String s1 = "Sushi 1 - " + 10 + " euro";
                int g1 = 10;

                String b = "1200";
                String s2 = "sushi 2 - " + 7 + " euro";
                int g2 = 7;

                String c = "1300";
                String s3 = "sushi 3 - " + 5 + " euro";
                int g3 = 5;

                String d = "1400";
                String s4 = "sushi 4 - " + 5 + " euro";
                int g4 = 5;

                String e = "1500";
                String s5 = "sushi 5 - " + 7 + " euro";
                int g5 = 7;

                String f = "1600";
                String s6 = "sushi 6 - " + 10 + " euro";
                int g6 = 10;

                String g = "1700";
                String s7 = "sushi 7 - " + 7 + " euro";
                int g7 = 7;

                String h = "1800";
                String s8 = "sushi 8 - " + 5 + " euro";
                int g8 = 5;

                String i = "1900";
                String s9 = "sushi 9 - " + 5 + " euro";
                int g9 = 5;

                String j = "2100";
                String s10 = "sushi 10 - " + 7 + " euro";
                int g10 = 7;

                String k = "2200";
                String s11 = "sushi 11 - " + 10 + " euro";
                int g11 = 10;

                String l = "2300";
                String s12 = "sushi 12 - " + 7 + " euro";
                int g12 = 7;

                String m = "2400";
                String s13 = "sushi 13 - " + 5 + " euro";
                int g13 = 5;

                String n = "2500";
                String s14 = "sushi 14 - " + 5 + " euro";
                int g14 = 5;

                String o = "2600";
                String s15 = "sushi 15 - " + 7 + " euro";
                int g15 = 7;

                String p = "2700";
                String s16 = "sushi 16 - " + 10 + " euro";
                int g16 = 10;

                String q = "2800";
                String s17 = "sushi 17 - " + 7 + " euro";
                int g17 = 7;

                String r = "2900";
                String s18 = "sushi 18 - " + 5 + " euro";
                int g18 = 5;

                String s = "3100";
                String s19 = "sushi 19 - " + 5 + " euro";
                int g19 = 5;

                String t = "3200";
                String s20 = "sushi 20 - " + 7 + " euro";
                int g20 = 7;


                if(name.equals(a)){
                    for (int z = 0; z < hoeveelheid; z++){
                        sushis.add(s1);
                    }
                    for (int z = 0; z < g1 * hoeveelheid; z++){
                        totaal++;
                    }
                }
                else if(name.equals(b)){
                    for (int z = 0; z < hoeveelheid; z++){
                        sushis.add(s2);
                    }
                    for (int z = 0; z < g2 * hoeveelheid; z++){
                        totaal++;
                    }
                }
                else if(name.equals(c)){
                    for (int z = 0; z < hoeveelheid; z++){
                        sushis.add(s3);
                    }
                    for (int z = 0; z < g3 * hoeveelheid; z++){
                        totaal++;
                    }
                }
                else if(name.equals(d)){
                    for (int z = 0; z < hoeveelheid; z++){
                        sushis.add(s4);
                    }
                    for (int z = 0; z < g4 * hoeveelheid; z++){
                        totaal++;
                    }
                }
            }

        });

    }}