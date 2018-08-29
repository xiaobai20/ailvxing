package cn.kgc.itrip.exception;

public class ItripException extends Exception {
    private String errorCode;


    public ItripException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
