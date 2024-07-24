package edu.pims.businesscard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {
    public static final int NAME_EDIT_CODE = 1;
    public static final int WORK_EDIT_CODE = 2;
    public static final int ADDRESS_EDIT_CODE = 3;
    public static final int EMAIL_EDIT_CODE = 4;
    public static final int PHONE_EDIT_CODE = 5;
    public static final int INSTA_EDIT_CODE = 6;
    public static final int FB_EDIT_CODE = 7;
    public static final int LINKEDIN_EDIT_CODE = 8;



    EditText editText;
    Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.btnSubmit);

        intent = getIntent();

        String name = intent.getStringExtra("name");
        editText.setText(name);


        receiveData();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int code = intent.getIntExtra("code",0);

                intent.putExtra("edit",editText.getText().toString());

                setResult(code,intent);
                finish();




            }
        });

    }

    void receiveData(){
        String value = intent.getStringExtra("value");
        editText.setText(value);


    }




}