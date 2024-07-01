package utils;

import com.github.javafaker.Faker;

public class DataUtils {

    public static String getRandomEmail(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String randomEmail = firstName+"."+lastName+"@test.com";
        return randomEmail;
    }
}
