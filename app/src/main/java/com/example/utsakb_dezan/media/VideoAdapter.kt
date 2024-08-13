package com.example.utsakb_dezan.media

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsakb_dezan.R

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class VideoAdapter(private val videoList: List<Video>) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val thumbnailImage: ImageView = itemView.findViewById(R.id.thumbnail_image)
        val title: TextView = itemView.findViewById(R.id.title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val currentVideo = videoList[position]
        holder.thumbnailImage.setImageResource(currentVideo.thumbnailImage)
        holder.title.text = currentVideo.title

        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount() = videoList.size
}

