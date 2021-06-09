package validate;

import java.time.Year;

public class ValidateUser {
    public static void validateName(String name) throws UserException {
        final String REGEX_NAME = "^[A-Z][a-zA-Z]+(\\s[A-Z][a-z]+)*$";
        if (!name.matches(REGEX_NAME)) {
            throw new UserException("Tên khách hàng không đúng");
        }
    }

    public static void validateEmail(String email) throws UserException {
        final String EMAIL_REGEX = "^[A-Z a-z][A-Z a-z 0-9]+@[A-Z a-z]+\\.[a-z]+";
        if (!email.matches(EMAIL_REGEX)) {
            throw new UserException("Email phải đúng định dạng abc@abc.com");
        }
    }

    public static void validateGender(String gender) throws UserException {
        String genders =gender.toLowerCase();

        final String GENDER_REGEX = "male|female|unknow";

        if (!genders.matches(GENDER_REGEX)) {
            throw new UserException("Vui lòng nhập lại");
        }
    }

    public static void ValidateIdCard(String idCard) throws UserException {
        final String ID_CARD_REGEX = "^[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}$";
        if (!idCard.matches(ID_CARD_REGEX)) {
            throw new UserException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }

    public static void ValidateBirthday(String birthday) throws UserException {
        final String BIRTHDAY_REGEX = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)[0-9]{2})$";
        int yearOfBirth = Integer.parseInt(birthday.substring(6));
        int yearNow = Year.now().getValue();
        if (!birthday.matches(BIRTHDAY_REGEX) || yearOfBirth <= 1990 && (yearNow - yearOfBirth) < 18) {
            throw new UserException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
        }
    }
}
