package org.example.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Terminal {
    public static void run(String[] commands) {
        String line;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
