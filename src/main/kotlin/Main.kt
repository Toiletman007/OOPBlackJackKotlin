fun main() {
    singlePlayer()
}

fun singlePlayer(){
    var B: Int = 0
    var gameEnded: Boolean = false
    println("How many decks do you want to play with?")
    val amountOfPlayingDecks = readln().toInt()
    val generatedCardList: MutableList<Card> = Card.generateCards(amountOfPlayingDecks)
    println("Amount of decks in use: $amountOfPlayingDecks")

    val player1 = Player()
    val dealer = Player()
    player1.takeCard(generatedCardList, 2)
    dealer.takeCard(generatedCardList, 2)
    println("Dealers cards are: ${dealer.cardList} and the total is: ${dealer.points}")
    while (gameEnded == false){
            if (player1.points > 21 && player1.cardList.any { it.cardValue.value == 11 }) {
                println("ACE DETECTED!!!")
                for (i in 0..player1.cardList.size - 1) {
                    if (player1.cardList[i].cardValue.value == 11) {
                        player1.cardList[i].cardValue.value = 1
                        player1.points = player1.points - 10
                        B = player1.cardList[i].cardValue.value
                        println("value changed to 1 and now is ${player1.cardList[i].cardValue.value}")
                    }
                }
            } else if (player1.points > 21) {
                println("You went over 21 with ${player1.points} and ${player1.cardList} and ${B}")
                gameEnded = true
                println("Elif")
                break
            }
        println("Your cards are: ${player1.cardList} and the total is: ${player1.points}")
        println("Do you wanna hit[H], stand[S], Leave[X]")
        when (readln()){
            "H" -> {
                println("You chose Hit!")
                player1.takeCard(generatedCardList, 1)
            }
            "S" -> {
                println("You chose Stay!")
                break
            }
            "X" -> {
                println("You chose to leave!")
                gameEnded = true
                break
            }
        }
        if (player1.points >21){
            println("You went over 21 with ${player1.points} and ${player1.cardList} and ${B}")
            gameEnded = true
            println("non elif")
            break
        }



        if (player1.points == 21 && dealer.points != 21){
            println("You got 21, WINNER!!!")
            gameEnded = true
            break
        }

        if (player1.points == 21 && dealer.points == 21){
            println("Tie, bets returned...")
            gameEnded = true
            break
        }


    }
    while (player1.points <= 21 && gameEnded == false){
        if (dealer.points < 17){
            println("Dealers cards are below 17, [${dealer.points}] so he has to take")
            dealer.takeCard(generatedCardList, 1)
            println("Dealers total is now: ${dealer.points}")
        }
        if (dealer.points > 21){
            println("Dealer went over 21 with [${dealer.points}]")
            println("You win!!! with ${player1.points}")
            gameEnded = true
            break
        }
    }
}

fun multiplayer(){
    TODO("This will be finished in the future")
}