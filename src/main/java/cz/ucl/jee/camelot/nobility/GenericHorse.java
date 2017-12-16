package cz.ucl.jee.camelot.nobility;

public class GenericHorse implements Horse {
	
	private String name;
	
	public GenericHorse(String name) {
		this.name = name;
	}

	@Override
	public String neigh() {
		return "Iiii ha ha";
	}

}
