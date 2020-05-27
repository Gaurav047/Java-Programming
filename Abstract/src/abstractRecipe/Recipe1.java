package abstractRecipe;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materails");
		System.out.println("Get the Utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Do the Dish");
	}

	@Override
	void cleanup() {
		System.out.println("Clean Up the Utensils");
	}

}
