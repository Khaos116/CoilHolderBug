package com.kok.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.drakeet.multitype.MultiTypeAdapter
import item.DividerItem
import item.GirlItem
import kotlinx.android.synthetic.main.activity_main.mainRecycler

class MainActivity : AppCompatActivity() {

  private val multiTypeAdapter = MultiTypeAdapter()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    initData()
  }

  private fun initData() {
    val urls = mutableListOf(
        "http://gank.io/images/f4f6d68bf30147e1bdd4ddbc6ad7c2a2",
        "http://gank.io/images/dc75cbde1d98448183e2f9514b4d1320",
        "http://gank.io/images/6b2efa591564475fb8bc32291fb0007c",
        "http://gank.io/images/d6bba8cf5b8c40f9ad229844475e9149",
        "http://gank.io/images/9fa43020cf724c69842eec3e13f6d21c",
        "http://gank.io/images/d237f507bf1946d2b0976e581f8aab9b",
        "http://gank.io/images/25d3e3db2c1248bb917c09dc4f50a46f",
        "http://gank.io/images/19c99c447e0a40a6b3ff89951957cfb1",
        "http://gank.io/images/f0c192e3e335400db8a709a07a891b2e",
        "http://gank.io/images/bdb35e4b3c0045c799cc7a494a3db3e0",
        "http://gank.io/images/92989b6a707b44dfb1c734e8d53d39a2",
        "http://gank.io/images/6e57b254da79416bbe58248b570ea85f",
        "http://gank.io/images/3fdbaffdf3374578a82313621123dace",
        "http://gank.io/images/fb1c315d54e1413494223aca31a9c47c",
        "http://gank.io/images/f08e8ab6030d41a0ada3e6cecea0e60c",
        "http://gank.io/images/f12526b3e9654a47842db6ce21222874",
        "http://gank.io/images/e92911f5ff9446d5a899b652b1934b93",
        "http://gank.io/images/ccf0316264d245018fc651cffa6e90de",
        "http://gank.io/images/e0b652d2a0cb46ba888a935c525bd312",
        "http://gank.io/images/9fb66f5c4a214b26be6e0218b93bdf46",
        "http://gank.io/images/95ddb01b6bd34a85aedfda4c9e9bd003",
        "http://gank.io/images/5fe5b1e9168d4a8a8f6f4e0acefef8f5",
        "http://gank.io/images/f7b320f1a89a4aaebadb1922c2a7a368",
        "http://gank.io/images/80d2906331444e658aa876f5d4355f70",
        "http://gank.io/images/d5c0dc1618194a65b928c932dd2de3a7",
        "http://gank.io/images/291ee91a554f4cd88bf9a09a9fa2e95e",
        "http://gank.io/images/b25e97747ed041fbb7a11f59f7fed5da",
        "http://gank.io/images/31f485fdc49047f6883f52b73ac102aa",
        "http://gank.io/images/4817628a6762410895f814079a6690a1",
        "http://gank.io/images/0f536c69ada247429b8a9e38d3dba8bb",
        "http://gank.io/images/5cc0fd124d2443448b6156284720707c",
        "http://gank.io/images/1a515f1508e345e2bf24673c2c2d50c4",
        "http://gank.io/images/f9523ebe24a34edfaedf2dd0df8e2b99",
        "http://gank.io/images/2c924db2a1b84c5d8fdb9f8c5f6d1b71",
        "http://gank.io/images/4002b1fd18544802b80193fad27eaa62",
        "http://gank.io/images/5a29ab0fc093408c82febe7c7e42e156",
        "http://gank.io/images/a2d3115b8d464d93933e79e88af03580",
        "http://gank.io/images/fae111696a8b418297833324ff93bd1a",
        "http://gank.io/images/c6d3b2b6b5e24e1cbf576946dbec5907",
        "http://gank.io/images/e941fa5d2cfb4a8297128178c371908c",
        "http://gank.io/images/28fc02e86d584ff08802c8dcd9535b35",
        "http://gank.io/images/8a9837115fb64d22b0484e3d4c4cab50",
        "http://gank.io/images/5888858f49bd4608b12633115687ddc3",
        "http://gank.io/images/65c8ea426cc7423987692872968c25b9",
        "http://gank.io/images/1c5cebd307fd49eaa75b368b11118b61",
        "http://gank.io/images/6368ae2770414162819aba90f251cf08",
        "http://gank.io/images/e831e004436f4fffb657a77aef48b9ca",
        "http://gank.io/images/6f1708af33d647f3809ea551e18894ce",
        "http://gank.io/images/341ecaacdd7d4cc09cd0de100f3eab46",
        "http://gank.io/images/7878d08eb776401a85deeb203372665c",
        "http://gank.io/images/7f64754ca07e4af3a242399fd37c2432",
        "http://gank.io/images/cdd7031fa92d40e18a715035b686b4c4",
        "http://gank.io/images/58389e1189534e1cb75b7a788f6b8a86",
        "http://gank.io/images/9770422c45294684af50f725049d7c07",
        "http://gank.io/images/54fc1a56dbc44b52b23714030a457a1b",
        "http://gank.io/images/0fdac44dada5489b85049a3f3fb7fd85",
        "http://gank.io/images/79f717dc495645dfb4e9c43f4674fa30",
        "http://gank.io/images/e6b78c1949d5438fa37ff2f272e5f1d0",
        "http://gank.io/images/a0388326c2b04aa1a58aa956276c40e3",
        "http://gank.io/images/e343db89daff4937b28e82a275024cf7",
        "http://gank.io/images/367c59cb861044e4af2835b2d46988d0",
        "http://gank.io/images/624ade89f93f421b8d4e8fafd86b1d8d",
        "http://gank.io/images/b140f015a16e444aad6d76262f676a78",
        "http://gank.io/images/b0f73f9527694f44b523ff059d8a8841",
        "http://gank.io/images/882afc997ad84f8ab2a313f6ce0f3522",
        "http://gank.io/images/e0088b6b0773408bace28e102af9f8ee",
        "http://gank.io/images/be3c70b17f364596b25f301a55164882",
        "http://gank.io/images/5ba77f3415b44f6c843af5e149443f94",
        "http://gank.io/images/bdd1fb6886744bc9838a1b85495a99f7",
        "http://gank.io/images/5cf42ab5cb7a41aca3c0f5188f5690a5",
        "http://gank.io/images/e56da642238a43c4971f12d4e3395f30",
        "http://gank.io/images/04d6b8ee9e964c04877da65b43952e89",
        "http://gank.io/images/50e3dd62dd9e4b0db957b3c5e296d6b1",
        "http://gank.io/images/21c417e3a84842bfa585dee686f6b992",
        "http://gank.io/images/f8c5ce6fd1b94686a68a7d74f552cf65",
        "http://gank.io/images/94c30acee68340278dfc58e948109ab9",
        "http://gank.io/images/59019eedff4540cd88c96cb96937465f",
        "http://gank.io/images/4d2825dcb5d04d149e6a3620833449c4",
        "http://gank.io/images/d449165e9f434a60afafa47bd4167d57",
        "http://gank.io/images/848c46c369174224aab4a80cab2b3261",
        "http://gank.io/images/1d47d22e27884f7cac2a7e88a38993bf",
        "http://gank.io/images/1af9d69bc60242d7aa2e53125a4586ad",
        "http://gank.io/images/b90db096a8a14e86a373222e87917c68",
        "http://gank.io/images/95207edc08ed4cf0890b4cc4a02ccac9",
        "http://gank.io/images/7fa98787d009465a9d196fbff6b0a5d7",
        "http://gank.io/images/3e4423173d0a4c5e8447c0335b4458fc",
        "http://gank.io/images/aebca647b3054757afd0e54d83e0628e",
        "http://gank.io/images/89c170bf253346d98240d456cbc1c688",
        "http://gank.io/images/02eb8ca3297f4931ab64b7ebd7b5b89c",
        "http://gank.io/images/3a1997f4ecfb4a65ad84692fea3123bf",
        "http://gank.io/images/2e75774eac3f497caca35b3de7c50a42",
        "http://gank.io/images/ce66aa74d78f49919085b2b2808ecc50",
        "http://gank.io/images/28ff615f01f5400f97a7ce6c085ddf11",
        "http://gank.io/images/aa3be1436248473996790a89f6583e04",
        "http://gank.io/images/2b713742032c4b38a604389a22285a53",
        "http://gank.io/images/31f92f7845f34f05bc10779a468c3c13",
    )
    val items = mutableListOf<Any>()
    urls.forEach {
      items.add(it)
      items.add(Color.RED)
    }
    items.removeLast()
    multiTypeAdapter.register(GirlItem())
    multiTypeAdapter.register(DividerItem())
    mainRecycler.adapter = multiTypeAdapter
    mainRecycler.layoutManager = LinearLayoutManager(this)
    multiTypeAdapter.items = items
    multiTypeAdapter.notifyDataSetChanged()
  }
}