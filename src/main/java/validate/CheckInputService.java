package validate;

import java.util.Scanner;

public class CheckInputService {
    public static String checkIdVilla(Scanner input) {
        final String ID_VILLA_REGEX = "^SVVL-[0-9]{4}";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_VILLA_REGEX)) {
                System.err.println("mời nhập đúng định dạng SVVL-XXXX ");
            } else {
                return id;
            }
        }
    }

    public static String checkIdHouse(Scanner input) {
        final String ID_HOUSE_REGEX = "^SVHO-[0-9]{4}";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_HOUSE_REGEX)) {
                System.err.println("mời nhập đúng định dạng SVHO-XXXX ");
            } else {
                return id;
            }
        }
    }

    public static String checkIdRoom(Scanner input) {
        final String ID_VILLA_REGEX = "^SVRO-[0-9]{4}";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_VILLA_REGEX)) {
                System.err.println("mời nhập đúng định dạng SVRO-XXXX ");
            } else {
                return id;
            }
        }
    }

    public static int checkPoorAreaAndUsableArea(Scanner input) {
        int poorArea;
        while (true) {
            poorArea = Integer.parseInt(input.nextLine());
            if (poorArea < 30) {
                System.out.println("Diện tích hồ bơi,diện tích sử dụng phải lớn hơn 30m2");
            } else {
                return poorArea;
            }
        }
    }


    public static int checkEntalCost(Scanner input) {
        int rentalCost;
        while (true) {
            System.out.println("Nhập chi phí thuê phòng");
            rentalCost = Integer.parseInt(input.nextLine());
            if (rentalCost < 0) {
                System.out.println("Chi phí thue phải lớn hơn không ");
            } else {
                return rentalCost;
            }
        }
    }

    public static int checkMaxPeople(Scanner input) {
        int maxPeople;
        while (true) {
            System.out.println("Nhập số người tối đa");
            maxPeople = Integer.parseInt(input.nextLine());
            if (maxPeople <= 0 || maxPeople >= 20) {
                System.out.println("số người tối đa phải lơn hơn không nhỏ hơn 20 ");
            } else {
                return maxPeople;
            }
        }
    }

    public static int checkNumberFloors(Scanner input) {
        int numberFloors;
        while (true) {
            numberFloors = Integer.parseInt(input.nextLine());
            if (numberFloors < 0) {
                System.out.println("số tầng phải là số nguyên dương ");
            } else {
                return numberFloors;
            }
        }
    }

    public static String checkNameDescriptionRate(Scanner input) {
        final String REGEX = "^[A-Z][a-z]+(\\s[A-Z a-z 0-9]+)*";
        String str;
        while (true) {
            str = input.nextLine();
            if (!str.matches(REGEX)) {
                System.err.println("mời nhập đúng định dạng  ");
            } else {
                return str;
            }
        }
    }

    public static String checkFreeService(Scanner input) {
        final String FREE_SERVICE_REGEX = "(massage|karaoke|food|drink|car)";
        String freeService;
        while (true) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm :");
            freeService = input.nextLine();
            if (!freeService.matches(FREE_SERVICE_REGEX)) {
                System.err.println("Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
            } else {
                return freeService;
            }
        }
    }
}
