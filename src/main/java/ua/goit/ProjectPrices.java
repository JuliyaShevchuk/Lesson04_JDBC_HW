package ua.goit;

public class ProjectPrices {
    private String name;
    private int suma;

    public ProjectPrices(String name, int suma) {
        this.name = name;
        this.suma = suma;
    }

    public String getName() {
        return name;
    }

    public int getSuma() {
        return suma;
    }
}
