package Day11.assignment.bai2.model;

import java.time.LocalDate;

public class People {
    private String name;
    private LocalDate birthDay;
    private String id;

    public People(String name, LocalDate birthDay, String id) {
        this.name = name;
        this.birthDay = birthDay;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}