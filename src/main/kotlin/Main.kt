fun main() {
    singlePlayer()
}

fun singlePlayer(){
    var secondWhile: Boolean = true
    var firstWhile: Boolean = true
    println("How many decks do you want to play with?")
    val amountOfPlayingDecks = readln().toInt()
    val generatedCardList: MutableList<Card> = Card.generateCards(amountOfPlayingDecks)
    println("Amount of decks in use: $amountOfPlayingDecks")

    val player1 = Player()
    val dealer = Player()
    player1.takeCard(generatedCardList, 2)
    dealer.takeCard(generatedCardList, 2)
    println("Dealers first card is [ ${dealer.cardList[0]} ] and it's value is: ${dealer.cardList[0].cardValue.value}")
    while (true){
        player1.checkAce21(player1.cardList)
        dealer.checkAce21(dealer.cardList)
        println("Your cards are: ${player1.cardList} and the total is: ${player1.points}")
        println("Do you wanna hit[H], stand[S], Leave[X]")
        when (readln()){
            "H" -> {
                println("You chose Hit!")
                player1.takeCard(generatedCardList, 1)
            }
            "S" -> {
                println("You chose Stand!")
                break
            }
            "X" -> {
                println("You chose to leave!")
                secondWhile = false
                break
            }
        }
        player1.checkAce21(player1.cardList)
        if (player1.points > 21){
            println("You went over 21 with ${player1.points} and ${player1.cardList}")
            secondWhile = false
            break
        }
        if (player1.points == 21 && dealer.points != 21){
            secondWhile = true
        }
    }
    println("Dealers second card is ${dealer.cardList[1]} which has a value of: ${dealer.cardList[1].cardValue.value}")
    println("Dealers cards are now: ${dealer.cardList} and they total to: ${dealer.points}")
    println("--------------------------------------------------------------------------------------------------------------")
    while (dealer.points < 17){
        if (dealer.points < 17){
            println("Dealers cards are below 17, ${dealer.cardList} = ${dealer.points} so he has to take")
            dealer.takeCard(generatedCardList, 1)
            println("Dealers total is now: ${dealer.points}")
            println("And yours is: ${player1.points}")
            println("--------------------------------------------------------------------------------------------------------------")
        }
        if (dealer.points > 21){
            println("Dealer went over 21 with [${dealer.points}]")
            println("You win!!! with: ${player1.points}")
            break
        }
    }
    if (dealer.points < player1.points && player1.points <= 21){
        println("You have won!!! with: ${player1.cardList} which totals to: ${player1.points}")
    }
    if (player1.points == 21 && dealer.points == 21){
        println("Tie, bets returned...")
    }
}

fun MultiPlayer(){
    TODO("This will be finished in the future")
}