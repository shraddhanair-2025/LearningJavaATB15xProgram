package ex_16_Arrays;

public class Lab165_3dArray {
    public static void main(String[] args) {

        int[][][] array_3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 12, 12}
                }
        };
        System.out.println("Element at arr[1][0][2]:"+array_3d[0][1][2]);
    }
}
