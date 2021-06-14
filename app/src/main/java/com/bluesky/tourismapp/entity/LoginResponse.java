package com.bluesky.tourismapp.entity;

public class LoginResponse {

    /**
     * msg : success
     * code : 200
     * access_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MjQzODgwMzEsInN1YiI6IjEifQ.1Qrl8k6zlsSXwFSD7CgRdygdJ_5kabR0WRBfoN6ZVmE
     * token_type : bearer
     */

    private String msg;
    private int code;
    private String access_token;
    private String token_type;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }
}
