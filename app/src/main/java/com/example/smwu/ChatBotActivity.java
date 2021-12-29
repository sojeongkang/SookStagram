package com.example.smwu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smwu.R;

public class ChatBotActivity extends AppCompatActivity {

    private EditText inputForm;
    private TextView result;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        init();
    }

    private void init() {
        inputForm = findViewById(R.id.editText_inputForm);
        result=findViewById(R.id.textView_result);
        send=findViewById(R.id.button_send);

        buttonAction();
    }

    private void buttonAction() {
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String currentData = inputForm.getText().toString();
                String resultData = null;

                if("Most Famous Club?".equals(currentData)) {
                    resultData = "Soccer Club!";
                }
                else{
                    resultData="Chicken";
                }



                result.bringToFront();
                result.setText(resultData);
            }
        });
    }
}