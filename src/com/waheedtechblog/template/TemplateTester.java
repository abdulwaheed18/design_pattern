package com.waheedtechblog.template;

/**
 * Template design pattern defines abstract class having various concrete method
 * and one non-overridden method which internally calls the various methods.
 * 
 * The real life example of this pattern can be any Game
 * 
 * In JDK java.io.Reader and java.io.Writer
 * 
 * @author abdulwaheed18@gmail.com
 *
 */
public class TemplateTester {

	public static void main(String[] args) {
		
		System.out.println("CandyCrush Game");
		Game candyCrushGame = new CandyCrushGame();
		candyCrushGame.play();
		
		System.out.println("\nPokemonGoGame Game");
		Game pokemonGoGame = new PokemonGoGame();
		pokemonGoGame.play();

	}

}
