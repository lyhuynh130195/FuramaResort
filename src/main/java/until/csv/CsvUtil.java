package until.csv;

/**
 * interface thao tác với file csv
 * @param <T>
 */
public interface CsvUtil<T> {
    String writeHeader(T src);
    String toCsv(T src);
    T fromCsv(String csvLine, Class<T> classOfT) ;
    void delete(String t,Class<T> classOfT);
}
