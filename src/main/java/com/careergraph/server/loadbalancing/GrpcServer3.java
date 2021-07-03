package com.careergraph.server.loadbalancing;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer3
{

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(7576)
                .addService(new BankService())
                .build();

        server.start();

        System.out.println(" GRPC Server started");
        server.awaitTermination();


    }
}
