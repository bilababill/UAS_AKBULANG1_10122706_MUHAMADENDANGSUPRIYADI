package com.example.utsakb_dezan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.utsakb_dezan.databinding.FragmentWalkthroughPageBinding

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class WalkthroughPageFragment : Fragment() {

    private var _binding: FragmentWalkthroughPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWalkthroughPageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_IMAGE_RES = "image_res"
        private const val ARG_TEXT = "text"

        fun newInstance(imageRes: Int, text: String) = WalkthroughPageFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_IMAGE_RES, imageRes)
                putString(ARG_TEXT, text)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            binding.imageWalkthoughView.setImageResource(it.getInt(ARG_IMAGE_RES))
            binding.textView.text = it.getString(ARG_TEXT)
        }
    }
}
