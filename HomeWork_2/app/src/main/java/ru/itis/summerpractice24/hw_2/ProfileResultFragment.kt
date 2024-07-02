package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileResultBinding

class ProfileResultFragment : Fragment() {
    private var binding: FragmentProfileResultBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileResultBinding.bind(view)

        val name = arguments?.getString(ARG_NAME) ?: "ERROR"
        val email = arguments?.getString(ARG_EMAIL) ?: "ERROR"
        val age = arguments?.getString(ARG_AGE) ?: "ERROR"

        binding?.run {
            tvTitle.text = "${tvTitle.text} + $name + $email + $age"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_NAME = "ARG_NAME"
        private const val ARG_EMAIL = "ARG_EMAIL"
        private const val ARG_AGE = "ARG_AGE"

        fun bundle(name:String, email: String, birthDate: String): Bundle = Bundle().apply {
            putString(ARG_NAME, name)
            putString(ARG_EMAIL, email)
            putString(ARG_AGE, birthDate)
        }
    }
}