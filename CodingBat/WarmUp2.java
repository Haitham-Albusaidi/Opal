package CodingBat;

public class WarmUp2 {
    public static void main(String[] args) {
        
    }
    public static String stringTimes(String str, int n) {
    String neew = "";
    for (int i = 0 ; i < n ; i++)
    {
        neew = neew + str;
    }
    return neew;
    }

    public static String frontTimes(String str, int n) {
    int front = 3;
    if (front > str.length())
    {
        front = str.length();
    }
    
    String neew = str.substring(0,front);
    String result = "";
    for (int i = 0 ; i < n  ; i++)
    {
        result = result + neew;
    }
    return result;
    }

    public static int countXX(String str) {
    int xNumber = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.substring(i,i+2).equals("xx")) 
        {
            xNumber++;
        }
    }
    return xNumber;
    }

    public static boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i==-1) return false;
    if (i+1 >= str.length()) return false; 

        
    
    return str.substring(i+1,i+2).equals("x");
    }

    public static String stringBits(String str) {
    String neew = "";
    for (int i = 0; i < str.length(); i = i+2)
    {
        neew = neew + str.charAt(i);
    }
    return neew;
    }

    public static String stringSplosion(String str) {
    String neew = "";
    for (int i = 0 ; i < str.length() ; i++)
    {
        neew = neew + str.substring(0,i+1);
    }
    return neew;
    }

    public static int last2(String str) {
        if(str.length() <=1) return 0;
    int count = 0;
    String target = str.substring(str.length()-2);
    for (int i = 0 ; i < str.length()-2; i++)
    {
        if(str.substring(i,i+2).equals(target) )
        {
        count++;
        }
    }
    return count;
    }

    public static int arrayCount9(int[] nums) {
    int count = 0;
    for(int i : nums)
    {
        if (i == 9) count++;
    }
    return count;
    }

}
