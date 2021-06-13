package item

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kok.myapplication.R

/**
 * Author:Khaos
 * Date:2020-11-25
 * Time:15:35
 */
class DividerItem : BaseItemView<Int>() {
  //<editor-fold defaultstate="collapsed" desc="XML">
  override fun layoutResId() = R.layout.item_divider
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="数据填充">
  override fun fillData(holder: RecyclerView.ViewHolder, itemView: View, item: Int) {
    itemView.setBackgroundColor(item)
  }
  //</editor-fold>
}
