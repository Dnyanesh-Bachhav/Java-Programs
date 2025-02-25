import java.util.*;
import java.io.*;
public class Demo1{

    public static void main(String args[])
    {
        String str = "Hello World";
        String strArr[] = str.split(" ");
        String ans = "";
        for(int i=strArr.length-1;i>=0;i--)
        {
            ans += strArr[i]+" ";
        }
        System.out.println(ans);
    }
}