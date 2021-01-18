package com.uas0822

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.LinearLayout
import androidx.appcompat.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import com.uas0822.adapter.MainAdapter
import com.uas0822.data.UserDummy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter(UserDummy.list)
        adapter.onItemClickListener = {
            //Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra("USER",it)
            startActivity(intent)
        }

        recyclerMain.adapter = adapter
        recyclerMain.layoutManager = LinearLayout(this)
        RecyclerMain.addItemDecoration(DividerItemDecoration(this,LinearLayout.VERTICAL))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu?.findItem(R.id.search)?.actionView as SearchView

        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.queryHint = resources.getString(R.string.search_hint)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(this@MainActivity, query, Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
        return super.onCreateOptionsMenu(menu)
    }
}