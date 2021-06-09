package model;

import enum_service.CustomerType;

public class Customer implements Comparable<Customer>{
    private String fullName;
    private String birthday;
    /**
     * giới tính
     */
    private String gender;
    /**
     * số cmnd ;
     */
    private String idCardNumber;

    private String phoneNumber;
    private String email;
    /**
     * loại khách hàng.
     */
    private CustomerType level;

    /**
     * địa chỉ
     */
    private String address;

    /**
     * dịch vụ sử dụng.
     */
//    private List<Services> servicesUsed;
//
//    private Contract contract;
    public Customer() {
    }

    public Customer(String fullName, String birthday, String gender, String idCardNumber, String phoneNumber, String email,
                    CustomerType level, String address) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.address = address;
//        this.servicesUsed = servicesUsed;
//        this.contract = contract;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getLevel() {
        return level;
    }

    public void setLevel(CustomerType level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public List<Services> getServicesUsed() {
//        return servicesUsed;
//    }
//
//    public void setServicesUsed(List<Services> servicesUsed) {
//        this.servicesUsed = servicesUsed;
//    }
//
//    public Contract getContract() {
//        return contract;
//    }
//
//    public void setContract(Contract contract) {
//        this.contract = contract;
//    }

    public String showInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender=" + gender +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", address='" + address + '\'' +
//                ", servicesUsed=" + servicesUsed +
//                ", contract=" + contract +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getFullName().compareTo(o.getFullName());
    }

}
