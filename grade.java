import java.io.*;
import java.util.*;
public class grade {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int grade=sc.nextInt();
            if(grade<38)
            System.out.println(grade);
            else
            {
            if(grade%5>=3)
            {
                System.out.println(grade/5 * 5 + 5);
            }
            else
            System.out.println(grade);
        }
        }
    }
}

