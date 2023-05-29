package menu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ConfigurationPizzeria {

	@Bean
	@Scope("prototype")
	public PizzaNormale marinara() {
		return new PizzaNormale(2.5, 234, "Marinara", "Origano");
	}

	@Bean
	@Scope("prototype")
	public PizzaNormale quattroStagioni() {
		return new PizzaNormale(4, 678, "4 Stagioni", "Olive - Carciofini - Prosciutto");
	}

	@Bean
	@Scope("prototype")
	public Birra birMoretti() {
		return new Birra(2, 87, "Birra Moretti 20CL", "20", 5.4);
	}
	
	@Bean
	@Scope("prototype")
	public Birra birraNastroAzzurro() {
		return new Birra(2, 87, "Birra Nastro Azzurro 33cl", "20", 4.4);
	}
	
	@Bean
	@Scope("prototype")
	public Bevanda CocaCola() {
		return new CocaCola(0.2, 3 , "CocaCola-Zero ", "25cl",3);
	}

}