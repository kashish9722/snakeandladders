import java.io.*;
public class intro
{
    public static void main(String [] args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
       // int a=Integer.parse.Int(br.readLine);
       int a=5;
        if(a%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}