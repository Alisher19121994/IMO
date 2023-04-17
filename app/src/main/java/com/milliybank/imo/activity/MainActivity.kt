package com.milliybank.imo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.milliybank.imo.R
import com.milliybank.imo.adapter.ChatAdapter
import com.milliybank.imo.model.Chats

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(data())

    }

    private fun data():ArrayList<Chats> {
        val list = ArrayList<Chats>()
        list.add(Chats(R.drawable.holland,"Holland",9))
        list.add(Chats(R.drawable.holland,"Holland",7))
        list.add(Chats(R.drawable.holland,"Holland",12))
        list.add(Chats(R.drawable.holland,"Holland",0))
        list.add(Chats(R.drawable.holland,"Holland",0))
        list.add(Chats(R.drawable.holland,"Holland",6))
        list.add(Chats(R.drawable.holland,"Holland",-6))
        list.add(Chats(R.drawable.holland,"Holland",9))
        list.add(Chats(R.drawable.holland,"Holland",7))
        list.add(Chats(R.drawable.holland,"Holland",12))
        list.add(Chats(R.drawable.holland,"Holland",0))
        list.add(Chats(R.drawable.holland,"Holland",0))
        list.add(Chats(R.drawable.holland,"Holland",6))
        list.add(Chats(R.drawable.holland,"Holland",-6))
        return list
    }

    private fun refreshAdapter(data: ArrayList<Chats>) {
        val adapter = ChatAdapter(data)
        recyclerView.adapter = adapter
    }
}