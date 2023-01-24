import java.util.ArrayList;

class Fish {
    String name;
    int size;

    Fish(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

class FishTank {
    ArrayList<Fish> fishes;

    FishTank() {
        fishes = new ArrayList<Fish>();
    }

    void addFish(Fish fish) {
        fishes.add(fish);
    }

    void printFishTank() {
        System.out.println("Fish tank contains:");
        for (Fish fish : fishes) {
            System.out.println(fish.name + " (" + fish.size + "cm)");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FishTank tank = new FishTank();
        tank.addFish(new Fish("Goldfish", 15));
        tank.addFish(new Fish("Angelfish", 20));
        tank.printFishTank();
    }
}
