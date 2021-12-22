package blackjack

case class Deck(cards: List[Card])

object Deck {
  val cards: List[Card] = Suits.values.toList.flatMap(s =>
    Ranks.values.toList.map(Card(_, s))
  )

  def shuffled(): Deck = Deck(List())
}
