package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.itis.summerpractice24.hw_2.databinding.FragmentDetailsBinding
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileResultBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private var binding: FragmentDetailsBinding?=null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentDetailsBinding.bind(view)

        var list = CityRepository.cities
        val myId = arguments?.getString(ARG_ID)
        val foundItem = list.find {it.id == myId?.toInt()}


        binding?.apply {
            binding!!.tvCountry.text = foundItem!!.country
            binding!!.tvCity.text = foundItem!!.name
            binding!!.tvDescription.text = foundItem!!.description

            Glide.with(this@DetailsFragment)
                .load(foundItem!!.url)
                .into(ivImage)

            buttonReturn.setOnClickListener {
                // Получить NavController для навигации
                val navController = findNavController()

                // Выполнить переход на другой фрагмент с указанным action
                navController.navigate(R.id.action_detailsFragment_to_settingsFragment)
            }
        }

    }

    companion object {

        private const val ARG_ID = "ARG_ID"

        fun bundle(id:String): Bundle = Bundle().apply {
            print("TEST_ID"+id)
            putString(ARG_ID, id)
        }
    }
}