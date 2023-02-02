package com.vimal.kotlinmvc

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vimal.kotlinmvc.adapter.ImagesAdapter
import com.vimal.kotlinmvc.controller.ImageListPresenter
import com.vimal.kotlinmvc.view.GridItemDecoration

class MainActivity : AppCompatActivity() {

    private var rvList: RecyclerView? = null
    private var progressDialog: ProgressBar? = null
    private var listAdapter: ImagesAdapter? = null
    private var images: ArrayList<Image> = ArrayList()
    private var presenter: ImageListPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressDialog = findViewById(R.id.progressDialog)
        rvList = findViewById(R.id.rvList)
        rvList!!.layoutManager = GridLayoutManager(this, 2)
        rvList!!.addItemDecoration(GridItemDecoration(10,2))

        listAdapter = ImagesAdapter(this, images = images);
        rvList!!.adapter = listAdapter;

        presenter = ImageListPresenter(this, this)
        progressDialog?.visibility = View.VISIBLE
        presenter!!.fetchImages()
    }

    fun setValues(images: ArrayList<Image>) {
        progressDialog?.visibility = View.GONE
        this.images.clear()
        this.images.addAll(images)
        listAdapter!!.notifyDataSetChanged()

    }

    fun setError(errorMessage: String) {
        progressDialog?.visibility = View.GONE
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
    }
}