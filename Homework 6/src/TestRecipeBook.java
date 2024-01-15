//Steven Yan
//115780161
public class TestRecipeBook {

	public static void main(String[] args) {
	
		Ingredient I1 = new Ingredient("Milk", "liters", 110);
		Ingredient I2 = new Ingredient("Flour", "pounds", 20);
		

		System.out.println(I2);
		System.out.println("----------");
	
		
		RecipeIngredient R1 = new RecipeIngredient("RecipeIngreident 1", "cups",10, 3);
		RecipeIngredient R2 = new RecipeIngredient("Flour", "cups",25, 3);
		RecipeIngredient R3  = new RecipeIngredient("Eggs", "pounds", 30, 5);
		RecipeIngredient R4  = new RecipeIngredient("Wheat", "pounds", 21, 10);
		CookingRecipe cake = new CookingRecipe("Cake");
		CookingRecipe cake2 = new CookingRecipe("Cake");
		
		
		cake.addOrUpdateRecipeIngredient(R1, 2);
		cake.addOrUpdateRecipeIngredient(R2, 5);
		cake.addOrUpdateRecipeIngredient(R3, 3);
		cake.addOrUpdateRecipeIngredient(R4, 7);
		
		cake2.addOrUpdateRecipeIngredient(R1, 2);
		
		cake2.addOrUpdateRecipeIngredient(R4, 7);
		
		
		System.out.println(cake.getRecipeIngredient(R1));
		System.out.println("----------------");
		System.out.println(cake.getRecipeIngredient("Flour"));
		System.out.println("----------------");
		System.out.println(cake.removeRecipeIngredient(R3));
		System.out.println("----------------");
		System.out.println(cake.removeRecipeIngredient("Flour"));
		System.out.println("----------------");
		System.out.println("Calories: " + cake.calculateCalories());
		System.out.println("----------------");
		System.out.println("Number of Ingredients: "+  cake.getNumberOfIngredients());
		System.out.println("----------------");
		System.out.println(cake);
		System.out.println("----------------");
		System.out.println(cake.equals(cake2));
		
		RecipeBook book1 = new RecipeBook("Book 1");
		RecipeBook book2 = new RecipeBook("Book 1");
		
		
		
		System.out.println( book1.addRecipe("Pizza" , new RecipeIngredient[] {R1, R4}));
		System.out.println("----------------");
		System.out.println( book1.addRecipe("Cake" , new RecipeIngredient[] {R1,R2,R3,R4}));
		System.out.println("----------------");
		book1.addRecipe("Pizza 2", new RecipeIngredient[] {R1,R2});
		book1.addRecipe("Pizza 3", new RecipeIngredient[] {R1,R4});
		book1.addRecipe("cake 2", new RecipeIngredient[] {R1,R2,R3,R4});
		
		book2.addRecipe("Cake" , new RecipeIngredient[] {R1,R2,R3,R4});
		book2.addRecipe("Pizza 2", new RecipeIngredient[] {R1,R2});
		book2.addRecipe("Pizza 3", new RecipeIngredient[] {R1,R4});
		book2.addRecipe("cake 2", new RecipeIngredient[] {R1,R2,R3,R4});
		
		
		System.out.println( book1.removeRecipe("Pizza"));
		System.out.println("----------------");
		
		for(CookingRecipe el:  book1.findRecipes(new RecipeIngredient[] {R1, R4} )) {
			
			System.out.println("findRecipes");
				
			System.out.println(el);
			System.out.println();
			
			
			
		}
		
		System.out.println("----------------");
		System.out.println("findRecipesWithFewIngredients");
		for(CookingRecipe el:book1.findRecipesWithFewIngredients(2) ) {
			System.out.println(el);
			System.out.println();
		}
		System.out.println("----------------");
		
		for(CookingRecipe el: book1.findRecipesLowCalories()) {
			System.out.println("findRecipesLowCalories");
			System.out.println(el);
			
			System.out.println();
		}
		
		
		System.out.println(I2.equals(I1));
		//false
		System.out.println(R1.equals(R2));
		//false
		System.out.println(cake.equals(cake2));
		//true
		System.out.println(book1.equals(book2));
		//true
		
		
		
		
		
		
		
		
	}

}
