package networkapi;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class NetworkAPIServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;

        Server server = ServerBuilder.forPort(port)
                .addService(new NetworkAPIService())
                .build();

        System.out.println("Starting gRPC server on port " + port);
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server...");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
