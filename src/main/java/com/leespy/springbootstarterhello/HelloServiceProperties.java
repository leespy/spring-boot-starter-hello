
package com.leespy.springbootstarterhello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Date 2018/12/7 9:27 AM
 * Author muse
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    // 在application.properties中通过hello.msg= 来设置，若不设置，默认为hello.msg=world
    private static final String MSG = "world";

    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
