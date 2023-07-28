package org.example.DesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student student= Student.getBuilder()
                .setName("Amar")
                .setAge(30)
                .setGender("Male")
                .setGradYear(2013)
                .setAddress("Mira Road")
                .build();

        System.out.println("Debug");
    }
}
