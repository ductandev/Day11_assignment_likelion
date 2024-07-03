package Day11.assignment.bai2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends People {
    private ArrayList<ClassRoom> classRooms;
    private ArrayList<Student> students;

    public Teacher(String name, LocalDate birthDay, String id, ArrayList<ClassRoom> classRooms, ArrayList<Student> students) {
        super(name, birthDay, id);
        this.classRooms = classRooms;
        this.students = students;
    }


    public ArrayList<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ArrayList<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
