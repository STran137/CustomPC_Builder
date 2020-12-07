package UMBC.IS147.SemesterProject;

import java.util.Scanner;

class RandomBuilder {

    private static int randomStartKey;
    public static int getRandomStartKey() { return randomStartKey; }
    public static void setRandomStartKey(int randomStartNum) {randomStartKey = randomStartNum; }

    int min,max;

    int randomWithRange(int min, int max) {
        int range = (this.max - this.min) + 1;
        return (int) (Math.random() * range) + min;
    }

    double randomWithRange(double min, double max) {
        double range = (this.max - this.min) + 1;

        return (Math.random() * range) + min;
    }


    public static void randomBuildStart() {
        Scanner randomInput = new Scanner(System.in);

        System.out.println("Please enter [8] for a randomly generated build");

        int randomStartKey = randomInput.nextInt();
        setRandomStartKey(randomStartKey);
        while (randomStartKey != 8) {
            System.out.println("Please enter the correct menu option.");
            randomStartKey = randomInput.nextInt();
            setRandomStartKey(randomStartKey);
        }
    }
}