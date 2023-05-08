package com.firstapp.remitbee_login


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.etemail
import kotlinx.android.synthetic.main.activity_main.etpassword
import kotlinx.android.synthetic.main.activity_main.loginbtn

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginbtn.setOnClickListener{
            //get values from input button
            val email = etemail.text.toString().trim()
            val password = etpassword.text.toString().trim()
            //validation
            if (email.isEmpty())
            {
                etemail.error="Enter your email address"
                etemail.requestFocus()
            }else if(password.isEmpty()){
                etpassword.error="Enter your Password"
                etpassword.requestFocus()
            }else
            {
//                Toast.makeText(, succesfuly login"", Toast.LENGTH_SHORT).show()
            }
        }

    }
}