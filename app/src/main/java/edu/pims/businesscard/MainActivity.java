package edu.pims.businesscard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;




public class MainActivity extends AppCompatActivity {


    int CODE_EDIT_NAME=1;
    int CODE_EDIT_WORK=2;
    int CODE_EDIT_ADDRESS=3;
    int CODE_EDIT_EMAIL=4;
    int CODE_EDIT_PHONE=5;
    int CODE_EDIT_INSTA=6;
    int CODE_EDIT_FB=7;
    int CODE_EDIT_LINKEDIN=8;






    TextView nameTextView, workTextView, addressTextView, emailTextView, phoneTextView,  instaTextView,
            fbTextView, linkedinTextView;


    TextView editName, editWork, editAddress, editEmail, editPhone, editInsta, editFb, editLinkedin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //TextView
        nameTextView = findViewById(R.id.nameText);
        workTextView =findViewById(R.id.professionText);
        addressTextView = findViewById(R.id.addressTextView);
        emailTextView = findViewById(R.id.emailText);
        phoneTextView = findViewById(R.id.contactText);
        instaTextView = findViewById(R.id.instagramText);
        fbTextView = findViewById(R.id.facebookText);
        linkedinTextView = findViewById(R.id.linkedinText);

        //EditTextViews

        editName = findViewById(R.id.editName);
        editWork = findViewById(R.id.editWork);
        editAddress = findViewById(R.id.editAddress);
        editEmail = findViewById(R.id.editEmail);
        editPhone = findViewById(R.id.editPhone);
        editInsta = findViewById(R.id.editInsta);
        editFb = findViewById(R.id.editFb);
        editLinkedin = findViewById(R.id.editLinkedin);



        editName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", nameTextView.getText().toString());

                intent.putExtra("code", 1);


                startActivityForResult(intent, 1);


            }
        });

        editWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", workTextView.getText().toString());

                intent.putExtra("code", 2);


                startActivityForResult(intent, 2);

            }
        });

        editAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", addressTextView.getText().toString());

                intent.putExtra("code", 3);


                startActivityForResult(intent, 3);

            }
        });


        editEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", emailTextView.getText().toString());

                intent.putExtra("code", 4);


                startActivityForResult(intent, 4);

            }
        });



        editPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", phoneTextView.getText().toString());

                intent.putExtra("code", 5);


                startActivityForResult(intent, 5);

            }
        });




        editInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", instaTextView.getText().toString());

                intent.putExtra("code", 6);


                startActivityForResult(intent, 6);

            }
        });


        editFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", fbTextView.getText().toString());

                intent.putExtra("code", 7);


                startActivityForResult(intent, 7);
            }
        });


        editLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);


                intent.putExtra("value", linkedinTextView.getText().toString());

                intent.putExtra("code", 8);


                startActivityForResult(intent, 8);
            }
        });






    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CODE_EDIT_NAME){
            String getValue = data.getStringExtra("edit");


            nameTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_WORK){
            String getValue = data.getStringExtra("edit");

            workTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_ADDRESS){
            String getValue = data.getStringExtra("edit");

            addressTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_EMAIL){
            String getValue = data.getStringExtra("edit");

            emailTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_PHONE){
            String getValue = data.getStringExtra("edit");

            phoneTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_ADDRESS){
            String getValue = data.getStringExtra("edit");

            addressTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_INSTA){
            String getValue = data.getStringExtra("edit");

            instaTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_FB){
            String getValue = data.getStringExtra("edit");

            fbTextView.setText(getValue);
        }
        if(requestCode == CODE_EDIT_LINKEDIN){
            String getValue = data.getStringExtra("edit");

            linkedinTextView.setText(getValue);
        }

    }
}