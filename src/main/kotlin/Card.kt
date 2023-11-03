class Card(
    val cardType: CardType,
    var cardValue: CardValue
){
    companion object{
        fun generateCards(deckAmount: Int): MutableList<Card> {
            val cardList: MutableList<Card> = mutableListOf()
            val cardValueList:List<CardValue> = listOf(
                CardValue.Ace,
                CardValue.Two,
                CardValue.Three,
                CardValue.Four,
                CardValue.Five,
                CardValue.Six,
                CardValue.Seven,
                CardValue.Eight,
                CardValue.Nine,
                CardValue.Ten,
                CardValue.Jack,
                CardValue.Queen,
                CardValue.King
            )
            for (i in 1..deckAmount)
            cardValueList.forEach{
                cardList.add(Card(CardType.Spades, it))
                cardList.add(Card(CardType.Hearts, it))
                cardList.add(Card(CardType.Clubs, it))
                cardList.add(Card(CardType.Diamonds, it))
            }
            cardList.shuffle()
            return cardList
        }
    }

    override fun toString(): String{
        return " $cardValue of $cardType "
    }
}