package Exceptions.ThirdHW;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Parser {
    public UserInfo parseParams(String[] params) throws CustomException {

        UserInfo data = new UserInfo();
        data.name = params[0];

        if (params[1].isEmpty()) {
            throw new CustomException("Вы не ввели фамилию, или добавили лишний пробел.");
        }

        data.surname = params[1];

        if (params[2].isEmpty()) {
            throw new CustomException("Вы не ввели отчество, или добавили лишний пробел.");
        }

        data.patronymic = params[2];

        if (params[3].isEmpty()) {
            throw new CustomException("Вы не ввели дату, или добавили лишний пробел.");
        }

        try {
            DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
            data.date = formatter.parse(params[3]);
        } catch (ParseException ex) {
            throw new CustomException("Правильный формат даты dd.mm.yyyy ! Вы ввели не правильный формат " + ex.getMessage());
        }

        try {
            data.numberPhone = Integer.parseInt(params[4]);
        } catch (NumberFormatException ex) {
            throw new CustomException("Правильный формат это цифры целые ! Вы ввели не правильный формат " + ex.getMessage());
        }


        if (params[5].isEmpty()) {
            throw new CustomException("Вы не ввели пол.");
        }


        if ("f".matches(params[5]) || "m".matches(params[5])) {
            data.gender = params[5];
        } else {
            throw new CustomException("Правильный формат это f или m! Вы ввели не правильный формат ");
        }

        return data;
    }
}
