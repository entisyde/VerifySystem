package com.entisy.verify;

import java.util.Random;

public class Verify {

    private int length = 7;
    private String verificationCode = "";

    public Verify(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Verify() {}

    public void generateNew() {
        Random random = new Random();
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < length; i++) {
            int j = random.nextInt(2);
            if (j == 0) verificationCode += lowercaseLetters.charAt(random.nextInt(26));
            if (j == 1) verificationCode += uppercaseLetters.charAt(random.nextInt(26));
        }
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public boolean verify(String input) {
        return input.equals(verificationCode);
    }
}
