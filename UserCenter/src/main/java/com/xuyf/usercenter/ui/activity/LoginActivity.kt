package com.xuyf.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xuyf.usercenter.R
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mRegister.setOnClickListener{
            toast("沃日你麻麻批")
        }
    }

}
