package com.example.numad20f_huixianzhang;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TextView;


// page1 -> page2 -> page3

// page1 -> page2
//       -> page3
//       -> page4




public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        textView = findViewById(R.id.textView3);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "LOL I GOT U!!!!!!hhhh", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//        RadioButton radioButton = findViewById(R.id.radioButton)
//        radioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Pressed: F", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClick(View view)
    {
     int id = view.getId();
     textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton:
                textView.setText("Pressed A");
//                Toast.makeText(getApplicationContext(), "Pressed: A", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.radioButton2:
////                textView.setText("Pressed B");
//                Toast.makeText(getApplicationContext(), "Pressed: B", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.radioButton5:
//                textView.setText("Pressed C");
////                Toast.makeText(getApplicationContext(), "Pressed: C", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.radioButton3:
//                Toast.makeText(getApplicationContext(), "Pressed: D", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.radioButton4:
//                Toast.makeText(getApplicationContext(), "Pressed: E", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.radioButton6:
//                Toast.makeText(getApplicationContext(), "Pressed: F", Toast.LENGTH_SHORT).show();
//                break;

        }

    }
    public void onClickB(View view)
    {
        int id = view.getId();
        textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton2:
                textView.setText("Pressed B");
                break;
        }
    }
    public void onClickC(View view)
    {
        int id = view.getId();
        textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton5:
                textView.setText("Pressed C");
                break;
        }
    }
    public void onClickD(View view)
    {
        int id = view.getId();
        textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton3:
                textView.setText("Pressed E");
                break;
        }
    }
    public void onClickE(View view)
    {
        int id = view.getId();
        textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton4:
                textView.setText("Pressed D");
                break;
        }
    }
    public void onClickF(View view)
    {
        int id = view.getId();
        textView = findViewById(R.id.textView3);
        switch (id) {
            case R.id.radioButton6:
                textView.setText("Pressed F");
                break;
        }
    }

//    Intent intent = new Intent(this, Assign3.class);

    public void onClickAssign3(View view)
    {
        Intent intent = new Intent(this, Assign3.class);
        startActivity(intent);
    }

    public void onClickAssign4(View view)
    {
        Intent intent = new Intent(this, Assign4.class);
        startActivity(intent);
    }

    public void onClickAssign5(View view)
    {
        Intent intent = new Intent(this, Assign5.class);
        startActivity(intent);
    }


}

