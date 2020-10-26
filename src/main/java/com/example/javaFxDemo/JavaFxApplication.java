package com.example.javaFxDemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.javaFxDemo.controller.MyController;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;

public class JavaFxApplication extends Application {

	private ConfigurableApplicationContext applicationContext;

	@Override
	public void init() {
		String[] args = getParameters().getRaw().toArray(new String[0]);
		this.applicationContext = new SpringApplicationBuilder().sources(JavaFxDemoApplication.class).run(args);
	}

	@Override
	public void start(Stage stage) {

		/*
		 * WebView webView = new WebView(); WebEngine webEngine = webView.getEngine();
		 * 
		 * Button button = new Button(); button.setOnAction(new
		 * EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) { // TODO Auto-generated
		 * method stub webEngine.load("https://www.google.com"); } });
		 * 
		 * VBox root1 = new VBox(); root1.getChildren().addAll(webView, button);
		 */

		FxWeaver fxWeaver = applicationContext.getBean(FxWeaver.class);
		Parent root = fxWeaver.loadView(MyController.class);

		Scene scene = new Scene(root, 500, 200);
		stage.setScene(scene);

		stage.show();
	}

	@Override
	public void stop() {
		this.applicationContext.close();
		Platform.exit();
	}
}
