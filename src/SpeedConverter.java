import java.security.PublicKey;

public class SpeedConverter {
    //TODO: Please open the readme.txt file and answer 1st and 2nd questions.

       //TODO /*DİKKAT
        /*BEN BU MİLL HESAPLAMA KATSAYISI VE MİLL SAAT KONUSUNU ANLAMADIM.
        ALGORİTMAM DOĞRU OLABİLİR FAKAT SONUÇLARIN HATALIDIR*/

    public static void main(String[] args) {

        System.out.println((int)Math.round(toMilesPerHour(-5.6)));
    }
    public static double toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour<0)
        {
            return -1;
        }
        else{
            return kilometersPerHour/2.23693629;
        }



    }


}
