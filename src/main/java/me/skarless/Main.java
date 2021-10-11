package me.skarless;

import me.skarless.utils.TrickordTreat;

import java.io.IOException;

public class Main {

    // Bot Settings
    public static final String TOKEN = "YOUR TOKEN HERE";
    public static final boolean DEBUG = true;
    public static final int DELAY_MIN = 10;
    public static final int DELAY_MAX = 35;

    // In the beginning, there was public static void main(String[] args)
    public static void main(String[] args) throws IOException {
        new TrickordTreat();
    }

}
