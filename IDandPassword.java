package SnakeProject;

import java.util.HashMap;

public class IDandPassword {
    HashMap<String ,String> loginInfo = new HashMap<String ,String>();

    IDandPassword(){
        loginInfo.put("Heshmat","S4030");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
