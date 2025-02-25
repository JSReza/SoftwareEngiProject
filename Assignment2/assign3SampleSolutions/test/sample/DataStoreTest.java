package edu.softwareeng.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import edu.softwareeng.sample.WriteResult.WriteResultStatus;

/*
 * In this case, I've split out the smoke tests into two tests, one per method. It's also fine to consolidate
 * these into a single test
 */
public class DataStoreTest {

	@Test
	public void smokeTestRead() throws Exception {
		InputConfig inputConfig = Mockito.mock(InputConfig.class);
		
		DataStore dataStore = new DataStoreImpl();
		Assertions.assertEquals(dataStore.read(inputConfig).getStatus(), DataStoreReadResult.Status.SUCCESS);
	}
	
	@Test
	public void smokeTestWrite() throws Exception {
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		DataStore dataStore = new DataStoreImpl();
		
		// assertEquals will use .equals, so this type of call is generally safe for any Object, but for enums you can also use ==
		// Note that if your dummy implementation returns null, this will NPE - that's fine! As long as the test fails,
		// the exact failure doesn't matter
		Assertions.assertEquals(WriteResultStatus.SUCCESS, dataStore.appendSingleResult(outputConfig, "result", ';').getStatus());
	}
}
