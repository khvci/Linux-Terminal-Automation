package org.example.tools;

import static org.example.tools.Terminal.run;

public class APT {
    public static void update() {
//        String line;

        String[] commands = {
                "gnome-terminal", "--wait", "--",
                "bash", "-c",
                "sudo apt update && sudo apt upgrade -y && sudo apt autopurge -y && sudo apt clean; exec bash"
        };

        run(commands);
    }
}
