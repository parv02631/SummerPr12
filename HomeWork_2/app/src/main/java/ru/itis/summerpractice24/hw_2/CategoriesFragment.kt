package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.itis.summerpractice24.hw_2.databinding.FragmentCategoriesBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding

class CategoriesFragment : Fragment() {

    private var binding: FragmentCategoriesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCategoriesBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}