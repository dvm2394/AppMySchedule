package com.example.quanlythoigian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class DangNhap1 extends AppCompatActivity {
    Button btnDangnhap, btnDangky, btnDangnhapwithgoogle;
    CheckBox chkRememberme;
    TextView txtForgotpass;
    EditText edtUsername,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        btnDangnhap = findViewById(R.id.btnDangnhap);
        btnDangky = findViewById(R.id.btnDangky);
        btnDangnhapwithgoogle = findViewById(R.id.btnDangnhapwithgoogle);
        chkRememberme = findViewById(R.id.chkRememberme);
        txtForgotpass = findViewById(R.id.txtForgotpass);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhap1.this, DangKy1.class));
            }
        });
    }
}