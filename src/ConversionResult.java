public class ConversionResult {
    private final Status status;
    private final String message;

    public ConversionResult(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;

}

}
