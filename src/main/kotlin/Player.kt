class Player {
    val cardList: MutableList<Card> = mutableListOf()
    private var i:Int = 0
    fun takeCard(generatedCardList: List<Card>){

        val card = generatedCardList[i]
        cardList.add(card)
        generatedCardList[i]
        i+=1
    }
}