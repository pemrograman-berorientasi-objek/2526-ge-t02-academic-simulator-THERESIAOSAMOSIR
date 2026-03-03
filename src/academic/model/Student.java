// File: src/academic/model/Student.java
package academic.model;

/**
 * Represents a student in the academic system.
 * @author 12S24055 Theresia Samosir
 */
public class Student {
    private String id;
    private String name;
    private String year;
    private String major;

    public Student(String id, String name, String year, String major) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public String getMajor() {
        return this.major;
    }

    // Method untuk menampilkan Student dalam format yang diinginkan
    @Override
    public String toString() {
        return this.id + "|" + this.name + "|" + this.year + "|" + this.major;
    }
}