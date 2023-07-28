package org.example.DesignPattern.Builder;

public class Student {

    private String name;
    private int age;
    private String gender;
    private int gradYear;
    private String address;

    private Student(){}

    public  static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        if(builder.getGradYear()>2022) {
            throw new IllegalArgumentException("Grad year is more than 2022 ");
        }
        this.name=builder.getName();
        this.age=builder.getAge();
        this.gender=builder.getGender();
        this.gradYear=builder.getGradYear();
        this.address=builder.getAddress();
    }



     static class Builder{

     private String name;
     private int age;
     private String gender;
     private int gradYear;
     private String address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return  this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(this);

        }
    }



}
