package com.jnuuni.senior.usertrack.test;


import java.io.*;

public class ProcessTest {
    public static void main(String[] args){
        String command = "sh /opt/modules/meituan/test.sh "+args[0];
        try {
            Process process = Runtime.getRuntime().exec(command);
            int exitValue = process.waitFor();
            if (exitValue == 0){
                System.out.println("Success!!" + exitValue);
            } else {
                System.out.println("Failure!!" + exitValue);
                InputStream is = process.getErrorStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line = null;
                System.out.println("===================Error Msg==================");
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
                System.out.println("===================Error Msg==================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
