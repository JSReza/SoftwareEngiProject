package networkapi;

import io.grpc.stub.StreamObserver;
import networkapi.NetworkApi.SendDataRequest;
import networkapi.NetworkApi.SendDataResponse;

public class DataStoreAPIService extends DataStoreAPIGrpc.DataStoreAPIImplBase {

    @Override
    public void storeData(SendDataRequest request, StreamObserver<SendDataResponse> responseObserver) {
        // Process the request
        String data = request.getData();
        System.out.println("Storing data: " + data);

        // Create a response
        SendDataResponse response = SendDataResponse.newBuilder()
                .setStatus("Data stored: " + data)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
