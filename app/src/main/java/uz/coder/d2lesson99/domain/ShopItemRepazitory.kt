package uz.coder.d2lesson99.domain

interface ShopItemRepazitory {

    fun addShopItem(shopItem: ShopItem)


    fun editShopItem(shopItem: ShopItem)


    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItemList():List<ShopItem>

    fun getShopItemById(id:Int):ShopItem

}