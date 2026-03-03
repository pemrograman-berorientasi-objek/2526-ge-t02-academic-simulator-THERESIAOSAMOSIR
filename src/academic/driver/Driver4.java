// File: src/academic/driver/Driver4.java
package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Scanner;

public class Driver4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays untuk menyimpan semua jenis objek
        Course[] courses = new Course[100];
        int courseCount = 0;

        Student[] students = new Student[100];
        int studentCount = 0;

        Enrollment[] enrollments = new Enrollment[100];
        int enrollmentCount = 0;

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            // Memisahkan tipe entitas dari data
            String[] parts = line.split("#", 2); // Split hanya pada '#' pertama
            if (parts.length < 2) {
                // Abaikan input jika format awal tidak sesuai (misal: hanya "course-add")
                continue;
            }
            String command = parts[0];
            String data = parts[1];

            switch (command) {
                case "course-add":
                    String[] courseData = data.split("#");
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
                             System.err.println("Penyimpanan Course penuh.");
                        }
                    } catch (NumberFormatException e) {
                        continue;
                    }
                    break;
                case "student-add":
                    String[] studentData = data.split("#");
                    if (studentData.length != 4) {
                        continue;
                    }
                    String studentId = studentData[0];
                    String studentName = studentData[1];
                    String studentYear = studentData[2];
                    String studentMajor = studentData[3];
                    if (studentCount < students.length) {
                        students[studentCount] = new Student(studentId, studentName, studentYear, studentMajor);
                        studentCount++;
                    } else {
                        System.err.println("Penyimpanan Student penuh.");
                    }
                    break;
                case "enrollment-add":
                    String[] enrollmentData = data.split("#");
                    if (enrollmentData.length != 4) {
                        continue;
                    }
                    String courseCode = enrollmentData[0];
                    String enrollStudentId = enrollmentData[1];
                    String academicYear = enrollmentData[2];
                    String semester = enrollmentData[3];
                    if (enrollmentCount < enrollments.length) {
                        enrollments[enrollmentCount] = new Enrollment(courseCode, enrollStudentId, academicYear, semester);
                        enrollmentCount++;
                    } else {
                         System.err.println("Penyimpanan Enrollment penuh.");
                    }
                    break;
                default:
                    // Abaikan command yang tidak dikenal
                    continue;
            }
        }

        // Tampilkan semua Course
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].toString());
        }

        // Tampilkan semua Student
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].toString());
        }

        // Tampilkan semua Enrollment
        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(enrollments[i].toString());
        }

        input.close();
    }
}
