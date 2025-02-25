package edu.softwareeng.sample;

import javax.annotation.Nullable;

public interface DataStoreReadResult {

    public static enum Status {
        SUCCESS,
        FAILURE;
    }

    @Nullable // Marker annotation - we can say that if the status isn't successful,
    // then this method will return null. Could also use an empty list as a sentinel value
    public Iterable<Integer> getResults();
    
    public Status getStatus();
}
