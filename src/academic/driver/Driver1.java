// File: src/academic/driver/Driver1.java
package academic.driver;

import academic.model.Course;
import java.util.Scanner;

/**
 * Main driver for Task 01: Adding and displaying multiple Courses.
 * @author 12S24055 Theresia Samosir
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Course[] courses = new Course[100];
        int courseCount = 0;

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] courseData = line.split("#");
            if (courseData.length != 4) {
                continue;
            }

            try {
                String code = courseData[0];
                String name = courseData[1];
                int credits = Integer.parseInt(courseData[2]);
                String grade = courseData[3];

                if (courseCount < courses.length) {
                    courses[courseCount] = new Course(code, name, credits, grade);
                    courseCount++;
                } else {
                    System.err.println("Penyimpanan Course penuh. Course tidak dapat ditambahkan.");
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }

        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].toString());
        }

        input.close();
    }
}
