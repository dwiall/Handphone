/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class Smartphone {
    String manufaktur;
    String OS;
    String model;
    int harga;

    void displayInfo() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + OS);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
    }
}

class AndroidPhone extends Smartphone {
    String androidKeyStore;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Android Key Store: " + androidKeyStore);
    }
}

class BlackBerry extends Smartphone {
    String PIN;

    void displayInfo() {
        super.displayInfo();
        System.out.println("PIN: " + PIN);
    }
}

class WindowsPhone extends Smartphone {
    String keyStore;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Key Store: " + keyStore);
    }
}

public class PBOLat55 {
    public static void main(String[] args) {
        AndroidPhone samsung = new AndroidPhone();
        samsung.manufaktur = "Samsung";
        samsung.OS = "Android";
        samsung.model = "Grand";
        samsung.harga = 3000000;
        samsung.androidKeyStore = "234ibfd3840fo";

        BlackBerry blackberry = new BlackBerry();
        blackberry.manufaktur = "BlackB";
        blackberry.OS = "RIM";
        blackberry.model = "Curve";
        blackberry.harga = 2000000;
        blackberry.PIN = "BHS249";

        WindowsPhone nokia = new WindowsPhone();
        nokia.manufaktur = "Nokia";
        nokia.OS = "Wind 8";
        nokia.model = "Lumia";
        nokia.harga = 1000000;
        nokia.keyStore = "UUUQIJWORJ";

        samsung.displayInfo();
        System.out.println();
        blackberry.displayInfo();
        System.out.println();
        nokia.displayInfo();
    }
}
