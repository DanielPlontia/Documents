package mvc;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		Model model = new Model();
		View view = new View(model);
		model.setVotes(3);
		model.setParty("black");
		
		view.userInput();
	}
}
