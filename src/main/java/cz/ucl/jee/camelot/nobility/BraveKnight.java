package cz.ucl.jee.camelot.nobility;

public class BraveKnight implements Knight {
	
	private String name;
	private String quest;
	private String favouriteColour;
	
	public BraveKnight(String name, String faveouriteColour) {
		this.name = name;
		this.favouriteColour = faveouriteColour;
	}
	
	@Override
	public String sayName() {
		return name;
	}

	@Override
	public String sayQuest() {
		return quest;
	}

	@Override
	public String sayFavouriteColour() {
		return favouriteColour;
	}

	@Override
	public void startQuest(String questName) {
		quest = questName;
	}

}
