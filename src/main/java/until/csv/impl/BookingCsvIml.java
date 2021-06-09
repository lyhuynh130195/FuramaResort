package until.csv.impl;

import enum_service.CustomerType;
import model.Booking;
import model.Customer;
import until.csv.CsvUtilImpl;

import java.util.Map;

public class BookingCsvIml extends CsvUtilImpl {
    public Booking fromCsv(String csvLine) {
        Map<String, String> map = getMapFieldNameAndValue(csvLine, Booking.class);

        String name = map.get("nameCustomer");
        String id = map.get("idRentService");
 ;

        return new Booking(name,id);
    }
}
