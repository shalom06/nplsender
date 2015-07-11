package com.example.shalom.nplsender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Shalom on 3/23/2015.
 */
public class sendcommand extends Activity {
    EditText command;
    Button send;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendcommand);
        send = (Button) findViewById(R.id.button2);
        command = (EditText) findViewById(R.id.command);

        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String stringcommand = command.getText().toString();
                Toast.makeText(
                        getBaseContext(),
                        stringcommand,
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(),Sender.class);
                intent.putExtra("keyName",stringcommand);
                startActivity(intent);


            }
        });
    }
}
