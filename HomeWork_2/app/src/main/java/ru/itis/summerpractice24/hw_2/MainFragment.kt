package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.itis.summerpractice24.hw_2.databinding.FragmentMainBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}