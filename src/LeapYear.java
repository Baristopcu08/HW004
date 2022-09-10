public class LeapYear {
    //TODO: Please open the readme.txt file and answer 4th question.
    public static void main(String[] args) {
    isLeapYear(200000);
    }
    public static void isLeapYear(int x)
    {
        if (x < 0)
        {
            System.out.println(false);
        }
        else
        {
            if (x % 4 == 0 & x % 100 == 0 & x % 400 == 0 & x>0 & x<1000)
                {
                System.out.println(true);
                }
            else
                {
                System.out.println(false);
                }
        }
    }
}