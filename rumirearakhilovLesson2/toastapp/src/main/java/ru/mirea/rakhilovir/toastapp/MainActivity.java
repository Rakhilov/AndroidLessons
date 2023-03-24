package ru.mirea.rakhilovir.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = (EditText) findViewById(R.id.editTextTextPersonName);

        Button btnCount = (Button) findViewById(R.id.button);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fio = editTextName.getText().toString();
                int count = fio.length();
                Toast toast = Toast.makeText(getApplicationContext(),
                        String.format("СТУДЕНТ Рахилов И. Р. ГРУППА-БСБО-17-20 Количество символов - %d", count),
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}