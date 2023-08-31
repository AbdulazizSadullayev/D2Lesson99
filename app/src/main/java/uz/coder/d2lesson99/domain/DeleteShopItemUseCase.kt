package uz.coder.d2lesson99.domain

class DeleteShopItemUseCase(private var repazitory: ShopItemRepazitory) {

    fun deleteShopItem(shopItem: ShopItem){
        repazitory.deleteShopItem(shopItem)
    }
}