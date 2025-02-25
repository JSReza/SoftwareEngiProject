package edu.softwareeng.sample;

import com.google.common.base.Strings;

public class DataStoreReadResultImpl implements DataStoreReadResult {

    private final Iterable<Integer> iterable;
    private final Status statusCode;
    private final String errorMessage;

    public DataStoreReadResultImpl(Iterable<Integer> iterable) {
       this.iterable = iterable;
       this.statusCode = Status.SUCCESS;
       this.errorMessage = "";
    }

    public DataStoreReadResultImpl(String errorMessage) {
        this.iterable = null;
        this.statusCode = Status.FAILURE;
        this.errorMessage = Strings.isNullOrEmpty(errorMessage) ? "Unexpected error" : errorMessage;
    }

    @Override
    public Iterable<Integer> getResults() {
        return iterable;
    }

    @Override
    public Status getStatus() {
       return statusCode;
    }

}
