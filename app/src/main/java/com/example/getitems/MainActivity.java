package com.example.getitems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context ActivityContext = this;

        // Store away the Main Context
       // MainActivityContext = ActivityContext;

        final TextView text = (TextView) findViewById(R.id.text2);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                // your code....
                Context context = view.getContext();
                Intent intent = new Intent(context, ItemModelListActivity.class);
                context.startActivity(intent);

            }
        });
    }
}
