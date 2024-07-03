package Day11.assignment.bai1;

import java.util.ArrayList;

public class CourseOnline extends Course {
    private String platForm;
    private int duration;
    private ArrayList<Student> students;

    public CourseOnline() {}

    public CourseOnline(int courseId, String courseName, String mentorName, int credit, String platForm, int duration, ArrayList<Student> students) {
        super(courseId, courseName, mentorName, credit);
        this.platForm = platForm;
        this.duration = duration;
        this.students = students;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }

    public void showDetailCourse(){
        System.out.println("Course Details:" + super.getCourseId()
                + " - " + super.getCourseName() + " - "
                + super.getMentorName() + " - "
                + super.getCredit()
                + " - " + this.platForm
                + " - " + this.duration
        );
    }

    public void displayStudent(){
        for(Student student : students){
            System.out.println(student.getId() + " - " + student.getName() + " - " + student.getAge() + " - " + student.getGender());
        }
    }
}
