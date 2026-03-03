// File: src/academic/driver/Driver2.java
package academic.driver;

import academic.model.Student;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100]; // Array untuk menyimpan Student, ukuran maksimal 100
        int studentCount = 0; // Menghitung jumlah Student yang tersimpan

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break;
            }

            // Validasi input sederhana: jumlah segmen
            String[] studentData = line.split("#");
            if (studentData.length != 4) {
                continue;
            }

            String id = studentData[0];
            String name = studentData[1];
            String year = studentData[2];
            String major = studentData[3];

            // Buat objek Student dan simpan ke array
            if (studentCount < students.length) {
                students[studentCount] = new Student(id, name, year, major);
                studentCount++;
            } else {
                System.err.println("Penyimpanan Student penuh. Student tidak dapat ditambahkan.");
            }
        }

        // Tampilkan semua Student yang sudah tersimpan
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].toString());
        }

        input.close();
    }
}
