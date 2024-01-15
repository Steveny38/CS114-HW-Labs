//Steven Yan
//115780161

import java.util.ArrayList;

public class RecipeBook {
	private String bookName;
	private CookingRecipe[] book = new CookingRecipe[0];
	
	
	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		int length = book.length;
		for(int i = 0; i < book.length; i++) {
			if(book[i].getName().equals(name)) {
				return null;
			}
		}
		
		CookingRecipe[] newBook = new CookingRecipe[length +1];
		
		for(int i = 0; i < length; i++) {
			newBook[i] = book[i];
		}
		newBook[length] = new CookingRecipe(name,ingredients);
		
		this.book=  newBook;
		
		return new CookingRecipe(name,ingredients);
		
		
	}
	
	public CookingRecipe removeRecipe(String name) {
	
		for(int i = 0; i < book.length; i++) {
			if(book[i].getName().equals(name)) {
				CookingRecipe ret = book[i];
				CookingRecipe[] newBook = new CookingRecipe[book.length-1];
				System.arraycopy(this.book, 0, newBook, 0, i);
				System.arraycopy(this.book, i+1, newBook, i, this.book.length-1-i);
				
				this.book = newBook;
				
				
				return ret;
			}
		}
		
		return null;
		
		
	}
	
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
    
		 ArrayList<CookingRecipe> matchingRecipes = new ArrayList<>();
		 
		 int counter =0;
		 for(CookingRecipe el: this.book) {
			 boolean hasIngredients =true;
			 for(RecipeIngredient x: ingredients) {
				 if(!(el.containsIngredient(x.getName()))) {
					 hasIngredients = false;
					 break;
				 }
				 
				 
			 }
			 if(hasIngredients) {
				 matchingRecipes.add(el);
				 counter++;
			 }
			 
		 }
		 if(counter >0) {
			 CookingRecipe[] returnRecipe = new CookingRecipe[counter];
			 for(int i = 0; i< counter; i++) {
				 returnRecipe[i] = matchingRecipes.get(i);
			 }
			 
			 return returnRecipe;		 
		 }
		 else return null;
		 
	
		
    
    
}
	
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		CookingRecipe[] returnRecipes = new CookingRecipe[book.length];
		int counter = 0;
		for(int i = 0; i < book.length; i++) {
			if(book[i].getNumberOfIngredients() <= numberOfIngredients) {
				returnRecipes[counter] = book[i];
				counter++;
				
			}
		}
		
		if(counter == 0) {
			return null;
		}
		
		CookingRecipe[] Recipes = new CookingRecipe[counter];
		
		System.arraycopy(returnRecipes, 0, Recipes, 0, counter);
		
		return Recipes;
			
	}
	
	public CookingRecipe[] findRecipesLowCalories() {
		
		CookingRecipe[] returnRecipe = new CookingRecipe[book.length];
		float min = book[0].calculateCalories();
		int count = 0;
		
		for(int i = 0; i < book.length; i++) {
			if(book[i].calculateCalories() < min) {
				min = book[i].calculateCalories();		
			}
		}
		for(int i = 0; i< book.length; i++) {
			if(book[i].calculateCalories() == min) {
				returnRecipe[count] = book[i];
				count++;
			}
		}
		CookingRecipe[] ret = new CookingRecipe[count];
		
		System.arraycopy(returnRecipe, 0, ret, 0, count);
		
		return ret;
		
	}
	
	public CookingRecipe[] getBook() {
		return this.book;
	}
	
	public String getName() {
		return this.bookName;
	}
	
	public String toString() {
		StringBuilder returnString = new StringBuilder();
		
		for(CookingRecipe el : this.book) {
			returnString.append(el.getName() + " ");
		}
		
		return this.bookName + "\n" + returnString;
		
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof RecipeBook)) {
			return false;
		}
		
		RecipeBook newO = (RecipeBook) o;
		
		for(int i = 0; i< book.length; i++) {
			if(!(this.book[i].equals(newO.getBook()[i]))) {
				return false;
			}
		}
		
		return this.bookName.equals(newO.getName());
		
		
	}
}
