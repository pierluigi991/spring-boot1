package menu;

public class PizzaNormale extends PizzaStandard {
	String ingredientiAggiuntivi;

	public PizzaNormale(double prezzo, double calorie, String nomePizza, String ingredientiAggiuntivi) {
		super(prezzo, calorie, nomePizza, PizzaStandard.ingredientiPrincipali);
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
	}

	public String getIngredientiAggiuntivi() {
		return ingredientiAggiuntivi;
	}

	public void setIngredientiAggiuntivi(String ingredientiAggiuntivi) {
		this.ingredientiAggiuntivi = ingredientiAggiuntivi;
	}

	@Override
	public String toString() {
		return "PizzaNormale [nomePizza=" + nomePizza + ", prezzo=" + prezzo + ", calorie=" + calorie
				+ ", ingredientiPrincipali=" + getIngredientiPrincipali() + ", ingredientiAggiuntivi= " + ingredientiAggiuntivi + "]";
	}

}