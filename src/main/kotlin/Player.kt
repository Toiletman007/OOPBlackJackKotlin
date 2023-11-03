class Player {
    val cardList: MutableList<Card> = mutableListOf()
    var points: Int = 0
    fun takeCard(generatedCardList: MutableList<Card>, cardAmount:Int){
        for (j in 1..cardAmount){
            val card = generatedCardList.last()
            cardList.add(card)
            points += card.cardValue.value
            generatedCardList.remove(card)
        }
    }





}