package com.company;

import java.nio.charset.Charset;
import java.util.Base64;

public class Main {
    private static final Charset UTF_8 = Charset.forName("utf-8");

    public static void main(String[] args) {
        String text = "раз два три";
//        String text = "one two three";
        String key = "key";

        String encrypted = encrypt(text, key);

        System.out.println(encrypted);

        String decrypted = decrypt(encrypted, key);

        System.out.println(decrypted);
    }

    private static String encrypt(String text, String key) {
        byte[] textBytes = text.getBytes(UTF_8);
        byte[] keyBytes = key.getBytes(UTF_8);

        crypt(textBytes, keyBytes);

        return Base64.getEncoder().encodeToString(textBytes);
    }

    private static String decrypt(String encrypted, String key) {
        byte[] textBytes = Base64.getDecoder().decode(encrypted);
        byte[] keyBytes = key.getBytes(UTF_8);

        crypt(textBytes, keyBytes);

        return new String(textBytes, UTF_8);
    }

    private static void crypt(byte[] textBytes, byte[] keyBytes) {
        for (int i = 0; i < textBytes.length; i++)
            textBytes[i] ^= keyBytes[i % keyBytes.length];
    }
}
