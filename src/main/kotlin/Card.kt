class Card(val cardType: CardType,
           var cardValue: CardValue
) {
    companion object{
        fun generateCards(): MutableList<Card> {
            val cardList:MutableList<Card> = mutableListOf()
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
        return "Card(cardType=$cardType, cardValue=$cardValue)"
    }
}
