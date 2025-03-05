package API_Package;
import API_Package.NetworkAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class MultithreadedNetworkAPI {
    private static final int MAX_THREADS = 4;
    private final ExecutorService executorService;

    public MultithreadedNetworkAPI() {
        this.executorService = Executors.newFixedThreadPool(MAX_THREADS);
    }

    public void shutdown(){
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
           
        }
    }
}
    
