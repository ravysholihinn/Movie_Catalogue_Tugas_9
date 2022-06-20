package com.ravysholihin.moviecatalogue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var movies: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        movies = intent.getParcelableExtra(EXTRA_DATA)
        release_date.text =movies?.release_date
        original_language.text =movies?.original_language
        overview.text =movies?.overview
        tv_title.text = movies?.title
        Glide.with(img_poster).load(IMAGE_BASE + movies!!.poster_path).into(img_poster)
    }
}