package sg.edu.rp.c36.id21028831.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView displayInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        displayInt=findViewById(R.id.displayInt);
        Intent intentReceived=getIntent();
        int value=intentReceived.getIntExtra("value",0);
        displayInt.setText("Integer value received is: "+value);
    }
}