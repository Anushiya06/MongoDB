package com.example;

public class Main {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        var client = com.mongodb.client.MongoClients.create(uri);
        var database = client.getDatabase("MusicLib");

        System.out.println("Connected to the MusicLib database!");

        for (var name : database.listCollectionNames()) {
            System.out.println("Collection: " + name);
        }

        client.close();
    }
}

    