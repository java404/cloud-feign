package cn.com.dnt.feign.handing;

public class StashServerException extends RuntimeException {
    private int status;
    private String reason;

    public StashServerException(){}

    public StashServerException(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public StashServerException(String message) {
        super(message);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
