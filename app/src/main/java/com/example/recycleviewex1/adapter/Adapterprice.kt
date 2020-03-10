package com.example.recycleviewex1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewex1.R
import com.example.recycleviewex1.model.Itemname
import kotlinx.android.synthetic.main.item_price.view.*

class Adapterprice(var itemlist:ArrayList<Itemname>):RecyclerView.Adapter<Adapterprice.ItemnameViewHolder>(){
   inner class ItemnameViewHolder (itemView :View):
           RecyclerView.ViewHolder(itemView){
fun binItem(item:Itemname){
    itemView.txtname.text=item.name
    itemView.txtprice.text=item.price
    itemView.txtweight.text=item.weight
    itemView.txtimage.setImageResource(item.image);

}
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemnameViewHolder {
        var view =LayoutInflater.from(parent.context).inflate(R.layout.item_price,parent,false)
        return ItemnameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemlist.size

    }

    override fun onBindViewHolder(holder: ItemnameViewHolder, position: Int) {
    holder.binItem(itemlist[position])

    }

}







    

