//Steven Yan
//115780161
public class CookingRecipe {
	private String name;
	private RecipeIngredient[] recipe = new RecipeIngredient[0];
	
	CookingRecipe(String name){
		this.name = name;
	}
	
	CookingRecipe(String name, RecipeIngredient[] ingredients){
		this.name = name;
		this.recipe = new RecipeIngredient[ingredients.length];
		for(int i = 0; i< ingredients.length; i++) {
			this.recipe[i] = ingredients[i];
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		boolean isIn = false;
		for(int i = 0; i< recipe.length; i++) {
			if(recipe[i].getName().equals(ingredient.getName())) {
				recipe[i].setQuanitity(quantity);
				isIn= true;
				break;
			}
			
			
		}
		
		if(!isIn) {
			RecipeIngredient[] newRecipe = new RecipeIngredient[recipe.length+1];
			for(int i = 0; i < recipe.length; i++) {
				newRecipe[i] = recipe[i];
			}
			newRecipe[newRecipe.length-1] = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(),quantity);
			
			this.recipe = new RecipeIngredient[newRecipe.length];
			
			for(int i =0; i < recipe.length; i++) {
				this.recipe[i] = newRecipe[i];
			}
			
			
		}
		
		

		
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		
		for(int i = 0; i < recipe.length; i++) {
			if(recipe[i].getName().equals(ingredient.getName())) {

				return recipe[i];
			}
		}  

			return null;
		
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for(int i = 0; i < recipe.length; i++) {
			if(recipe[i].getName().equals(ingredientName)) {
				return recipe[i];
			}
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		
		RecipeIngredient[] dummy = null;
		
		for(int i = 0; i< this.recipe.length; i++) {
			if(this.recipe[i].getName().equals(ingredient.getName())) {
				
				RecipeIngredient ret = this.recipe[i];
				
				dummy = new RecipeIngredient[this.recipe.length-1];
				System.arraycopy(this.recipe, 0, dummy, 0, i);
				System.arraycopy(this.recipe, i+1, dummy, i, this.recipe.length -1 - i);
				
				this.recipe = dummy;
				
				return ret;
			}
			
		}
		
		return null;
	
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
RecipeIngredient[] dummy = null;
		
		for(int i = 0; i< this.recipe.length; i++) {
			if(this.recipe[i].getName().equals(ingredientName)) {
				
				RecipeIngredient ret = this.recipe[i];
				
				dummy = new RecipeIngredient[this.recipe.length-1];
				System.arraycopy(this.recipe, 0, dummy, 0, i);
				System.arraycopy(this.recipe, i+1, dummy, i, this.recipe.length -1 - i);
				
				this.recipe = dummy;
		
				for(RecipeIngredient k: this.recipe) {
					System.out.println(k);
				}
				
				return ret;
			}
			
		}
		
		return null;
		
	
	}
	
	public float calculateCalories() {
		float sum = 0;
		
		for(int i =0; i<recipe.length; i++) {
			sum+= recipe[i].getCaloriesPerUnit() * recipe[i].getQuantity();
		}
		return sum;
	}
	
	public int getNumberOfIngredients() {
		return recipe.length;
	}
	
	public RecipeIngredient[] getRecipe() {
		return this.recipe;
	}
	

	public boolean containsIngredient(String s) {
		for(RecipeIngredient el: this.recipe) {
			if(el.getName().equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof CookingRecipe)) {
			return false;
		}
		
		CookingRecipe newO = (CookingRecipe) o;
		 for(int i = 0; i < newO.getRecipe().length; i++) {
			if(!(newO.getRecipe()[i].equals(this.getRecipe()[i]))) {
				return false;
			}
			
		}
		 return this.getName().equals(newO.getName());
	}
	

	
	
	
	
	public String toString() {
		
		StringBuilder stringRecipe = new StringBuilder();
		
		for(RecipeIngredient el : this.getRecipe()) {
			stringRecipe.append(el.getName() + " ");
		}
		
		return "CookingRecipe\n" +  "name = " + name +"\n" + "recipe = " +  stringRecipe ; 
		
	}

	
	
}
