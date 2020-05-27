package abstractRecipe;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the Raw materials");
		System.out.println("Switch On the Microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff cooked");
	}

	@Override
	void cleanup() {
		System.out.println("Clean Up the utensils");
		System.out.println("Switch Off the Microwave");
	}

}
