package com.company.classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setName("John Doe");
        client1.setYear(1980);
        client1.setAddress("Budapest, Minta u. 1.");

        System.out.println(client1.getName() + ", " + client1.getYear() + ", " + client1.getAddress());
        client1.migrate("Komló, Hegyhát u. 6.");
        System.out.println(client1.getAddress());
    }

}
