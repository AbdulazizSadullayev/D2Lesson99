package uz.coder.d2lesson99.domain

class AddShopItemUseCase(private var repazitory: ShopItemRepazitory) {

    fun addShopItem(shopItem: ShopItem) {
        repazitory.addShopItem(shopItem)
    }
}