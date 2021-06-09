package until.csv.impl;

import model.rent.Villa;
import until.csv.CsvUtilImpl;

import java.util.Map;

public class VillaCsvImpl extends CsvUtilImpl<Villa> {
    public Villa fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, Villa.class);

        String id = map.get("id");
        String rate = map.get("rate");
        String description = map.get("description");
        int numberFloors = Integer.parseInt(map.get("numberFloors"));
        String name = map.get("name");
        int usableArea = Integer.parseInt(map.get("usableArea"));
        double rentalCost = Double.parseDouble(map.get("rentalCost"));
        int maxNumberPeople = Integer.parseInt(map.get("maxNumberPeople"));
        int poolArea = Integer.parseInt(map.get("poolArea"));
        String rentalType = map.get("rentalType");

        return new Villa(id, name, usableArea, rentalCost, maxNumberPeople, rentalType, rate, description,poolArea, numberFloors);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }
}
