package ru.mirea.rakhilovir.multiactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String infoText;

    private final String TAG = MainActivity.class.getSimpleName();

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("fio", "MIREA - Рахилов Игорь Русланович");
        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String infoText = editText.getText().toString();
        intent.putExtra("input", infoText);

        startActivity(intent);
    }

    public void sendMessageButtonClick(View view) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("key", infoText);
        super.onSaveInstanceState(outState);
    }

    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        String text = savedInstanceState.getString("key");

        EditText view = (EditText) findViewById(R.id.editTextTextPersonName);
        view.setText(text);

        super.onRestoreInstanceState(savedInstanceState);
    }

    protected void onRestart() {super.onRestart();}

}