package mvc;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Scanner;

public class Controller implements PropertyChangeListener {
	Model model;
	View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	public void getParty() throws IOException {
		System.out.println("User Input - Party: ");
		Scanner scanner = new Scanner(System.in);
		model.setParty(scanner.nextLine());
	}

	public void getVotes() throws IOException {
		System.out.println("User Input - Votes: ");
		Scanner scanner = new Scanner(System.in);
		model.setVotes(Long.parseLong(scanner.nextLine()));
	}
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("the controller notices the change of the model:"+evt.getPropertyName());
    }
   
}