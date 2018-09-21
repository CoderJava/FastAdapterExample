package com.ysn.fastadapterexample

import android.view.View
import android.widget.TextView
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

class SimpleItem constructor(private val name: String,
                             private val description: String): AbstractItem<SimpleItem, SimpleItem.ViewHolder>() {

    override fun getType(): Int {
        return R.id.fastadapter_sampleitem_id
    }

    override fun getLayoutRes(): Int {
        return R.layout.sample_item
    }

    override fun getViewHolder(v: View): ViewHolder {
        return ViewHolder(v)
    }

    class ViewHolder constructor(itemView: View): FastAdapter.ViewHolder<SimpleItem>(itemView) {

        private var textViewName: TextView? = null

        init {
            textViewName = itemView.findViewById(R.id.text_view_name)
        }

        override fun unbindView(item: SimpleItem) {
            textViewName?.text = ""
        }

        override fun bindView(item: SimpleItem, payloads: MutableList<Any>) {
            textViewName?.text = item.name
        }

    }

}