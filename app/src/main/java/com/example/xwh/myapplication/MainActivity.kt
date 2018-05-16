package com.example.xwh.myapplication

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.navigation.*
import androidx.navigation.fragment.NavHostFragment
import io.reactivex.rxkotlin.toObservable
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        if (v == null) return
    }

    override fun onSupportNavigateUp() =
            Navigation.findNavController(
                    this, R.id.fragmentNavigation
            ).navigateUp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}