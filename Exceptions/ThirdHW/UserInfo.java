package Exceptions.ThirdHW;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfo {
    String name;
    String surname;
    String patronymic;

    Date date;

    int numberPhone;

    String gender;

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        return String.format("%s %s %s %s %d %s", this.name, this.surname, this.patronymic, dateFormat.format(date), numberPhone, gender);
    }
}
