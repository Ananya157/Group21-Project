package com.springboot.onlineiplauction.CommonRepository;

public class CommonResponse {
	private int ResponseStatus;
    private String ResponseMessage;
    private Object ResposeContent;

    public CommonResponse() {

    }

    public CommonResponse(int responseStatus, String responseMessage, Object resposeContent) {
        ResponseStatus = responseStatus;
        ResponseMessage = responseMessage;
        ResposeContent = resposeContent;
    }

    public int getResponseStatus() {
        return this.ResponseStatus;
    }

    public String getResponseMessage() {
        return this.ResponseMessage;
    }

    public Object getResposeContent() {
        return this.ResposeContent;
    }

    public void setResponseStatus(int responseStatus) {
        this.ResponseStatus = responseStatus;
    }

    public void setResponseMessage(String responseMessage) {
        this.ResponseMessage = responseMessage;
    }

    public void setResposeContent(Object resposeContent) {
        this.ResposeContent = resposeContent;
    }
}
