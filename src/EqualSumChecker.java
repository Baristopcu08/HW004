public class EqualSumChecker {
    //TODO: Please open the readme.txt file and answer 5th question.
    public static void main(String[] args) {

       System.out.println(hasEqualSum(1,-1,0));

    }
    public static boolean hasEqualSum(int s1, int s2, int s3)
    {
        if (s1+s2==s3)
        {
            return true;
        }
        else { return false;}

    }
}
