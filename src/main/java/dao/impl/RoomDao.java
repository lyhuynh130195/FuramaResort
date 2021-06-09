package dao.impl;

import dao.ServiceDao;
import model.rent.House;
import model.rent.Room;

import java.util.List;
import java.util.stream.Collectors;

public class RoomDao extends ServiceDao<Room> {
    private static final String FILE_PATH = "Case_study2/src/main/java/data/Room.csv";

    public RoomDao() {
        super(FILE_PATH, Room.class);
    }

    @Override
    public void showAllNameNotDuplicate() {
        List<String> list = fileCSVDao.showList()
                .stream()
                .map(room -> room.getName())
                .distinct()
                .collect(Collectors.toList());
        for(String str : list){
            System.out.println(str);
        }
    }

    @Override
    public void addNewService(Room room) {
         fileCSVDao.save(room);
    }

    @Override
    public void showServices() {
        List<Room> list= fileCSVDao.showList();
        for(Room room : list){
            System.out.println(room.showInfo());
        }
    }

    public List<Room> getListRoom(){
        return fileCSVDao.showList();
    }
}
