package io.github.pedroagrs.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class UserServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Server running...");

        Server server = ServerBuilder.forPort(9090).build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
