package uz.coder.d2lesson99.domain

class GetShopItemListUseCase(private var repazitory: ShopItemRepazitory) {
//intraktor
    fun getShopItemListUseCase():List<ShopItem>{
        return repazitory.getShopItemList()
    }
}