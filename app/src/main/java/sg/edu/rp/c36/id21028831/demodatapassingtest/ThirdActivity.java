package sg.edu.rp.c36.id21028831.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView displayChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        displayChar=findViewById(R.id.displayChar);

        Intent intentReceived=getIntent();
        char value=intentReceived.getCharExtra("Char", 'a');
        displayChar.setText("Character value received is: "+value);
    }
}