package blackjack

case class Deck(cards: List[Card])

object Deck {
  val cards: List[Card] = Suits.values.toList.foldRight(List[Card]())((s, l) => {
    val suitCards = Ranks.values.toList.map(Card(_, s))
    l.appendedAll(suitCards)
  })

  def shuffled(): Deck = Deck(List())
}
