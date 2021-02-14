package sk.kosickaakademia.kincel.chat.util;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

import java.math.BigInteger;

public class Util {

    public String getMd(String input)
    {

        try {

            MessageDigest message_digest = MessageDigest.getInstance("Message Digest");

            byte[] messageDigest = message_digest.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {

            throw new RuntimeException(e);
        }
    }
}
