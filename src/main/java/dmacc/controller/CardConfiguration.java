package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.MagicCards;
import dmacc.beans.MagicDeck;

@Configuration
public class CardConfiguration {
	@Bean
	public MagicCards MagicCards() {
		MagicCards bean = new MagicCards("test", "Test", 1, 2, 3);
		bean.setDeck(MagicDeck());
		return bean;
	}
	@Bean
	public MagicDeck MagicDeck() {
		MagicDeck bean = new MagicDeck("test", 10);
		return bean;
	}

}
