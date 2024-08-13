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

class MusicAdapter(private val musicList: List<Music>) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val coverImage: ImageView = itemView.findViewById(R.id.cover_image)
        val title: TextView = itemView.findViewById(R.id.title)
        val artist: TextView = itemView.findViewById(R.id.artist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val currentMusic = musicList[position]
        holder.coverImage.setImageResource(currentMusic.coverImage)
        holder.title.text = currentMusic.title
        holder.artist.text = currentMusic.artist
    }

    override fun getItemCount() = musicList.size
}
