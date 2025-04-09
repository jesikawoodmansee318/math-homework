import java.util.*;

class MathHomework {
    private Map<Integer, Integer> map;

    public MathHomework() {
        this.map = new HashMap<>();
        this.map.put(1, 2);
        this.map.put(2, 3);
        this.map.put(4, 5);
        this.map.put(6, 7);
        this.map.put(8, 9);
        // Add more maps as needed
    }

    public void add(int key) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            map.put(key, 10);
        }
    }

    public void remove(int key) {
        if (!map.containsKey(key)) {
            System.out.println("Key not found in the map.");
        } else {
            int value = map.get(key);
            map.remove(key);
            System.out.printf("Value %d removed from the map.\n", key);
            if (value == 10) {
                // You can also delete all entries with the same key
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    System.out.printf("%d - %d\n", entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void print() {
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args) {
        MathHomework homework = new MathHomework();
        System.out.println("Initial Map: ");
        homework.print();
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a key to add it: (Enter 0 to finish)");
        while ((key = scanner.nextInt()) != 0) {
            if (map.containsKey(key)) {
                System.out.printf("Value %d already in the map.\n", key);
            } else {
                homework.add(key);
                System.out.println("Key added successfully.");
                for (int value : homework.map.values()) {
                    System.out.print(value + " ");
                }
            }
        }
        scanner.close();
        System.out.println("\nEnter a key to remove it: (Enter 0 to finish)");
        while ((key = scanner.nextInt()) != 0) {
            if (!map.containsKey(key)) {
                System.out.printf("Key not found in the map.\n");
            } else {
                homework.remove(key);
                System.out.println("Value removed from the map.");
                for (int value : homework.map.values()) {
                    System.out.print(value + " ");
                }
            }
        }
    }
}
