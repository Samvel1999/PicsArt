package service;

import model.Laptop;

public class LaptopService {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setId(1);
        laptop.setModel("Asus");
        laptop.setSpeed(350);
        laptop.setRam(16);
        laptop.setHd(10);
        laptop.setPrice(1200);
        laptop.setScreen(15);

        System.out.println("Id: " + laptop.getId());
        System.out.println("Model: " + laptop.getModel());
        System.out.println("Speed: " + laptop.getSpeed());
        System.out.println("Ram: " + laptop.getRam());
        System.out.println("Hd: " + laptop.getHd());
        System.out.println("Price: " + laptop.getPrice());
        System.out.println("Screen: " + laptop.getScreen());
    }
}
