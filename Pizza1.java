package pizzeria.model;

public class Pizza {
	private String pizzaId, pizzaName, pizzaDescription;
	private double price;
	
	public Pizza() {
		pizzaId = "";
		pizzaName = "";
		pizzaDescription = "";
		price = 0;
	}
	public Pizza(String pizzaId, String pizzaName, String pizzaDescription, double price) {
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.pizzaDescription = pizzaDescription;
		this.price = price;
	}
	
	void setId(String pizzaId) {
		this.pizzaId = pizzaId;
	}
	void setName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	void setDesc(String pizzaDescription) {
		this.pizzaDescription = pizzaDescription;
	}
	void setPrice(double price) {
		this.price = price;
	}
	public String getpizzaId() {
		return pizzaId;
	}
	public String getpizzaName() {
		return pizzaName;
	}
	public String getpizzaDescription() {
		return pizzaDescription;
	}
	public double getPrice() {
		return price;
	}
	
	 public String toString() {
		return pizzaId + pizzaName + pizzaDescription + price;
	}
}
