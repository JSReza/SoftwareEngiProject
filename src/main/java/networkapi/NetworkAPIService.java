package networkapi;

import io.grpc.stub.StreamObserver;
import networkapi.NetworkApi.SendDataRequest;
import networkapi.NetworkApi.SendDataResponse;

public class NetworkAPIService extends NetworkAPIGrpc.NetworkAPIImplBase {

    @Override
    public void sendData(SendDataRequest request, StreamObserver<SendDataResponse> responseObserver) {
        // Process the request
        String data = request.getData();
        System.out.println("Received data: " + data);

        // Create a response
        SendDataResponse response = SendDataResponse.newBuilder()
                .setStatus("Data received: " + data)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
