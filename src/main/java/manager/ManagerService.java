package manager;

import controllers.Controllers;
import dao.impl.HouseDao;
import dao.impl.RoomDao;
import dao.impl.VillaDao;
import model.rent.House;
import model.rent.Room;
import model.rent.Villa;
import validate.CheckInputService;

import java.util.Scanner;

public class ManagerService {

    public static void addNewService() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Nhập vào lựa chọn ");
            System.out.println("1.Add New Villa \n" +
                    "2.Add New House \n" +
                    "3.Add New Room \n" +
                    "4.Back to menu \n" +
                    "5.Exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    VillaDao villaDao = new VillaDao();
                    Villa villa = CreatNewVilla();
                    villaDao.addNewService(villa);
                    break;
                case "2":
                    HouseDao houseDao = new HouseDao();
                    House house = creatNewHouse();
                    houseDao.addNewService(house);
                    break;
                case "3":
                    RoomDao roomDao = new RoomDao();
                    Room room = CreatNewRoom();
                    roomDao.addNewService(room);
                case "4":
                    flag = false;
                    Controllers.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }
        } while (flag);
    }

    private static Room CreatNewRoom() {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        Room room = null;
        do {
            try {
                System.out.println("Nhập vào thông tin room cần thêm vào ");
                String id = CheckInputService.checkIdRoom(scanner);
                System.out.println("Nhập vào tên :");
                String name = CheckInputService.checkNameDescriptionRate(scanner);
                System.out.println("Nhập vào diện tích sử dụng");
                int usableArea = CheckInputService.checkPoorAreaAndUsableArea(scanner);
                double rentalCost = CheckInputService.checkEntalCost(scanner);
                int maxNUmberPeople = CheckInputService.checkMaxPeople(scanner);
                System.out.println("Nhập vào kiểu thuê");
                String rentalType = scanner.nextLine();
                String freeServicesIncluded = CheckInputService.checkFreeService(scanner);

                room = new Room(id, name, usableArea, rentalCost, maxNUmberPeople, rentalType, freeServicesIncluded);

                flag = false;
            } catch (NumberFormatException e) {
                e.getStackTrace();
                System.out.println("Mời nhập lại :");
                flag = true;
            } catch (Exception e) {
                e.getStackTrace();
                System.out.println("Mời nhập lại ");
                flag = true;
            }
        } while (flag);
        return room;
    }

    private static House creatNewHouse() {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        House house = null;
        do {
            try {
                System.out.println("Nhập vào thông tin house cần thêm vào ");
                String id = CheckInputService.checkIdHouse(scanner);
                System.out.println("Nhập vào tên :");
                String name = CheckInputService.checkNameDescriptionRate(scanner);
                System.out.println("Nhập vào diện tích sử dụng");
                int usableArea = CheckInputService.checkPoorAreaAndUsableArea(scanner);
                double rentalCost = CheckInputService.checkEntalCost(scanner);
                int maxNUmberPeople = CheckInputService.checkMaxPeople(scanner);
                System.out.println("Nhập vào kiểu thuê");
                String rentalType = scanner.nextLine();
                System.out.println("Tiêu chuẩn phòng ");
                String rate = CheckInputService.checkNameDescriptionRate(scanner);

                System.out.println("Mô tả tiện nghi ");
                String description = scanner.nextLine();
                System.out.println("Số tầng :");
                int numberFloors = CheckInputService.checkNumberFloors(scanner);
                house = new House(id, name, usableArea, rentalCost,
                        maxNUmberPeople, rentalType, rate, description, numberFloors);
                flag = false;
            } catch (NumberFormatException e) {
                e.getStackTrace();
                System.out.println("Mời nhập lại ");
                flag = true;
            } catch (Exception e) {
                System.out.println("Mời nhập lại ");
                flag = true;
            }
        } while (flag);
        return house;
    }

    private static Villa CreatNewVilla() {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        Villa villa = null;
        do {
            try {
                System.out.println("Nhập vào thông tin villa cần thêm vào ");
                String id = CheckInputService.checkIdVilla(scanner);
                System.out.println("Nhập vào tên :");
                String name = CheckInputService.checkNameDescriptionRate(scanner);
                System.out.println("Nhập vào diện tích sử dụng");
                int usableArea = CheckInputService.checkPoorAreaAndUsableArea(scanner);
                double rentalCost = CheckInputService.checkEntalCost(scanner);
                int maxNUmberPeople = CheckInputService.checkMaxPeople(scanner);
                System.out.println("Nhập vào kiểu thuê");
                String rentalType =scanner.nextLine();
                System.out.println("Tiêu chuẩn phòng ");
                String rate = CheckInputService.checkNameDescriptionRate(scanner);

                System.out.println("Mô tả tiện nghi ");
                String description = scanner.nextLine();
                System.out.println("Số tầng :");
                int numberFloors = CheckInputService.checkNumberFloors(scanner);
                System.out.println("Diện tích hồ bơi :");
                int poorArea = CheckInputService.checkPoorAreaAndUsableArea(scanner);
                villa = new Villa(id, name, usableArea, rentalCost,
                        maxNUmberPeople, rentalType, rate, description, numberFloors, poorArea);
                flag = false;
            } catch (NumberFormatException e) {
                e.getStackTrace();
                System.out.println("Mời nhập lại ");
                flag = true;
            } catch (Exception e) {
                System.out.println("Mời nhập lại ");
                flag = true;
            }
        } while (flag);
        return villa;
    }

    public static void showService() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Nhập vào lựa chọn :");
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    VillaDao villaDao = new VillaDao();
                    villaDao.showServices();
                    break;
                case "2":
                    HouseDao houseDao = new HouseDao();
                    houseDao.showServices();
                    break;
                case "3":
                    RoomDao roomDao = new RoomDao();
                    roomDao.showServices();
                    break;
                case "4":
                    VillaDao villaDao1 = new VillaDao();
                    villaDao1.showAllNameNotDuplicate();
                    break;
                case "5":
                    HouseDao houseDao1 = new HouseDao();
                    houseDao1.showAllNameNotDuplicate();
                    break;
                case "6":
                    RoomDao roomDao1 = new RoomDao();
                    roomDao1.showAllNameNotDuplicate();
                    break;
                case "7":
                    flag = false;
                    Controllers.displayMainMenu();
                    break;
                case "8":
                    System.exit(0);
                    break;
                default:
                    System.out.println("mời nhập lại :");
                    break;
            }
        } while (flag);
    }
}
