class Player {
    val cardList: MutableList<Card> = mutableListOf()

    fun takeCard(generatedCardList: List<Card>){
        val card = generatedCardList.last()
        cardList.add(card)
        cardList.remove(card)
    }

}