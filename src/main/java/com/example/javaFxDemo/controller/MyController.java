package com.example.javaFxDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.javaFxDemo.service.WeatherService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;

@Component
@FxmlView("main-scene.fxml")
public class MyController {

	@FXML
	private Label weatherLabel;

	@Autowired
	private WeatherService weatherService;

	public void loadWeatherForecast(ActionEvent actionEvent) {
		this.weatherLabel.setText(weatherService.getWeatherForecast());
	}

}
