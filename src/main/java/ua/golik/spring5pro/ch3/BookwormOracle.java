package ua.golik.spring5pro.ch3;

public class BookwormOracle implements Oracle {
	
	private Encyclopedia encyclopedia;
	
	// Setter Dependency Injection
	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}
	
	public String defineMeaningOfLife() {
		return "Encyclopedias are a waste of money - go see the world instead";
	}
}
