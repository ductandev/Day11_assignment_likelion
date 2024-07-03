package Day11.assignment.bai2.services;

import Day11.assignment.bai2.model.Student;

public interface StudentServies {
    void addStudent(Student student);
    void editStudent(Student student);
    void deletteStudent(Student student);
    void findStudentById(String id);
    void showAllStudents();
    void showAllStudentsByClassId(String id);

}
