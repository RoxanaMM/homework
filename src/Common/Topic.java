package Common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Model.ModelForAll;

public class Topic extends Publication{

public static List<String>topicsList=new ArrayList<>();
	

	public static void getTopics() throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("topics"));
		String line;
		while((line = in.readLine()) != null)
		{
			topicsList.add(line);
		}
		in.close();
	}
	
    public static void main( String[] args ) {
		try {
			getTopics();
		//	getPublicationList();
			System.out.println(topicsList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Topic() {
		super();
	}
}
