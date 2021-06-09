package dao;

import model.Booking;
import until.AbstractDao;
import until.FileCSVDao;

public class BookingDao {
    private final String path = "Case_study2/src/main/java/data/Booking.csv";
    private final AbstractDao<Booking> bookingAbstractDao= new FileCSVDao<>(path, Booking.class);

    public BookingDao() {
    }

    public String getPath() {
        return path;
    }

    public AbstractDao<Booking> getBookingAbstractDao() {
        return bookingAbstractDao;
    }

    public void add(Booking booking){
        bookingAbstractDao.save(booking);
    }
}
