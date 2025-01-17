package com.example.quanlythoigian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DangNhap1 extends AppCompatActivity {
    Button btnDangnhap, btnDangky, btnDangnhapwithgoogle;
    CheckBox chkRememberme;
    TextView txtForgotpass;
    EditText edtUsername, edtPassword;

    TKMKDao nddao;

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
        nddao = new TKMKDao(getApplicationContext());


        btnDangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhap1.this, DangKy1.class));
            }
        });

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUsername.getText().toString();
                String pass = edtPassword.getText().toString();
                if (TextUtils.isEmpty(user)) {
                    Toast.makeText(DangNhap1.this, "Vui lòng nhập tên đăng nhập", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(pass)) {
                    Toast.makeText(DangNhap1.this, "Vui lòng nhập mật khẩu", Toast.LENGTH_SHORT).show();
                } else {
                    if (nddao.checklogin(user, pass)) {
                        Toast.makeText(DangNhap1.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        clear();
                        startActivity(new Intent(DangNhap1.this, TrangChu.class));
                    } else {
                        Toast.makeText(DangNhap1.this, "Sai username hoặc password!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        txtForgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhap1.this, QuenMatKhau.class));
            }
        });

    }

    public void clear() {
        edtUsername.setText("");
        edtPassword.setText("");
        edtUsername.clearFocus();
        edtPassword.clearFocus();
    }
}