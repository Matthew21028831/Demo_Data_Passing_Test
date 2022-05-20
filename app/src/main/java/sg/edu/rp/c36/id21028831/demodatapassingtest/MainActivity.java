package sg.edu.rp.c36.id21028831.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInt;
    Button btnPassChar;
    TextView btnPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt=findViewById(R.id.btnPassInt);
        btnPassChar=findViewById(R.id.btnPassChar);
        btnPassDouble=findViewById(R.id.btnPassDouble);

        btnPassInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("Char",'a');
                startActivity(intent);
            }
        });

        btnPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("Double",99.99);
                startActivity(intent);
            }
        });

    }
}