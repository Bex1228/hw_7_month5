package com.example.hw_7_month5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_7_month5.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.btn.setOnClickListener {
            JokesService.api.getJokes().enqueue(object : Callback<JokesModel> {
                override fun onResponse(call: Call<JokesModel>, response: Response<JokesModel>) {
                        binding.tvSetup.text = response.body()?.joke?.first()?.setup.toString()
                        binding.tvPunchline.text = response.body()?.joke?.first()?.punchline.toString()
                }
                override fun onFailure(call: Call<JokesModel>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

}