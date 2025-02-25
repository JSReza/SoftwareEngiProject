package edu.softwareeng.sample;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinatorTest {

	@Test
	public void smokeTest() {
		// mock out the dependencies so that we're just checking the ComputationCoordinator
		DataStore dataStore = mock(DataStore.class);
		ComputeEngine computeEngine = mock(ComputeEngine.class);
		
		when(dataStore.read(any(InputConfig.class)))
		   .thenReturn(new DataStoreReadResultImpl(new ArrayList<Integer>()));
		
		ComputationCoordinator coord = new CoordinatorImpl(dataStore, computeEngine);
		
		// mock out the parameters
		ComputeRequest mockRequest = mock(ComputeRequest.class);
        when(mockRequest.getInputConfig()).thenReturn(mock(InputConfig.class));
        when(mockRequest.getOutputConfig()).thenReturn(mock(OutputConfig.class));
        
		ComputeResult result = coord.compute(mockRequest);
		
		// simple check for right now - just say the result must be successful
		Assertions.assertEquals(result.getStatus(), ComputeResult.ComputeResultStatus.SUCCESS);
	}
}
