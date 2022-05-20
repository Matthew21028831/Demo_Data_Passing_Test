package sg.edu.rp.c36.id21028831.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView displayDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        displayDouble=findViewById(R.id.displayDouble);
        Intent intentReceived=getIntent();
        double value=intentReceived.getDoubleExtra("Double", 99.99);
        displayDouble.setText("Double value received is: "+value);

    }
}