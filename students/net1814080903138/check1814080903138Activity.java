package edu.hzuapps.androidlabs.net1814080903138;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class check1814080903138Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check1814080903138);
        final check1814080903138Activity thisActivity = this;
        Button button = (Button)findViewById(R.id.button_check);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thisActivity, add1814080903138Activity.class);
                thisActivity.startActivity(intent);
            }
        });
    }
}