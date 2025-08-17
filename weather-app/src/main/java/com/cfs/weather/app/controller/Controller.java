package com.cfs.weather.app.controller;


import com.cfs.weather.app.WeatherAppApplication;
import com.cfs.weather.app.dto.Root;
import com.cfs.weather.app.dto.WeatherForeCast;
import com.cfs.weather.app.dto.WeatherResponse;
import com.cfs.weather.app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class Controller {
    @Autowired
    private WeatherService service;

    @GetMapping("/{city}")
    public String getWeatherData(@PathVariable String city){
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeather(@PathVariable String city){
        return service.getData(city);
    }

    @GetMapping("/forecast")
    public WeatherForeCast getForecast(@RequestParam String city, @RequestParam int days){
        return service.getForCast(city,days);
    }


}
