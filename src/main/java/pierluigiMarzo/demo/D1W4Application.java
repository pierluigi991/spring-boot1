package pierluigiMarzo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import menu.Birra;
import menu.ConfigurationPizzeria;
import menu.PizzaNormale;
import menu.Bevanda;
import menu.CocaCola;

@SpringBootApplication
public class D1W4Application {

	public static void main(String[] args) {
		SpringApplication.run(D1W4Application.class, args);
	}
	public static void configWith_Beans_pizzeria() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationPizzeria.class);
		try {

			// Recupero Bean
			PizzaNormale pizzaMarinara = (PizzaNormale) appCtx.getBean("marinara");
			PizzaNormale pizzaQuattroStagioni = (PizzaNormale) appCtx.getBean("quattroStagioni");
			Birra birraMoretti = (Birra) appCtx.getBean("birMoretti");
			Birra birraNastroAzzurro = (Birra) appCtx.getBean("birraNastroAzzurro");
			Bevanda CocaCola = (CocaCola) appCtx.getBean("CocaCola-Zero");
			
			System.out.println("Welcome to Godfather's Pizza!");
			System.out.println("Menu");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Pizze:");
			System.out.println(pizzaMarinara);
			System.out.println(pizzaQuattroStagioni);
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Bibite:");
			System.out.println(birraMoretti);
			System.out.println(birraNastroAzzurro);
			System.out.println(CocaCola);
			System.out.println("-------------------------------------------------------------------------");

		} catch (Exception e) {
			e.getMessage();
		} finally {
			((AnnotationConfigApplicationContext) appCtx).close();
		}

	}
}
