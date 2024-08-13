package com.example.utsakb_dezan.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.utsakb_dezan.R
import com.example.utsakb_dezan.databinding.FragmentProfileBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

    //Dezan Daffa Ramadhan
    //10120270
    //IF-7

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profileImage.setImageResource(R.drawable.image1)

        binding.callButton.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+6285695109861"))
            startActivity(callIntent)
        }

        binding.emailButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:dezan.10120270@mahasiswa.unikom.ac.id"))
            startActivity(emailIntent)
        }

        binding.socialMediaButton.setOnClickListener {
            val socialIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dezand_"))
            startActivity(socialIntent)
        }

        binding.mapButton.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=-7.089684791379549, 107.71529370334045(Rumah Dezan)"))
            startActivity(mapIntent)
        }

        binding.aboutButton.setOnClickListener {
            MaterialAlertDialogBuilder(requireContext())
                .setTitle("About")
                .setMessage("Version 1.0\nDeveloped by Dezan")
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
