package com.github.makewheels.algorithm.test;

import java.awt.*;

public class TestSendWindowsNotification {
    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()) {
            displayTray();
        } else {
            System.err.println("System tray not supported!");
        }
    }

    public static void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();

        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Hello, World", "notification demo", TrayIcon.MessageType.INFO);
    }
}
