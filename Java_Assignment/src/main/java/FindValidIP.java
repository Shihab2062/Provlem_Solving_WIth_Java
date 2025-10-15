import java.util.Scanner;

public class FindValidIP {

    public static void main(String[] args) {

        String[] IPs = {"192.168.0.1",
                "172.16.56",
                "0.0.0.1",
                "1.12.72.2"};

        for (String ip : IPs) {
            System.out.println(ip + "->" + (CheckIP(ip) ? "Valid" : "Invalid"));
        }
    }

    public static boolean CheckIP(String IPAddress) {
        String[] SplitIP = IPAddress.split("\\.");
        if (SplitIP.length != 4) return false;

        for (String part : SplitIP) {
            if (!part.matches("\\d+")) return false;
        }
        String firstPart = SplitIP[0];

        if (firstPart.startsWith("0")) return false;
        if (firstPart.length() == 1) return false;
        return true;
    }
}
