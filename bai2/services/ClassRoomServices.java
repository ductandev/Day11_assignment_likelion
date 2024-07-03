package Day11.assignment.bai2.services;

import Day11.assignment.bai2.model.ClassRoom;

public interface ClassRoomServices {
    void addClassRoom(ClassRoom classRoom);
    void editClassRoom(ClassRoom classRoom);
    void deleteClassRoom(String id);
    void findClassRoom(ClassRoom classRoom);
    void showAllClassRooms();
}
