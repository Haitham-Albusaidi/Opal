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

    
}
