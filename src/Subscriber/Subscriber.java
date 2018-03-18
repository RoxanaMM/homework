package Subscriber;

import java.util.ArrayList;

import Model.ModelForAll;

public class Subscriber extends ModelForAll{

	private ArrayList<String>interests;
	
	public Subscriber() {
		super();
	}
	
	public Subscriber(ArrayList<String> interests) {
		super();
		this.interests = interests;
	}
	
	public ArrayList<String> getInterests() {
		return interests;
	}
	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}	
	
}
