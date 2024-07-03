package ru.itis.summerpractice24.hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice24.hw_2.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.apply {
            sendDataButton.setOnClickListener {
                when {
                    !editTextName.text.isNullOrEmpty() -> {
                        findNavController().navigate(
                            resId = R.id.action_profileFragment_to_profileResultFragment,
                            args = ProfileResultFragment.bundle(
                                name = editTextName.text.toString(),
                                email = editTextName.text.toString(),
                                birthDate = editTextName.text.toString(),
                            )
                        )
                    }
                    else -> Snackbar.make(root, "To send a text fill in the field", Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}