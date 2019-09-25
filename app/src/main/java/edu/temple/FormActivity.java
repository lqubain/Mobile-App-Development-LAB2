package edu.temple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passEditText;
    private EditText passConfEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.nameInput);
        emailEditText = (EditText) findViewById(R.id.emailInput);
        passEditText = (EditText) findViewById(R.id.passwordInput);
        passConfEditText = (EditText) findViewById(R.id.confirmPasswordInput);

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameEditText.getText().toString()!=null && emailEditText.getText().toString()!=null && passEditText.getText().toString()!=null && passConfEditText.getText().toString()!=null){
                    final String name = nameEditText.getText().toString();
                    final String email = emailEditText.getText().toString();
                    final String pass;
                    if (passEditText.getText().toString().equals(passConfEditText.getText().toString())){
                        pass =  passEditText.getText().toString();
                    } else  Toast.makeText(getApplicationContext(),"Passwords do not match",Toast.LENGTH_SHORT).show();

                } else Toast.makeText(getApplicationContext(),"Please enter all information",Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(),"Username: "+nameEditText.getText().toString() ,Toast.LENGTH_SHORT).show();
            }
        });

    }


}
