package ru.itis.summerpractice24.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import ru.itis.summerpractice24.myapplication.databinding.ActivityMainBinding
import ru.itis.summerpractice24.myapplication.race.Race

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initViews()
    }

    private fun initViews() {
        viewBinding.let { binding ->
            binding.button.setOnClickListener {
                val inputText = binding.editText.text.toString()
                if (inputText.isNotEmpty() && inputText.isDigitsOnly()) {
                    val fakeRace = Race()
                    fakeRace.race(inputText.toInt())

                    Toast.makeText(this, "Car", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Пожалуйста, введите число", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}