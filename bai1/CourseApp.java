package Day11.assignment.bai1;

import java.util.ArrayList;

public class CourseApp {
    public static void disPlayDetailCourse(ArrayList<CourseOnline> courseOnlines ,int id){
        for(CourseOnline courseOnlinesCurrent : courseOnlines){
            if (courseOnlinesCurrent.getCourseId() == id){
                courseOnlinesCurrent.showDetailCourse();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", 26, "Nam"));
        students.add(new Student(2, "Nguyễn Văn B", 26, "Nam"));
        students.add(new Student(3, "Nguyễn Văn C", 26, "Nam"));

        // Khởi tạo khóa học online
        CourseOnline courseOnline1 = new CourseOnline(1, "Khóa học java cơ bản", "Dương 01", 1000, "Online",  60, students);
        CourseOnline courseOnline2 = new CourseOnline(2, "Khóa học java trung cấp", "Dương 02", 1000, "Online",  60 , students);
        CourseOnline courseOnline3 = new CourseOnline(3, "Khóa học java cao cấp", "Dương 03", 1000, "Online",  60, students);

        // Khởi tạo 1 khóa học
        ArrayList<CourseOnline> courseOnlines = new ArrayList<>();
        courseOnlines.add(courseOnline1);
        courseOnlines.add(courseOnline2);
        courseOnlines.add(courseOnline3);

        // Show chi tiết Khóa học 2.
        disPlayDetailCourse(courseOnlines, 2);

        // Show danh sách học sinh của khóa học 2
        courseOnline2.displayStudent();


    }
}
