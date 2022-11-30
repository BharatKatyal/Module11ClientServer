import javafx.stage.Stage;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
Client client = new Client();
Stage primaryStage = new Stage();
primaryStage.initOwner(primaryStage);
server.start(primaryStage);
client.start(primaryStage);

	}

}
