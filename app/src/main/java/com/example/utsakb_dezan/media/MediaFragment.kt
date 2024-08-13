package com.example.utsakb_dezan.media

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utsakb_dezan.R
import com.example.utsakb_dezan.databinding.FragmentMediaBinding

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class MediaFragment : Fragment() {

    private lateinit var binding: FragmentMediaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMediaBinding.inflate(inflater, container, false)

        val musicList = listOf(
            Music("A Little Piece Of Heaven", "Avenged Sevenfold", R.drawable.cover1),
            Music("Who I Am", "Alan Walker", R.drawable.cover2),
            Music("What I've Done", "Linkin Park", R.drawable.cover3),
            Music("Wake Me Up When September Ends", "Green Day", R.drawable.cover4),
            Music("It's My Life", "Bon Jovi", R.drawable.cover5),
            Music("The Chosen One", "Maher Zain", R.drawable.cover6)

        )

        val videoList = listOf(
            Video("Avenged Sevenfold - A Little Piece Of Heaven", "https://www.youtube.com/watch?v=KVjBCT2Lc94", R.drawable.tumb1),
            Video("Alan Walker - Who I Am", "https://www.youtube.com/watch?v=ccu6JuC21rk", R.drawable.tumb2),
            Video("Maher Zain - The Chosen One", "https://www.youtube.com/watch?v=QbICjWI7Vrw", R.drawable.tumb3)
        )

        binding.recyclerViewMusic.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewMusic.adapter = MusicAdapter(musicList)

        binding.recyclerViewVideo.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewVideo.adapter = VideoAdapter(videoList)

        return binding.root
    }
}
