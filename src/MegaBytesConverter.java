public class MegaBytesConverter {
    //TODO: Please open the readme.txt file and answer 3rd question.
    public static void main(String[] args) {

    printMegaBytesAndKiloBytes(-5000);
    }

    public static  void printMegaBytesAndKiloBytes (int kiloBytes)
    {
        if (kiloBytes<0)
        {
            System.out.println("parametre 0'dan küçük olduğundan Geçersiz Değer.");
        }else {
            int mB = kiloBytes / 1024;
            int kB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mB + " MB ve " + kB + " KB");
        }
    }
}
