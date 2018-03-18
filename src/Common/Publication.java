package Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Publication {
	
	protected static List<List<String>>publicationList=new ArrayList<>();
	
	public static List<String>SportsPublicationList=new ArrayList<>();
	public static List<String>ShoppingPublicationList=new ArrayList<>();
	public static List<String>FashionPublicationList=new ArrayList<>();
	public static List<String>FoodPublicationList=new ArrayList<>();
	
	
	public static void populateLists(List<String>listToPolate, String f) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f));
		String line;
		while((line = in.readLine()) != null)
		{
			listToPolate.add(line);
		}
		in.close();
		
	}
	public static void setLists() throws IOException {
		populateLists(SportsPublicationList, "sports");
		populateLists(ShoppingPublicationList, "fashion");
		populateLists(FashionPublicationList, "shopping");
		populateLists(FoodPublicationList,"food");
		
		publicationList.add(SportsPublicationList);
		publicationList.add(ShoppingPublicationList);
		publicationList.add(FashionPublicationList);
		publicationList.add(FoodPublicationList);
	}
	public static List<List<String>> getPublicationList() throws IOException {
		setLists();
		return publicationList;
	}
	public static void setPublicationList(List<List<String>> publicationList) throws IOException {
		setLists();
		Publication.publicationList = publicationList;
	}
	
	
}
