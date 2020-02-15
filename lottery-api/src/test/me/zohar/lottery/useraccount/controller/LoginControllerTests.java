package test.me.zohar.lottery.useraccount.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginControllerTests {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("admin"));
    }
}
