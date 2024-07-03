package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private var binding: FragmentSettingsBinding? = null
    private var adapter: CityAdapter?=null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        initAdapter()
    }

    private fun initAdapter(){
        adapter = CityAdapter(
            list = CityRepository.cities,
            glide = Glide.with(this@SettingsFragment),
            onClick={city ->
                findNavController().navigate(
                    resId = R.id.action_settingsFragment_to_detailsFragment,
                    args = DetailsFragment.bundle(
                        id = city.id.toString()
                    )
                )
            }
        )
        binding?.run{
            rvCity.adapter = adapter
            rvCity.layoutManager = LinearLayoutManager(requireContext())
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}