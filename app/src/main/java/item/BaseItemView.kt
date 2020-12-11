package item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.drakeet.multitype.ItemViewBinder

abstract class BaseItemView<T> : ItemViewBinder<T, RecyclerView.ViewHolder>() {
    //<editor-fold defaultstate="collapsed" desc="加载XML">
    override fun onCreateViewHolder(inflater: LayoutInflater, parent: ViewGroup) =
        object : RecyclerView.ViewHolder(inflater.inflate(layoutResId(), parent, false)) {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="加载数据">
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: T) = fillData(holder, holder.itemView, item)
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="子类必须重新的方法">
    //xml布局
    @LayoutRes
    protected abstract fun layoutResId(): Int

    //加载数据(传holder主要是为了获得holder.layoutPosition)
    protected abstract fun fillData(holder: RecyclerView.ViewHolder, itemView: View, item: T)
    //</editor-fold>
}