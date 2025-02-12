public interface loginResponse {
    boolean success();

    String token();

    String message();

    ResultStatus success();

    UserIdentifier getUserId();

    public enum ResultStatus {
        SUCCESS,
        FAILURE,
        INCORRECT_PASSWORD;
    }

}
