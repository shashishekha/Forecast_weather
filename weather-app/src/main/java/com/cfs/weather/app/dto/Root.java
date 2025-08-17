package com.cfs.weather.app.dto;

public class Root{
    public Location location;
    public Current current;
    public Forecast forecast;

    public Root(Location location, Current current) {
        this.location = location;
        this.current = current;
        this.forecast = forecast;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
