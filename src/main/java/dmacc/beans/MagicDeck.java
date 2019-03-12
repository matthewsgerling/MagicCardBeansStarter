package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MagicDeck {
	@Column(name="deck_name")
	private String deckName;
	@Column(name="cards_in_deck")
	private int cardsInDeck;
		
	public MagicDeck() {
		super();
	}
		
		
	public MagicDeck(String dn, int i) {
		super();
		this.deckName = dn;
		this.cardsInDeck = i;
	}
			

	public String getDeckName() {
		return deckName;
	}


	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}


	public int getCardsInDeck() {
		return cardsInDeck;
	}


	public void setCardsInDeck(int cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}


	@Override
	public String toString() {
		return "Deck info [deckName=" + deckName + ", cardsInDeck=" + cardsInDeck + "]";
	}
}