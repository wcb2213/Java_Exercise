package Java_Test;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StandardMainOfArray {

    // 标准舒服的main格式
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("sections.txt"));
        while (input.hasNextLine()){
            String line = input.nextLine();
            int[] attended = countAttended(line);
            int[] points = computePoints(attended);
            double[] grades = computeGrades(points);
            results(attended, points, grades);
        }
    }
    // Counts the sections attended by each student for a particular section.
    private static int[] countAttended(String line) {
        int[] attended = new int[5];
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i); // c == '1' or c == '0'
            if (c == '1') { // student attended their section
                attended[i % 5]++;
            }
        }
        return attended;
    }
    // Computes the points earned for each student for a particular section.
    private static int[] computePoints(int[] attended) {
        int[] points = new int[5];
        for (int i = 0; i < attended.length; i++) {
            points[i] = Math.min(20, 3 * attended[i]);
        }
        return points;
    }
    // Computes the percentage for each student for a particular section.
    private static double[] computeGrades(int[] points) {
        double[] grades = new double[5];
        for (int i = 0; i < points.length; i++) {
            grades[i] = 100.0 * points[i] / 20.0;
        }
        return grades;
    }
    // Produces all output about a particular section.
    private static void results(int[] attended, int[] points, double[] grades) {
        System.out.println("Sections attended: " + Arrays.toString(attended));
        System.out.println("Sections scores: " + Arrays.toString(points));
        System.out.println("Sections grades: " + Arrays.toString(grades));
        System.out.println();
    }
}
