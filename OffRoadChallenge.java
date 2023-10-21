import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OffRoadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        String[] initialFuelArr = scanner.nextLine().split(" "); // read initial fuel
        String[] consumptionIndexArr = scanner.nextLine().split(" ");// read consuption index
        String[] neededFuelArr = scanner.nextLine().split(" "); // read quanties

        // Convert the input to integer arrays
        int[] initialFuel = Arrays.stream(initialFuelArr).mapToInt(Integer::parseInt).toArray();
        int[] consumptionIndex = Arrays.stream(consumptionIndexArr).mapToInt(Integer::parseInt).toArray();
        int[] neededFuel = Arrays.stream(neededFuelArr).mapToInt(Integer::parseInt).toArray();

        // Process the altitudes
        List<Integer> reachedAltitudes = new ArrayList<>(); // make it with List because we need to save the REACHED altitudes anywhere
        boolean failedToReachTop = false;

        for (int i = 0; i < 4; i++) {                                             // We make a "for" cycle to make a control for if John reaches the altitude and after that we print them in new line
             if (initialFuel[3] - consumptionIndex[i] >= neededFuel[i]) {
                reachedAltitudes.add(i + 1);
                initialFuel[3] -= consumptionIndex[i];
                System.out.println("John has reached: Altitude " + (i + 1));
            } else {                                                                // With this check we make a second condition which is to print which altitude John did non reached
                System.out.println("John did not reach: Altitude " + (i + 1));
                failedToReachTop = true;
                break;
            }
        }

        // Print the results
        if (failedToReachTop) {
            System.out.print("John failed to reach the top.\nReached altitudes: "); // here we make a check if John reach to the top. if he fail we print "John failed to reach the top." and print the overtaked altitudes
            for (int i = 0; i < reachedAltitudes.size(); i++) {
                System.out.print("Altitude " + reachedAltitudes.get(i));
                if (i < reachedAltitudes.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else if (reachedAltitudes.size() == 4) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.println("John failed to reach the top.\nJohn didn't reach any altitude.");
        }

        // Process the second set of inputs
       /* String[] initialFuelArr2 = scanner.nextLine().split(" ");
        String[] consumptionIndexArr2 = scanner.nextLine().split(" ");
        String[] neededFuelArr2 = scanner.nextLine().split(" ");

        // Convert the second set of inputs to integer arrays
        int[] initialFuel2 = Arrays.stream(initialFuelArr2).mapToInt(Integer::parseInt).toArray();
        int[] consumptionIndex2 = Arrays.stream(consumptionIndexArr2).mapToInt(Integer::parseInt).toArray();
        int[] neededFuel2 = Arrays.stream(neededFuelArr2).mapToInt(Integer::parseInt).toArray();

        // Reset variables
        reachedAltitudes.clear();
        failedToReachTop = false;

        for (int i = 0; i < 4; i++) {
            if (initialFuel2[3] - consumptionIndex2[i] >= neededFuel2[i]) {
                reachedAltitudes.add(i + 1);
                initialFuel2[3] -= consumptionIndex2[i];
                System.out.println("John has reached: Altitude " + (i + 1));
            } else {
                System.out.println("John did not reach: Altitude " + (i + 1));
                failedToReachTop = true;
                break;
            }
        }

        // Print the results for the second set of inputs
        if (failedToReachTop) {
            System.out.print("John failed to reach the top.\nReached altitudes: ");
            for (int i = 0; i < reachedAltitudes.size(); i++) {
                System.out.print("Altitude " + reachedAltitudes.get(i));
                if (i < reachedAltitudes.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else if (reachedAltitudes.size() == 4) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.println("John failed to reach the top.\nJohn didn't reach any altitude.");
        }

        scanner.close();*/
    }

}
