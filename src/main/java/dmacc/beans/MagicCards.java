package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="cards")
public class MagicCards {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cardid")
	private int id;
	
	@Column(name="card_name")
	private String name;
	
	@Column(name="card_type")
	private String type;
	
	@Column(name="manacost")
	private int manacost;
	
	@Column(name="card_attack")
	private int attack;
	
	@Column(name="card_defence")
	private int defence;
	
	@Autowired
	private MagicDeck deck; 

	
	public MagicCards( ) {
		super();
		
	}

	public MagicCards(String name, String type, int cost, int attack, int defence) {
		super();
		this.name = name;
		this.type = type;
		this.manacost = cost;
		this.attack = attack;
		this.defence = defence;
	}

	
	public MagicDeck getDeck() {
		return deck;
	}

	public void setDeck(MagicDeck deck) {
		this.deck = deck;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getManacost() {
		return manacost;
	}

	public void setManacost(int manacost) {
		this.manacost = manacost;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	@Override
	public String toString() {
		return "Card Info [id ="  + id +" , name=" + name + ", type=" + type + ", manacost=" + manacost + ", attack=" + attack + ", defence=" + defence + " " + deck.toString() + "]";
	}
}


