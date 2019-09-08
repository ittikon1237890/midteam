package com.example.midterm07600532;

public class Auth {
    private static final String USERNAME1 = "aaa";
    private static final String PASSWORD1 = "111";
    private static final String USERNAME2 = "bbb";
    private static final String PASSWORD2 = "222";
    private  String mUsername;
    private String mPassword;

    public String getMusername() {
        return mUsername;
    }

    public void setMusername(String musername) {
        this.mUsername = musername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean check1(){
        if(mUsername.equals(USERNAME1) && mPassword.equals(PASSWORD1) || mUsername.equals(USERNAME2) && mPassword.equals(PASSWORD2)){
            return true;
        }else {
            return false;
        }

    }


}
