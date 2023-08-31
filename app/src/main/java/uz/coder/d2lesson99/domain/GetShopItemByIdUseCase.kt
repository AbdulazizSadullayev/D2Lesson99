package uz.coder.d2lesson99.domain

class GetShopItemByIdUseCase(private var repazitory: ShopItemRepazitory) {

    fun getShopItemByIdUseCase(id:Int):ShopItem{
        return repazitory.getShopItemById(id)
    }
}