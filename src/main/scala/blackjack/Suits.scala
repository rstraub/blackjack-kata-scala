package blackjack

object Suits extends Enumeration {
  type Suit = Value

  val HEARTS: Suits.Value = Value(4)
  val DIAMONDS: Suits.Value = Value(3)
  val SPADES: Suits.Value = Value(2)
  val CLUBS: Suits.Value = Value(1)
}
