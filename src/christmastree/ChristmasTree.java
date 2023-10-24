package christmastree;

import java.util.Scanner;

public class ChristmasTree {
    private int levels;
    final private String leaf = "*";
    final private String root = "|";

    // Constructor
    public ChristmasTree() {
        this.levels = -1;
    }

    // Getters and Setters
    public void setLevels(int _levels) {
        this.levels = _levels;
    }

    // Methods
    public String repeatString(String str, int times) {
        String result = "";
        for (int i = 1; i <= times; i++) {
            result += str;
        }
        return result;
    }

    public int inputData() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of levels: ");
            levels = scanner.nextInt();
            if (levels < 0) {
                System.out.println("Error: The number of levels must be greater than 2");
                return -1;
            }
            return levels;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: The number needs to be an integer");
            return -1;
        }
    }

    public void operationMain() {
        int userLever = this.inputData();
        if (userLever == -1) {
            return;
        }

        int temporal = userLever;
        String space = " ";
        for (int i = 1; i <= 2 * userLever - 1; i += 2) {
            System.out.print(this.repeatString(space, temporal - 1));
            System.out.println(this.repeatString(leaf, i));
            temporal -= 1;
        }
        System.out.print(this.repeatString(space, userLever - 1));
        System.out.println(this.repeatString(root, 1));

    }
}
