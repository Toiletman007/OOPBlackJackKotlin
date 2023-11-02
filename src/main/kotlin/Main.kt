fun main() {
    println("How many decks do you want to play with?")
    var amountOfPlayingDecks = readln().toInt()
    val generatedCardList: MutableList<Card> = Card.generateCards(amountOfPlayingDecks)
    println("Amount of decks in use: $amountOfPlayingDecks")
    val player1 = Player()
    player1.takeCard(generatedCardList)
    println(player1.cardList)
}