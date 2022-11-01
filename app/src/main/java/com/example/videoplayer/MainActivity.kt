package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.net.toUri
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.io.File

class MainActivity : AppCompatActivity() {
    private lateinit var RecyclerView:RecyclerView
   // private var arr=ArrayList<String>()

  private lateinit var vde:VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        val mediaController = MediaController(this)

        val arr =ArrayList<String>()
        arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/nature5.mp4?alt=media&token=5bf8d1f6-3de7-4078-92af-600b56643b10")
        arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/nature3.mp4?alt=media&token=f9c399b7-0f0b-4253-9018-2161ab86374f")
        //  arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/nature4.mp4?alt=media&token=ad61e2e0-492a-4a18-b54f-fed8ad0199ed")
    arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/newvedio.mp4?alt=media&token=c9032619-f696-4628-8f5c-6fd5b54f0b72")
       // arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/fullscreensunrise.mp4?alt=media&token=9e78e5cf-1d95-42ce-a7e7-b2160696fbb1")
     // arr.add("https://firebasestorage.googleapis.com/v0/b/video-player-ee65e.appspot.com/o/fullscreensunrise.mp4?alt=media&token=9e78e5cf-1d95-42ce-a7e7-b2160696fbb1")
       RecyclerView =findViewById(R.id.recycler)
        RecyclerView.layoutManager =LinearLayoutManager(this)
        val madapter =myadapter(arr,mediaController)
      RecyclerView.adapter =madapter


    }


}