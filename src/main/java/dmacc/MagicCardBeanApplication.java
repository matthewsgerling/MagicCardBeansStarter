package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.MagicCards;
import dmacc.beans.MagicDeck;
import dmacc.controller.CardConfiguration;
import dmacc.repository.MagicInterface;

@SpringBootApplication
public class MagicCardBeanApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(MagicCardBeanApplication.class, args);
	}

	@Autowired
	MagicInterface repo;
	
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(CardConfiguration.class);
		MagicCards c = appContext.getBean("MagicCards", MagicCards.class);
		c.setName("Matt");
		c.setType("human");
		c.setManacost(2);
		c.setAttack(2);
		c.setDefence(2);
		repo.save(c);
		MagicCards d = new MagicCards("Matt", "Human", 1, 2, 3);
		MagicDeck a = new MagicDeck("My Deck", 20);
		d.setDeck(a);
		repo.save(d);
		
		System.out.println("HERE");
		List<MagicCards> allMyMagicCards = repo.findAll();
		for(MagicCards people: allMyMagicCards) {
			System.out.println(people.toString());	
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
