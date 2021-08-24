package com.dts.dsimagepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dts.dsimagepickerlibrary.CropImage
import com.dts.dsimagepickerlibrary.CropImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CropImage.activity(null)
            .setFixAspectRatio(true)
            .setAspectRatio(1, 1)
            .setRequestedSize(500, 500)
            .setAllowRotation(false)
            .setAllowFlipping(false)
            .setGuidelines(CropImageView.Guidelines.ON)
            .start(this)
        finish()
    }
}