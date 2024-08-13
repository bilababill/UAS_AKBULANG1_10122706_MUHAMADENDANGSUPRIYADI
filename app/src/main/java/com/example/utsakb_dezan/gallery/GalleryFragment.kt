package com.example.utsakb_dezan.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.utsakb_dezan.R
import com.example.utsakb_dezan.databinding.FragmentGalleryBinding

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val images = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.ppfriend1,
            R.drawable.ppfriend2,
            R.drawable.ppfriend3,
            R.drawable.java,
            R.drawable.console,
            R.drawable.cover1,
            R.drawable.cover2,
            R.drawable.cover3,
            R.drawable.cover4,
            R.drawable.cover5,
            R.drawable.cover6,
            R.drawable.tumb1,
            R.drawable.tumb2,
            R.drawable.tumb3
        )

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = GalleryAdapter(images) { imageResId ->
            val dialog = ImagePreviewDialogFragment.newInstance(imageResId)
            dialog.show(childFragmentManager, "image_preview")
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
