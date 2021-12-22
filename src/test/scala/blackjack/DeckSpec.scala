package blackjack

import blackjack.Ranks.{ACE, EIGHT, FIVE, FOUR, JACK, KING, NINE, QUEEN, SEVEN, SIX, TEN, THREE, TWO}
import blackjack.Suits.{HEARTS, DIAMONDS, SPADES, CLUBS}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DeckSpec extends AnyFlatSpec with Matchers {
  "deck" should "contain all 52 cards" in {
    val deck = Deck.unshuffled()

    deck.cards should have size 52
    deck.cards should contain allOf(
      Card(TWO, HEARTS),
      Card(THREE, HEARTS),
      Card(FOUR, HEARTS),
      Card(FIVE, HEARTS),
      Card(SIX, HEARTS),
      Card(SEVEN, HEARTS),
      Card(EIGHT, HEARTS),
      Card(NINE, HEARTS),
      Card(TEN, HEARTS),
      Card(JACK, HEARTS),
      Card(QUEEN, HEARTS),
      Card(KING, HEARTS),
      Card(ACE, HEARTS),
      Card(TWO, DIAMONDS),
      Card(THREE, DIAMONDS),
      Card(FOUR, DIAMONDS),
      Card(FIVE, DIAMONDS),
      Card(SIX, DIAMONDS),
      Card(SEVEN, DIAMONDS),
      Card(EIGHT, DIAMONDS),
      Card(NINE, DIAMONDS),
      Card(TEN, DIAMONDS),
      Card(JACK, DIAMONDS),
      Card(QUEEN, DIAMONDS),
      Card(KING, DIAMONDS),
      Card(ACE, DIAMONDS),
      Card(TWO, SPADES),
      Card(THREE, SPADES),
      Card(FOUR, SPADES),
      Card(FIVE, SPADES),
      Card(SIX, SPADES),
      Card(SEVEN, SPADES),
      Card(EIGHT, SPADES),
      Card(NINE, SPADES),
      Card(TEN, SPADES),
      Card(JACK, SPADES),
      Card(QUEEN, SPADES),
      Card(KING, SPADES),
      Card(ACE, SPADES),
      Card(TWO, CLUBS),
      Card(THREE, CLUBS),
      Card(FOUR, CLUBS),
      Card(FIVE, CLUBS),
      Card(SIX, CLUBS),
      Card(SEVEN, CLUBS),
      Card(EIGHT, CLUBS),
      Card(NINE, CLUBS),
      Card(TEN, CLUBS),
      Card(JACK, CLUBS),
      Card(QUEEN, CLUBS),
      Card(KING, CLUBS),
      Card(ACE, CLUBS),
    )
  }
}