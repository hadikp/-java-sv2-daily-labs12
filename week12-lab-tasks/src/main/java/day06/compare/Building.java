package day06.compare;

import java.util.Objects;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private Integer level;

    public Building(String address, int area, Integer level) {
        this.address = address;
        this.area = area;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(level, building.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }

    @Override
    public int compareTo(Building o) {
        return this.level.compareTo(o.level);
    }

    @Override
    public String toString() {
        return address + " ," + area + "m2, " + level + " szintes";
    }
}
