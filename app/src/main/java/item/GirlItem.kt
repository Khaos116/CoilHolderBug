package item

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.kok.myapplication.R
import kotlinx.android.synthetic.main.item_girl.view.itemGirlIv

/**
 * Author:CASE
 * Date:2020-11-25
 * Time:15:41
 */
class GirlItem() : BaseItemView<String>() {
  //<editor-fold defaultstate="collapsed" desc="XML">
  override fun layoutResId() = R.layout.item_girl
  //</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="数据填充">
  override fun fillData(holder: ViewHolder, itemView: View, item: String) {
    itemView.itemGirlIv.load(item) {
      placeholder(R.drawable.loading_720_v)
      error(R.drawable.error_720_v)
    }
  }
  //</editor-fold>
}