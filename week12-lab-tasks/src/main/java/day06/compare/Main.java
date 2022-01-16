package day06.compare;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Building>buildings = new TreeSet<>();
        Building b1 = new Building("Veszprém", 44, 1);
        Building b2 = new Building("FEHÉRVÁR", 144, 3);
        Building b3 = new Building("Budapest", 244, 2);
        buildings.add(b1);
        buildings.add(b2);
        buildings.add(b3);
        System.out.println(buildings);
    }
}
