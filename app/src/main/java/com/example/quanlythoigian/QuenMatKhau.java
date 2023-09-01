package com.example.quanlythoigian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuenMatKhau extends AppCompatActivity {

    EditText edtQuenMatKhau;
    Button btnGui;
    TextView txtBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quen_mat_khau);
        edtQuenMatKhau = findViewById(R.id.edtQuenMatKhau);
        btnGui = findViewById(R.id.btnGui);
        txtBack = findViewById(R.id.txtBack);

        txtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuenMatKhau.this, DangNhap1.class));
            }
        });
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuenMatKhau.this, "Hệ thống đang gửi thông tin về cho bạn, vui lòng kiểm tra.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}