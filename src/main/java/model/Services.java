package model;

public abstract class Services {

    protected String id;

    public Services(String id) {
        this.id = id;
    }

    public Services() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String showInfo();
}
