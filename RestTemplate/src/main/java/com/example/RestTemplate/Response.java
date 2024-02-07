package com.example.RestTemplate;

public class Response {
    private String timestamp;
    private int statusCode;
    private String statusMsg;
    private Object customMsg;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public Object getCustomMsg() {
        return customMsg;
    }

    public void setCustomMsg(Object customMsg) {
        this.customMsg = customMsg;
    }

    public Response(String timestamp, int statusCode, String statusMsg, Object customMsg) {
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
        this.customMsg = customMsg;
    }

    @Override
    public String toString() {
        return "Response{" +
                "timestamp='" + timestamp + '\'' +
                ", statusCode=" + statusCode +
                ", statusMsg='" + statusMsg + '\'' +
                ", customMsg=" + customMsg +
                '}';
    }
}
