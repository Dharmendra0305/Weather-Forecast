package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter @Getter
public class WeatherResponse
{
    private String name;
    private Sys sys;
    private List<Weather> weather;
    private Main main;
    private Wind wind;

    @Getter @Setter
    public static class Sys
    {
        private String country;

    }

    @Getter @Setter
    public static class Weather
    {
        private int id;
        private String description;

    }

    @Getter @Setter
    public static class Main
    {
        private double temp;
        private int humidity;

    }

    @Getter @Setter
    public static class Wind
    {
        private double speed;

    }
}
