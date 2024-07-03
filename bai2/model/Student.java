package Day11.assignment.bai2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends People {
    private int age;
    private String classId;
    private LocalDate dayStart = null;
    private boolean status;
    private String reasonStop;
    private String codeStudent;


    public Student(String name, LocalDate birthDay, String id, int age, String classId, LocalDate dayStart, boolean status, String reasonStop, String codeStudent) {
        super(name, birthDay, id);
        this.age = age;
        this.classId = classId;
        this.dayStart = dayStart;
        this.status = status;
        this.reasonStop = reasonStop;
        this.codeStudent = codeStudent;
    }

    public Student(String classId, String name, LocalDate birthDay, String id, int age) {
        super(name, birthDay, id);
        this.age = age;
        this.status = true;
        this.codeStudent = classId + "_" + id;
        this.classId = classId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public LocalDate getDayStart() {
        return dayStart;
    }

    public void setDayStart(LocalDate dayStart) {
        this.dayStart = dayStart;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getReasonStop() {
        return reasonStop;
    }

    public void setReasonStop(String reasonStop) {
        this.reasonStop = reasonStop;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }
}
