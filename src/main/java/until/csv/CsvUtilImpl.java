package until.csv;

import model.Booking;
import model.Customer;
import model.Employee;
import model.rent.House;
import model.rent.Room;
import model.rent.Villa;
import until.csv.impl.*;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CsvUtilImpl<T> implements CsvUtil<T> {
    private static final String COMMA_DELIMITER = ",";
    public static final int INITIAL_VALUE = 0;

    @Override
    public String writeHeader(T src) {
        return writeHeader(src.getClass());
    }

    private String writeHeader(Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        setAllFields(fieldList, typeOfSrc);
//        List<String> listFieldName = new ArrayList<>();
//        for (Field field : fieldList) {
//            listFieldName.add(field.getName());
//        }
//
//        String[] strings1 = listFieldName.toArray(strings);
//        String.join(COMMA_DELIMITER,strings1);
        return fieldList.stream()
                .map(field -> field.getName())
                .collect(Collectors.joining(COMMA_DELIMITER));
    }
    private static void setAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));
        if (type.getSuperclass() != null) {
            setAllFields(fields, type.getSuperclass());
        }
    }


    protected List<String> getAllField(Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        setAllFields(fieldList, typeOfSrc);
        return fieldList.stream()
                .map(field -> field.getName())
                .collect(Collectors.toList());
    }

    @Override
    public String toCsv(T src) {
        if (src == null) {
            return null;
        }
        return toCsv(src, src.getClass());
    }

    private String toCsv(T src, Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        setAllFields(fieldList, typeOfSrc);
        List<String> listValueOfFields = new ArrayList<>();

        try {
            for (Field declaredField : fieldList) {
                declaredField.setAccessible(true);
                Object o = declaredField.get(src);
                String value = "";
                if (o != null) {
                    value = o.toString();
                }
//                int indexOfField = fieldList.indexOf(declaredField);
                listValueOfFields.add(value);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return String.join(COMMA_DELIMITER, listValueOfFields);
    }


    @Override
    @SuppressWarnings("unchecked")
    public T fromCsv(String csvLine, Class<T> classOfT) {
        if (House.class.equals(classOfT)) {
            return (T) new HouseCsvImpl().fromCsv(csvLine);
        }

        if (Villa.class.equals(classOfT)) {
            return (T) new VillaCsvImpl().fromCsv(csvLine);
        }

        if (Room.class.equals(classOfT)) {
            return (T) new RoomCsvImpl().fromCsv(csvLine);
        }
        if (Customer.class.equals(classOfT)) {
            return (T) new CustomerCsvIml().fromCsv(csvLine);
        }
        if (Employee.class.equals(classOfT)) {
            return (T) new EmployeeScvIml().fromCsv(csvLine);
        }
        if (Booking.class.equals(classOfT)) {
            return (T) new BookingCsvIml().fromCsv(csvLine);
        }
        return null;
    }

    @Override
    public void delete(String idService, Class<T> classOfT) {
        if (!checkId(idService)) {
            System.out.println("khong ton taij id la: " + idService);
        }
        if (House.class.equals(classOfT)) {
            new HouseCsvImpl().delete(idService);
        }
        if (Villa.class.equals(classOfT)) {
            new VillaCsvImpl().delete(idService);
        }

        if (Room.class.equals(classOfT)) {
            new RoomCsvImpl().delete(idService);
        }
    }

    protected void delete(String id) {

    }

    ;

    private boolean checkId(String idService) {
        return false;
    }



    protected Map<String, String> getMapFieldNameAndValue(String csvLine, Class<T> classOfT) {
        List<String> allField = getAllField(classOfT);
        String[] values = csvLine.split(COMMA_DELIMITER);
        Map<String, String> map = new HashMap<>();
        AtomicInteger atomicInteger = new AtomicInteger(INITIAL_VALUE);

        Arrays.stream(values)
                .forEach(value ->
                        {
                            String key = allField.get(atomicInteger.getAndIncrement());
                            map.put(key, value);
                        }
                );
        return map;
    }
}
