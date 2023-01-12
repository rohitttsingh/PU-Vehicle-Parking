package com.module.pu_vehicle_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.module.pu_vehicle_app.Model.Users;
import com.module.pu_vehicle_app.Prevalent.Prevalent;

import io.paperdb.Paper;

public class DashboardActivity extends AppCompatActivity {
    String name,mis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#3380cc"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        mis = intent.getStringExtra("mis");

    }

    public void gotomain(View view) {
        Intent intent =  new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("mis",mis);
        startActivity(intent);
    }

    public void gotosearch(View view) {
        startActivity(new Intent(getApplicationContext(),SearchActivity.class));
    }
}