package Day11.assignment.bai2;

import Day11.assignment.bai2.model.ClassRoom;
import Day11.assignment.bai2.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int userInputInt() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                break;
            } catch (InputMismatchException e) {
                System.out.println("* Error: Vui lòng chỉ nhập số nguyên !!!");
                scanner.nextLine(); // Clear invalid input
                System.out.print("Nhập lại: ");
            }
        }
        return choice;
    }

    public static String userInputString() {
        String choise = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                choise = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.err.println("* Error: Vui lòng chỉ nhập ký tự !!!");
                scanner.close();
            }
        }
        return choise;
    }

    public static void showDisplayFunction() {
        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println("+          ĐỀ 1: QUẢN LÝ THƯ VIỆN           +");
        System.out.println("=============================================");
        System.out.println("|1. Thêm Lớp học                            |");
        System.out.println("|2. Thêm học viên                           |");
        System.out.println("|3. Thêm giáo viên                          |");
        System.out.println("|4. Xem danh sách các học viên trong lớp    |");
        System.out.println("|5. Xem thông tin chi tiết của học viên     |");
        System.out.println("|6. Sửa thông tin học viên                  |");
        System.out.println("|7. Xem danh sách tất cả Giáo viên          |");
        System.out.println("|8. Xem danh sách học viên của giáo viên    |");
        System.out.println("|0. Exit                                    |");
        System.out.println("=============================================");
        System.out.print("Chọn mục tương ứng: ");
    }

    public static void getAllClassRooms(School school) {
        school.showAllClassRooms();
    }

    public static void addClassRoom(School school) {
        getAllClassRooms(school);

        System.out.print("Nhập vào lớp học ID: ");
        String classId = userInputString();
        System.out.print("Nhập vào Tên lớp học: ");
        String className = userInputString();

        school.addClassRoom(new ClassRoom(classId, className, new ArrayList<Student>(), false ));
        getAllClassRooms(school);
    }

    public static void addStudent(School school) {
        String classId = showAllStrudentInCourse(school);

        System.out.print("Nhập vào Họ tên học viên: ");
        String name = userInputString();
        System.out.print("Nhập vào ngày tháng năm sinh (yyyy-MM-dd): ");
        String stringDay = userInputString();
        LocalDate birthDay = LocalDate.parse(stringDay, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Nhập vào CCCD học viên: ");
        String id = userInputString();
        System.out.print("Nhập vào tuổi: ");
        int age = userInputInt();

        school.addStudent(new Student(classId, name, birthDay, id, age));

        school.showAllStudentsByClassId(classId);
    }

    public static String showAllStrudentInCourse(School school) {
        getAllClassRooms(school);

        System.out.print("Nhập vào lớp học ID: ");
        String classId = userInputString();
        // Tìm lớp học ID, nếu không có thì end
        ClassRoom classRoomCurrent = school.findClassRoomId(classId);
        if (classRoomCurrent == null){
            return null;
        }
        school.showAllStudentsByClassId(classId);
        return classId;
    }

    public static void showStudentDetailInCourse(School school){
        String classId = showAllStrudentInCourse(school);
        System.out.print("Nhập vào CCCD học viên: ");
        String id = userInputString();

    }

    public static void main(String[] args) {
        // Tạo dữ liệu cứng
        LocalDate localDate = LocalDate.now();

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Nguyễn A", localDate, "0123156789", 26, "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn B", localDate, "0223256789",26,  "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn C", localDate, "0323356789",26,  "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn D", localDate, "0423456789",26,  "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn E", localDate, "0523556789", 26, "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn F", localDate, "0623656789",26,  "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn G", localDate, "0723756789",26,  "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn H", localDate, "0823856789", 26, "C01",  null, true,null, "C01_01"));
        students.add(new Student("Nguyễn H", localDate, "0923956789",26,  "C01",  null, true,null, "C01_01"));

        School school = new School();
        school.addClassRoom(new ClassRoom("C01", "Lớp Java 01",  students, false ));
        school.addClassRoom(new ClassRoom("C02", "Lớp Java 02",  students, false ));
        school.addClassRoom(new ClassRoom("C03", "Lớp Java 03",  students, false ));


        while (true) {
            showDisplayFunction();
            int choice = userInputInt();
            switch (choice) {
                case 1:
                    addClassRoom(school);
                    break;
                case 2:
                    addStudent(school);
                    break;
                case 3:
//                    editStudent(school);
                    break;
                case 4:
                    showAllStrudentInCourse(school);
                    break;
                case 5:
                    showStudentDetailInCourse(school);
                    break;
                case 6:
//                    addPerson(school);
                    break;
                case 7:
//                    editPerson(school);
                    break;
                case 8:
//                    personDetail(school);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
