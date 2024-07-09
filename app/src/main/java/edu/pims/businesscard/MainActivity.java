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


            }
        });

        editWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        editAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        editEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        editPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        editInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        editFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        editLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






    }


}