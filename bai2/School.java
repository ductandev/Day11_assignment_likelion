package Day11.assignment.bai2;

import Day11.assignment.bai2.model.ClassRoom;
import Day11.assignment.bai2.model.Student;
import Day11.assignment.bai2.model.Teacher;
import Day11.assignment.bai2.services.ClassRoomServices;
import Day11.assignment.bai2.services.StudentServies;
import Day11.assignment.bai2.services.TeacherServices;

import java.util.ArrayList;

public class School implements ClassRoomServices, StudentServies, TeacherServices {
    private ArrayList<ClassRoom> classRooms = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

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

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public void showAllClassRooms() {
        int stt = 1;
        System.out.println("=================================================================================");
        System.out.println("|                              DANH SÁCH CÁC LỚP HỌC                             |");
        System.out.printf("| %-3s | %-10s | %-20s | %-20s | %-12s |\n", "Stt", "Lớp học ID", "Tên lớp", "Số lượng HS", "Trạng thái");
        for (ClassRoom classRoom : classRooms) {
            System.out.printf("| %-3s | %-10s | %-20s | %-20s | %-12s |\n",
                    stt, classRoom.getClassId(), classRoom.getClassName(), classRoom.getStudents().size(), (classRoom.getStatus() ? "Đã bắt đầu" : "Chưa bắt đầu"));
            stt++;
        }
        System.out.println("=================================================================================");
    }

    @Override
    public void addClassRoom(ClassRoom classRoom) {
        if (classRooms.size() == 3){
            System.err.println("* Số lượng lớp học tối đa chỉ có thể tạo là 3 lớp !!!");
        } else {
            classRooms.add(classRoom);
        }
    }

    @Override
    public void editClassRoom(ClassRoom classRoom) {

    }

    @Override
    public void deleteClassRoom(String id) {

    }

    @Override
    public void findClassRoom(ClassRoom classRoom) {

    }


    @Override
    public void showAllStudentsByClassId(String classId) {
        int stt = 1;
        System.out.println("==========================================================================================");
        System.out.println("|                        DANH SÁCH HỌC SINH CỦA LỚP                                      |");
        System.out.printf("| %-3s | %-10s | %-20s | %-10s | %-4s | %-6s | %-12s | %-10s | %-14s | %-12s |\n", "Stt", "CCCD", "Họ tên", "Sinh nhật", "Tuổi", "Lớp ID", "Ngày bắt đầu", "Trạng thái", "Lý do nghỉ học", "Mã code lớp");
        for (ClassRoom classRoomCurrent : classRooms) {
            if (classRoomCurrent.getClassId().equals(classId)) {
                for (Day11.assignment.bai2.model.Student student :  classRoomCurrent.getStudents()) {
                    System.out.printf("| %-3s | %-10s | %-20s | %-10s | %-4s | %-6s | %-12s | %-10s | %-14s | %-12s |\n",
                            stt, student.getId(), student.getName(), student.getBirthDay(), student.getAge(), student.getClassId(), student.getDayStart(), student.isStatus(), student.getReasonStop(), student.getCodeStudent());
                    stt++;
                }
            }

        }
        System.out.println("============================================================================================");
    }

    @Override
    public void addStudent(Student student) {
        // Tìm lớp hiện tại
        ClassRoom classRoomCurrent = findClassRoomId(student.getClassId());

         if (classRoomCurrent.getStudents().size() >= 10) {
            System.err.println("Lớp học không được vượt quá 10 người !!!");
            return;
        } else if (student.getAge() > 20 || student.getAge() < 18) {
            System.err.println("Học viên phải từ 18-20 tuổi mới được đăng ký học !!!");
            return;
        } else {
            classRoomCurrent.getStudents().add(student);
            System.out.println("Thêm học sinh vào lớp thành công !!!");
        }


    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void deletteStudent(Student student) {

    }

    @Override
    public void findStudentById(String id) {

    }

    @Override
    public void showAllStudents() {

    }




    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void editTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

    }

    @Override
    public void findTeacherById(String id) {

    }

    @Override
    public void showAddTeacher() {

    }


    public ClassRoom findClassRoomId(String classId) {
        for (ClassRoom classRoom : classRooms) {
            if (classRoom.getClassId().equals(classId)) {
                return classRoom;
            }
        }
        System.err.println("Không tìm thấy lớp học ID !!!!");
        return null;
    }
//
//    public Books findBookById(String bookID) {
//        for (Books book : books) {
//            if (book.getBookId().equals(bookID)) {
//                return book;
//            }
//        }
//        return null;
//    }
}
