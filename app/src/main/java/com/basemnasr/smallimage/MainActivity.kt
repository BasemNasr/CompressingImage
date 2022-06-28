package com.basemnasr.smallimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basemnasr.compressimage.BeforeUploadImages
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set original image path
        val originalImagePath = "/originalImagePath"
        val compressedImagePath = BeforeUploadImages()
            .resizeAndCompressImageBeforeSend(this, originalImagePath, File(originalImagePath).name)
    }

}