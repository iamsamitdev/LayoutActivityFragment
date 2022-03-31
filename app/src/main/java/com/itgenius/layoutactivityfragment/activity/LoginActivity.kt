package com.itgenius.layoutactivityfragment.activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.itgenius.layoutactivityfragment.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // ทำการ findView
        val btnForgotPass = findViewById<Button>(R.id.btnForgotPass)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        // การใส่ Event Click ให้กับปุ่ม btnForgotPass
        btnForgotPass.setOnClickListener {
            // การส่งเปลี่ยนหน้าจอ (intent)
            val intent = Intent(this, ForgotPassActivity::class.java)
            startActivity(intent)
        }

        // การใส่ Event Click ให้กับปุ่ม btnRegister
        btnRegister.setOnClickListener {
            // การส่งเปลี่ยนหน้าจอ (intent)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}