package Day11.assignment.bai2.services;

import Day11.assignment.bai2.model.Teacher;

public interface TeacherServices {
    void addTeacher(Teacher teacher);
    void editTeacher(Teacher teacher);
    void deleteTeacher(Teacher teacher);
    void findTeacherById(String id);
    void showAddTeacher();
}
