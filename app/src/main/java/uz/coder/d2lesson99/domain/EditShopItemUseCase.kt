package uz.coder.d2lesson99.domain

class EditShopItemUseCase(private var repazitory: ShopItemRepazitory) {

    fun editShopItem(shopItem: ShopItem){
        repazitory.editShopItem(shopItem)
    }
}