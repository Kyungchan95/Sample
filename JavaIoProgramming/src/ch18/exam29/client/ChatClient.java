package ch18.exam29.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatClient extends Application {

	public static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {

		// how1
		ChatClient.primaryStage = primaryStage;

		// how2
		Parent parent = FXMLLoader.load(getClass().getResource("client.fxml"));
//		Parent.getStylesheets().add(getClass().getResource("root.css").toString());
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
//		RootController controller = loader.getController();
//		controller.setPrimaryStage(primaryStage);
//		Parent parent = loader.load();
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chat Client");

		primaryStage.setOnCloseRequest((event) -> {
			System.out.println("Close....안녕......");

		});
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
