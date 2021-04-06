package mobile.project.bzu.startest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        String s1 = intent.getStringExtra("Name");
        String s2 = intent.getStringExtra("Age");
        String s3 = intent.getStringExtra("Q1");
        String s4 = intent.getStringExtra("Q2");
        String s5 = intent.getStringExtra("Spinner");
        String s6 = intent.getStringExtra("Redio");
        TextView txt1 =findViewById(R.id.textView3);
        TextView txt2 =findViewById(R.id.textView8);
        TextView txt3 =findViewById(R.id.textView9);
        TextView txt4 =findViewById(R.id.textView10);
        TextView txt5 =findViewById(R.id.textView11);
        TextView txt6 =findViewById(R.id.textView13);
        txt1.setText(s1);
        txt2.setText(s2);
        txt3.setText(s6);
        txt4.setText(s5);
       txt5.setText(s3);
       txt6.setText(s4);
    }
}