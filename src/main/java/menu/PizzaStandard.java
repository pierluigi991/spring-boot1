package menu;

public class PizzaStandard extends Prodotto {
	String nomePizza;
	static String ingredientiPrincipali = "pomodoro - mozzarella";

	public PizzaStandard(double prezzo, double calorie, String nomePizza, String ingredientiPrincipali) {
		super(prezzo, calorie);
		this.nomePizza = nomePizza;
	}

	public String getNomePizza() {
		return nomePizza;
	}

	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}

	public String getIngredientiPrincipali() {
		return ingredientiPrincipali;
	}

	@Override
	public String toString() {
		return "PizzaBase [nomePizza=" + nomePizza + ", ingredientiPrincipali=" + ingredientiPrincipali + ", prezzo=" + prezzo
				+ ", calorie=" + calorie + "]";
	}
}
