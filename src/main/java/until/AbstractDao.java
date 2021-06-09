package until;

import java.util.List;

/**
 * interface giao tiếp với data
 * @param <T>
 */
public interface AbstractDao<T> {
    void save(T t);
    List<T> showList();
    T update(T t);
    void delete(String id);
}
