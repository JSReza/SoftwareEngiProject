package edu.softwareeng.sample;

import project.annotations.ProcessAPI;

/**
 * API 2: Process-level API between the compute engine and the layer that knows how to read/write 
 * user data.
 * 
 * DataStoreReadResult defers the decision about how to handle a stream of integers (streaming vs pagination),
 * and also allows for a return value that contains error information
 * 
 * For writing the output, this design accepts one result at a time, and gradually builds up the output. 
 * Other options are to again use pagination, provide a stream/iterable of results, or delay that design
 * decision by using a generic interface (WritableComputationValue or similar).
 * 
 * The WriteResult at the moment just returns an error code - because this is a process
 * boundary, we can't rely on Java Exceptions to propagate across it, so the error values must
 * be handled with the return type
 */
@ProcessAPI
public interface DataStore {
	DataStoreReadResult read(InputConfig input);
	WriteResult appendSingleResult(OutputConfig output, String result, char delimiter);
}
