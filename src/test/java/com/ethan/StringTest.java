package com.ethan;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/26 11:29
 * @Description:
 */
public class StringTest {

    public static void main(String[] args) {
        String msg = "您好，%s 先生,您的验证码为【%s】";
        System.out.println(String.format(msg, "夏","2427"));
    }
}
