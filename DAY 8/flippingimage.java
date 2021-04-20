/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.*/

import java.util.Scanner;
  public class flippingimage{
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j*2<image.length;j++)
            {
                if(image[i][j]==image[i][image.length-j-1])
                {
                  image[i][j]^=1;
                    image[i][image.length-j-1]=image[i][j];
                }
            }
            
        }
        return image;
}
 public static void main(String[] args) {
     Scanner io=new Scanner(System.in);
     int n=io.nextInt();
     int[][] arr=new int[n][n];
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n;j++)
         {
             arr[i][j]=io.nextInt();
         }
     }
    int[][] a=flipAndInvertImage(arr);
     for(int i=0;i<a.length;i++)
     {
         for(int j=0;j<a.length;j++)
         {
             System.out.print(a[i][j]+" ");
         }
     }
     io.close();
 }
}
