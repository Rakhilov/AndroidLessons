package ru.mirea.rakhilovir.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;

    private Button btnWhoAml;

    private Button btnItIsNotMe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnWhoAml = (Button) findViewById(R.id.btnWhoAml);
        btnItIsNotMe = (Button) findViewById(R.id.btnItIsNotMe);
        View.OnClickListener oclbtnWhoAml = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку No 14");
            }
        };
        btnWhoAml.setOnClickListener(oclbtnWhoAml);
        View.OnClickListener oclbtnItIsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Это не я сделал");
            }
        };
        btnItIsNotMe.setOnClickListener(oclbtnItIsNotMe);
    }
    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}