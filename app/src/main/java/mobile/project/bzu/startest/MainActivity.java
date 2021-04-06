package mobile.project.bzu.startest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edita;
    private EditText editb;
    private EditText editc;
    private EditText editd;
    private Spinner spiner;
    private RadioGroup radiogroub;
    private RadioButton radiobutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edita=findViewById(R.id.edit1);
        editb=findViewById(R.id.edit2);
        editc=findViewById(R.id.edit4);
        editd=findViewById(R.id.edit3);
        spiner=findViewById(R.id.spinner);
        radiogroub=findViewById(R.id.groupbo);
        radiobutton1=findViewById(R.id.radio1);
        spineermothed();
    }

    public void maleaction(View view) {
        int radiobuttonid = radiogroub.getCheckedRadioButtonId();
        radiobutton1 =(RadioButton) findViewById(radiobuttonid);
        Toast.makeText(getBaseContext(),radiobutton1.getText(),Toast.LENGTH_LONG).show();


    }
    private void spineermothed() {
        ArrayList<String> aray =new ArrayList<>();
        aray.add("Ramallah");
        aray.add("Nablus");
        aray.add("Jenin");
        aray.add("Al-Khalil");
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,aray);
        spiner.setAdapter(arrayadapter);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void buttons(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        String s1 = edita.getText().toString();
        String s2 = editb.getText().toString();
        String s3 = editc.getText().toString();
        String s4 = editd.getText().toString();
        String s5 =spiner.getSelectedItem().toString().trim();
        String s6 =radiobutton1.getText().toString();
        intent.putExtra("Name",s1);
        intent.putExtra("Age",s2);
        intent.putExtra("Q1",s3);
        intent.putExtra("Q2",s4);
        intent.putExtra("Spinner",s5);
        intent.putExtra("Redio",s6);
        startActivity(intent);

    }
}