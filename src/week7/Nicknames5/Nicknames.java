package week7.Nicknames5;

import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!

        HashMap<String, String> obj = new HashMap<String, String>();

        obj.put("matti", "mage");
        obj.put("mikael", "mixu");
        obj.put("arto", "arppa");

        obj.get("mikael");
    }

}
