package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var binding: FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}