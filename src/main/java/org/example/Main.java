package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        aptUpdate();
    }

    private static void aptUpdate() {
        String line;

        String[] commands = {
                "gnome-terminal", "--wait", "--",
                "bash", "-c",
                "sudo apt update && sudo apt upgrade -y && sudo apt autopurge -y && sudo apt clean; exec bash"
        };

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(commands);
            System.out.println("processbuilder olusturuldu");

            Process process = processBuilder.start();
            System.out.println("process.start()");

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