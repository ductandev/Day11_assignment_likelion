package Day11.assignment.bai2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClassRoom {
    private String classId;
    private String className;
    private ArrayList<Student> students;
    private boolean status;

    public ClassRoom(String classId, String className, ArrayList<Student> students, boolean status) {
        this.classId = classId;
        this.className = className;
        this.students = students;
        this.status = status;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
