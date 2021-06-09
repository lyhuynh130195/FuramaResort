package dao.impl;

import dao.ServiceDao;
import model.rent.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseDao extends ServiceDao<House> {
    private static final String DATA_HOUSE_CSV = "Case_study2/src/main/java/data/House.csv";

    public HouseDao() {
        super(DATA_HOUSE_CSV, House.class);
    }

    @Override
    public void showAllNameNotDuplicate() {
        List<String> list =
                fileCSVDao.showList()
                .stream()
                .map(house -> house.getName())
                .distinct()
                .collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewService(House house) {
      fileCSVDao.save(house);
    }

    @Override
    public void showServices() {
        List<House> list = fileCSVDao.showList();
        for (House house : list) {
            System.out.println(house.showInfo());
        }
    }
    public List<House> getListHouse(){
        return fileCSVDao.showList();
    }
}
