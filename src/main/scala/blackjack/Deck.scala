package blackjack

import blackjack.Ranks.TWO
import blackjack.Suits.HEARTS

case class Deck(cards: List[Card])

object Deck {
  def unshuffled(): Deck = {
    Deck(List.fill(52)(Card(TWO, HEARTS)))
  }

  def shuffled(): Deck = Deck(List())
}
