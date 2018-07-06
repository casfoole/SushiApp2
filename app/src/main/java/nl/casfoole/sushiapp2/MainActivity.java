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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.Subject;

public class MainActivity extends Activity {
    Button btn;
    EditText et;
    TextView tv;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button)findViewById(R.id.button);
        et =(EditText)findViewById(R.id.editText);
        tv =(TextView)findViewById(R.id.textView);
        tv2 =(TextView)findViewById(R.id.textView2);

        btn.setOnClickListener(new View.OnClickListener() {

            ArrayList<String> sushis = new ArrayList<String>();

            public void onClick(View v) {
                String name = et.getText().toString();

                String a = "1111";
                String s1 = "Sushi 1";
                String g1 = "10 euro";

                String b = "2222";
                String s2 = "sushi 2";
                String g2 = "10 euro";


                if(name.equals(a)){
//                    tv.setText(s1);
                    tv2.setText(g1);
                    sushis.add(s1);
                }
                else if (name.equals(b)){
                    tv.setText(s2);
                    tv2.setText(g2);
                }

//                int arraySize = sushis.size();
//                for(int i = 0; i < arraySize; i++) {
//                    i = (int)value;
//                    return sushis.get(i);
//                }
            }

        });

    }}