package advanced.java_sha_256;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static java.lang.System.in;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());
        byte[] digest = md.digest();

        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb);
    }
}
