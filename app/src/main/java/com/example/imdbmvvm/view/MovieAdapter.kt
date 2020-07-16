package com.example.imdbmvvm.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdbmvvm.R
import com.example.imdbmvvm.model.Movie
import kotlinx.android.synthetic.main.row_movie.view.*

class movieAdapter(private var movies:List<Movie>):RecyclerView.Adapter<movieAdapter.MViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_movie, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        //render
        vh.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun update(data:List<Movie>){
        movies= data
        notifyDataSetChanged()
    }

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val textViewName:TextView = view.textViewName
        private val textViewDate:TextView = view.ReleaseYear
        private val imageView:ImageView = view.imageView
        fun bind(movie:Movie){
            textViewName.text = movie.original_title
            textViewDate.text = movie.release_date
            Glide.with(imageView.context).load("https://image.tmdb.org/t/p/original" + movie.poster_path).into(imageView)
        }
    }
}