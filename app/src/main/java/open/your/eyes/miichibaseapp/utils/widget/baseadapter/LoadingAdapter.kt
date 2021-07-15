package open.your.eyes.miichibaseapp.utils.widget.baseadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import open.your.eyes.miichibaseapp.R
import open.your.eyes.miichibaseapp.utils.printLog

/**
 * Created by OpenYourEyes on 4/6/21
 */
class LoadingAdapter : RecyclerView.Adapter<LoadingAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_load_more, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
    }
}