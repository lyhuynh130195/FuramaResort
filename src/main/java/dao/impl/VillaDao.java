package dao.impl;

import dao.ServiceDao;
import model.rent.Villa;

import java.util.List;
import java.util.stream.Collectors;

public class VillaDao extends ServiceDao<Villa> {
    private static final String VILLA_CSV = "Case_study2/src/main/java/data/Villa.csv";

    public VillaDao() {
        super(VILLA_CSV,Villa.class);
    }

    @Override
    public void showAllNameNotDuplicate() {
        List<String> list =  fileCSVDao.showList()
                .stream()
                .map(villa -> villa.getName())
                .distinct()
                .collect(Collectors.toList());

        for(String str : list){
            System.out.println(str);
        }
    }

    @Override
    public void addNewService(Villa villa) {
        fileCSVDao.save(villa);
    }

    @Override
    public void showServices() {
       List<Villa> list = fileCSVDao.showList();

       for(Villa villa :list){
           System.out.println(villa.showInfo());
       }
    }
    public List<Villa> getListVilla(){
        return fileCSVDao.showList();
    }
}
