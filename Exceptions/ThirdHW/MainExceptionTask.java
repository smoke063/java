package Exceptions.ThirdHW;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainExceptionTask {
    private UserInfo inputData() {
        System.out.println("Введите следующие данные, разделенные пробелом: Фамилия Имя Отчество датарождения номертелефона пол");
        Scanner in = null;
        UserInfo userInfo = null;
        try {
            in = new Scanner(System.in);
            String str = in.nextLine().trim();
            if (str.isEmpty()) {
                throw new Exception("Вы ввели пустую строку!");
            }
            String[] inputData = str.split(" ");
            CountParamsValidator countParamsValidator = new CountParamsValidator();
            if (countParamsValidator.isCountValid(inputData.length)) {
                userInfo = new Parser().parseParams(inputData);
            } else {
                System.out.println(countParamsValidator.getMessage(inputData.length));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return userInfo;
    }

    private void saveUserInfo(UserInfo userInfo) {

        Path path = Paths.get(userInfo.surname + ".txt");
        boolean isExist = Files.exists(path);

        try (FileWriter writer = new FileWriter(userInfo.surname + ".txt", isExist)) {

            writer.write(userInfo.toString());
           
            if (isExist)
                writer.append(System.lineSeparator());

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Run() {
        UserInfo userInfo = this.inputData();
        this.saveUserInfo(userInfo);
    }
}
