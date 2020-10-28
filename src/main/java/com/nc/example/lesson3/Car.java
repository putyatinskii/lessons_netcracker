package com.nc.example.lesson3;

public class Car {
    private String type;
    private int price;
    private String firm;

    private String equipment;
    private String model;
    private int number_of_seats;

    private Car(Builder builder) {
        this.type = builder.type;
        this.price = builder.price;
        this.firm = builder.firm;
        this.equipment = builder.equipment;
        this.model = builder.model;
        this.number_of_seats = builder.number_of_seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public static class Builder {
        private String type;
        private int price;
        private String firm;

        private String equipment;
        private String model;
        private int number_of_seats;

        public Builder(String type, int price, String firm) {
            this.type = type;
            this.price = price;
            this.firm = firm;
        }

        public Builder equipment(String equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder number_of_seats(int number_of_seats) {
            this.number_of_seats = number_of_seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", firm='" + firm + '\'' +
                ", equipment='" + equipment + '\'' +
                ", model='" + model + '\'' +
                ", number_of_seats=" + number_of_seats +
                '}';
    }
}
