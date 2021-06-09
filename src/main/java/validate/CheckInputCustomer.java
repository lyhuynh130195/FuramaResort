package validate;

import java.util.Scanner;

public class CheckInputCustomer {

    public static String checkName(Scanner input){
        System.out.println("Nhập họ và tên :");
        while (true){
            try {
                String name = input.nextLine();
                ValidateUser.validateName(name);
                return name;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public static String checkBirthday(Scanner input) {
        System.out.println("Nhập ngày tháng năm sinh :");
        while (true){
            try {
                String birthday = input.nextLine();
                ValidateUser.ValidateBirthday(birthday);
                return birthday;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public static String checkGender(Scanner input) {
        System.out.println("Nhập giới tính :");
        while (true){
            try {
                String gender = input.nextLine();
                ValidateUser.validateGender(gender);
                String newGender = gender.valueOf(gender.charAt(0)).toUpperCase();
                for (int i = 1; i < gender.length(); i++){
                    newGender += gender.valueOf(gender.charAt(i)).toLowerCase();
                }
                return newGender;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public static String checkIDCard(Scanner input) {
        System.out.println("nhập số chứng minh nhân dân :");
        while (true) {
            try {
                String idCard = input.nextLine();
                ValidateUser.ValidateIdCard(idCard);
                return idCard;
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
    }

    public static String checkEmail(Scanner input) {
        System.out.println("Nhập email :");
        while (true) {
            try {
                String email = input.nextLine();
                ValidateUser.validateEmail(email);
                return email;
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
    }

}
