package dao;

import until.AbstractDao;
import until.FileCSVDao;


public abstract class ServiceDao<T> {
    protected final AbstractDao<T> fileCSVDao;

    protected ServiceDao(String filePath, Class<T> tClass) {
        this.fileCSVDao = new FileCSVDao<>(filePath, tClass);
    }

    abstract protected void showAllNameNotDuplicate();

    abstract protected void addNewService(T t);

    abstract protected void showServices();

}
