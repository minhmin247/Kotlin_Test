package com.raywenderlich.favoritemovies

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

private const val MAX_VALUE = 20

class MoviesPagerAdapter(fragmentManager: FragmentManager, private val movies: ArrayList<Movie>) :
        FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return MovieFragment.newInstance(movies[position % movies.size])
    }

    override fun getCount(): Int {
        return movies.size * MAX_VALUE
    }

    override fun getPageTitle(position: Int): CharSequence {
        return movies[position % movies.size].title
    }
}