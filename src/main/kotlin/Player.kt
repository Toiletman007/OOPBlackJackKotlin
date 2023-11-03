class Player {
    val cardList: MutableList<Card> = mutableListOf()
    private var i:Int = 0
    fun takeCard(generatedCardList: List<Card>, cardAmount:Int){
        for (j in 1..cardAmount){
        var card = generatedCardList[i]
        cardList.add(card)
        generatedCardList[i]
        i+=1}
    }
}