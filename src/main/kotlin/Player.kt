class Player {
    val cardList: MutableList<Card> = mutableListOf()

    fun takeCard(generatedCardList: List<Card>){
        cardList.add(generatedCardList.last())
    }

}