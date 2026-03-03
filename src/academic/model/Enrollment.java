// File: src/academic/model/Enrollment.java
package academic.model;

/**
 * Represents an enrollment of a student in a course.
 * @author 12S24055 Theresia Samosir
 */
public class Enrollment {
    private String courseCode;
    private String studentId;
    private String academicYear;
    private String semester;
    private String grade;

    public Enrollment(String courseCode, String studentId, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // Default grade seperti yang diminta di output
    }

    // Getter methods
    public String getCourseCode() {
        return this.courseCode;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getAcademicYear() {
        return this.academicYear;
    }

    public String getSemester() {
        return this.semester;
    }

    public String getGrade() {
        return this.grade;
    }

    // Method untuk menampilkan Enrollment dalam format yang diinginkan
    @Override
    public String toString() {
        return this.courseCode + "|" + this.studentId + "|" + this.academicYear + "|" + this.semester + "|" + this.grade;
    }
}