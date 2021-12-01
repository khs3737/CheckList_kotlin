package com.khs37.checklist.activity

import android.app.Activity
import android.os.Bundle
import com.khs37.checklist.R
import com.khs37.checklist.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.textView.setText("안녕하세요")

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}