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

    public static boolean arrayFront9(int[] nums) {
    int end = nums.length;
    if (nums.length > 4)
    {
        end = 4;
    }
    for(int i = 0 ; i < end ; i++)
    {
        if(nums[i]==9)
        {
        return true;
        }
    }return false;
    }

    public static boolean array123(int[] nums) {
    if (nums.length < 3) return false;
    for (int i = 0 ; i < nums.length-2 ; i++)
    {
        if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
    }
    return false;
    }

    public static int stringMatch(String a, String b) {
    int len = Math.min(a.length(), b.length());
    int count = 0;
    
    for(int i = 0 ; i < len -1 ; i++)
    {
        if(a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
    }
    return count;
    }

    public static String stringX(String str) {
    String neew = "";
    for (int i = 0 ; i < str.length() ; i++)
    {
        if(!((i>0 && i < str.length()-1) && str.substring(i,i+1).equals("x")))
        {
        neew = neew + str.substring(i,i+1);
        }
    }
    return neew;
    }

    public static String altPairs(String str) {
    String neew = "";
    for (int  i = 0; i < str.length() ; i+=4)
    {
        int index2 = i+2;
        if(index2 > str.length())
        {
        index2 = str.length();
        }
        neew = neew + str.substring(i,index2);
    }
    return neew;
    }

    public static String stringYak(String str) {
    String neew = "";
    for ( int i = 0 ; i < str.length() ; i++)
    {
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
        i =  i + 2;
        } else {
        neew = neew + str.charAt(i);
        }
    }
    
    return neew;
    }

    public static int array667(int[] nums) {
    int count = 0;
    if (nums.length < 2) return 0;
    for (int i = 0 ; i < nums.length ; i++)
    {
        if(nums[i] == 6 && (i+1<nums.length && (nums[i+1] == 6 || nums[i+1]==7 )))
        {
        count++;
        }
    }
    return count;
    }

    public static boolean noTriples(int[] nums) {
    if (nums.length < 3) return true;
    for (int i = 0 ; i < nums.length ; i++)
    {
        if(i+2<nums.length && ( nums[i] == nums[i+1] && nums[i+1] == nums[i+2]  ))
        {
        return false;
        }
    }
    return true;
    }

    public static boolean has271(int[] nums) {
    for (int i = 0 ; i < nums.length-2 ; i++) 
    {
        int number = nums[i];
        if(nums[i+1] == (number+5) && Math.abs(nums[i+2] - (number-1)) <=2)
        {
        return true;
        }
    }
    return false;
    }


}
