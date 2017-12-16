package cz.ucl.jee.foreignlands;

import java.util.List;

import org.springframework.stereotype.Component;

import cz.ucl.jee.camelot.nobility.Knight;

@Component
public class GorgeOfEternalPeril {
	
	public void goAcross(List<Knight> knights) {
		for (Knight knight: knights) {
			System.out.println("What is your name?"); 
			System.out.println(knight.sayName());
			
			System.out.println("What is your quest?"); 
			System.out.println(knight.sayQuest());
			
			System.out.println("What is your favourite colour?"); 
			System.out.println(knight.sayFavouriteColour());
		}
	}
	
}
