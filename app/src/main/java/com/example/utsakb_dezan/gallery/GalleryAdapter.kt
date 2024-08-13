package com.example.utsakb_dezan.gallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.utsakb_dezan.databinding.GalleryItemBinding

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class GalleryAdapter(
    private val images: List<Int>,
    private val clickListener: (Int) -> Unit
) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {

    inner class GalleryViewHolder(private val binding: GalleryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imageResId: Int) {
            binding.imageView.setImageResource(imageResId)
            binding.root.setOnClickListener {
                clickListener(imageResId)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val binding = GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GalleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(images[position])
    }

    override fun getItemCount(): Int = images.size
}
