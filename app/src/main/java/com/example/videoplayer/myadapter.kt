package com.example.videoplayer

import android.content.Context
import android.media.session.MediaController
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.videoplayer.myadapter.ViewHolder

class myadapter(val list:ArrayList<String>,val md:android.widget.MediaController):RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder(item: View):RecyclerView.ViewHolder(item){

    val vd =item.findViewById<VideoView>(R.id.vedio)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val v =LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cru =list[position]

            md.setAnchorView(holder.vd)
            holder.vd.setMediaController(md)
            holder.vd.setVideoPath(cru)
            holder.vd.requestFocus()
            holder.vd.start()

    }

    override fun getItemCount(): Int {
        return list.size
    }
}