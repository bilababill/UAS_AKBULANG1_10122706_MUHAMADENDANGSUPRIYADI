package com.example.utsakb_dezan.gallery

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.utsakb_dezan.databinding.FragmentImagePreviewBinding

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class ImagePreviewDialogFragment : DialogFragment() {

    private var _binding: FragmentImagePreviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = FragmentImagePreviewBinding.inflate(layoutInflater)
        val dialog = Dialog(requireContext())
        dialog.setContentView(binding.root)

        val imageResId = requireArguments().getInt(ARG_IMAGE_RES_ID)
        binding.imageView.setImageResource(imageResId)

        binding.closeButton.setOnClickListener {
            dismiss()
        }

        return dialog
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_IMAGE_RES_ID = "image_res_id"

        fun newInstance(imageResId: Int): ImagePreviewDialogFragment {
            val fragment = ImagePreviewDialogFragment()
            val args = Bundle()
            args.putInt(ARG_IMAGE_RES_ID, imageResId)
            fragment.arguments = args
            return fragment
        }
    }
}
