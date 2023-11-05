class Player {
    val cardList: MutableList<Card> = mutableListOf()
    var points: Int = 0
    fun takeCard(generatedCardList: MutableList<Card>, cardAmount: Int) {
        for (j in 1..cardAmount) {
            val card = generatedCardList.last()
            cardList.add(card)
            points += card.cardValue.value
            generatedCardList.remove(card)
        }
    }

    fun CheckAce21(playerCardList: MutableList<Card>) {
        for (i in 0..playerCardList.size - 1) {
            if (points > 21 && playerCardList.any { it.cardValue.value == CardValue.Ace.value }) {
                for (i in 0..playerCardList.size - 1) {
                    if (playerCardList[i].cardValue.value == 11) {
                        playerCardList[i].cardValue.value = 1
                        points -= 10
                        println("Ace value changed to ${playerCardList[i].cardValue.value}")
                    }
                }
            }
        }
    }
}