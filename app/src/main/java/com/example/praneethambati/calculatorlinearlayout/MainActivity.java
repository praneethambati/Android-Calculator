package com.example.praneethambati.calculatorlinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_tableLayout){
            //TODO: open TableLayout
          //  greetingTV.setText(R.string.say_bye);
            setContentView(R.layout.activity_main1_table);

            return true;
        }
        else if (item.getItemId() == R.id.action_linearLayout) {

            setContentView(R.layout.activity_main_linear);
        }
        else if (item.getItemId() == R.id.action_relativeLayout) {

            setContentView(R.layout.activity_main_relative);
        }
        return super.onOptionsItemSelected(item);
    }
}
