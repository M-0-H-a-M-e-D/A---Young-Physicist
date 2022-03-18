import java.util.Scanner;


public class Young {


    public static String YoungTest(int a, int arr[]) {
        if (a<=0)
        {
            return "NO";
        }
        int x=0,y=0,z=0;
        for(int i=0;i<3*a-2;i++)
        {if (arr[i]<-100 || arr[i]>100 || arr[i+1]<-100 || arr[i+1]>100 || arr[i+2]<-100 || arr[i+2]>100)
             {
            return "NO";
             }
            x=x+arr[i];
            i++;
            y=y+arr[i];
            i++;
            z=z+arr[i];

        }
        if(x==0&&y==0&&z==0)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
//        System.out.println(x+y+z);

    }
    public static void main(String args[])  //static method
    {
        Scanner inp = new Scanner(System.in);
        int w = inp.nextInt();
        int arr2[] = new int[3*w];
        for(int i=0;i<3*w;i++){
            arr2[i]=inp.nextInt();
        }
        System.out.println(YoungTest(w, arr2));
    }
}