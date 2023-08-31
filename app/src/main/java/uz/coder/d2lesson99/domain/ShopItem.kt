package uz.coder.d2lesson99.domain

data class ShopItem(

    val id:Int,
    var item_name:String,
    var count:Int,
    var enabled:Boolean
) {
}