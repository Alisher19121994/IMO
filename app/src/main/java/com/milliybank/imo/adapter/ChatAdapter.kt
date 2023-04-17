package com.milliybank.imo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.milliybank.imo.R
import com.milliybank.imo.model.Chats

class ChatAdapter(var list: ArrayList<Chats>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chats: Chats = list[position]
        if (holder is ChatViewHolder) {
            holder.profileImage.setImageResource(chats.profileImage)
            holder.fullname.text = chats.fullName
            holder.count.text = chats.count.toString()


            if (chats.count > 0) {
                holder.linearLayout.visibility = View.VISIBLE
            }else{
                holder.linearLayout.visibility = View.GONE
            }
        }
    }


    inner class ChatViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var profileImage: ShapeableImageView = view.findViewById(R.id.profileImage_id)
        var fullname: TextView = view.findViewById(R.id.fullname_id)
        var count: TextView = view.findViewById(R.id.count_id)
        var linearLayout: LinearLayout = view.findViewById(R.id.linearLayout)


    }
}