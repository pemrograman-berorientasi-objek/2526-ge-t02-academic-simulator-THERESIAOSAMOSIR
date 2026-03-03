// File: src/academic/driver/Driver3.java
package academic.driver;

import academic.model.Enrollment;
import java.util.Scanner;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Enrollment[] enrollments = new Enrollment[100]; // Array untuk menyimpan Enrollment, ukuran maksimal 100
        int enrollmentCount = 0; // Menghitung jumlah Enrollment yang tersimpan

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            // Validasi input sederhana: jumlah segmen
            String[] enrollmentData = line.split("#");
            if (enrollmentData.length != 4) {
                continue;
            }

            String courseCode = enrollmentData[0];
            String studentId = enrollmentData[1];
            String academicYear = enrollmentData[2];
            String semester = enrollmentData[3];

            // Buat objek Enrollment dan simpan ke array
            if (enrollmentCount < enrollments.length) {
                enrollments[enrollmentCount] = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollmentCount++;
            } else {
                System.err.println("Penyimpanan Enrollment penuh. Enrollment tidak dapat ditambahkan.");
            }
        }

        // Tampilkan semua Enrollment yang sudah tersimpan
        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(enrollments[i].toString());
        }

        input.close();
    }
}
