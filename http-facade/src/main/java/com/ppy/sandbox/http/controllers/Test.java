package com.ppy.sandbox.http.controllers;

import java.security.Security;

public class Test {
    public static void main(String[] args) {
        Security.setProperty("jdk.jar.disabledAlgorithms", "MD2, MD5, RSA keySize < 1024, DSA keySize < 1024");
        System.out.println("====" + Security.getProperty("jdk.jar.disabledAlgorithms") + ":" + Security.getProperty("java.security.properties"));
    }
}
