package ru.itis.summerpractice24.hw_2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice24.hw_2.databinding.ItemCityBinding

class CityHolder(
    private val binding: ItemCityBinding,
    private val glide: RequestManager,
    private val onClick: (City) -> Unit,
) : ViewHolder(binding.root) {

    fun onBind(city:City){
        binding.run{
            tvCity.text = city.name
            tvCountry.text = city.country

            glide
                .load(city.url)
                .error(R.drawable.ic_launcher_background)
                .into(ivImage)

            root.setOnClickListener{
                onClick.invoke(city)
            }
        }

    }
}