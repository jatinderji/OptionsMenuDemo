package com.jatin.optionsmenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

/*
STEPS TO CREATE OPTIONS MENU:
    1. Create Menu
    2. Load Menu
    3. Add Listener to handle events
 */
public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.menu_user:
                txtResult.setText("You Clicked User");
                return true;
            case R.id.menu_theme:
                txtResult.setText("You Clicked Theme");
                return true;
            case R.id.menu_settings:
                txtResult.setText("You Clicked Settings");
                return true;
            case R.id.menu_logut:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}