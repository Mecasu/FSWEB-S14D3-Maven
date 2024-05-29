package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        return "the car's engine is starting";
    }

    public String drive() {
        System.out.println(getClass().getSimpleName());
        runEngine();
        return "the car is driving";
    }

    protected String runEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is running";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
