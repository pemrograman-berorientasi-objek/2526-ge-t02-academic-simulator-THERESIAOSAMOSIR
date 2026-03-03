// File: src/academic/model/Course.java
package academic.model;

/**
 * Represents a course in the academic system.
 * @author 12S24055 Theresia Samosir
 */
public class Course {
    private String code;
    private String name;
    private int credits;
    private String grade; // Untuk keperluan Task 03 output

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // Getter methods
    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getGrade() {
        return this.grade;
    }

    // Method untuk menampilkan Course dalam format yang diinginkan
    @Override
    public String toString() {
        return this.code + "|" + this.name + "|" + this.credits + "|" + this.grade;
    }
}