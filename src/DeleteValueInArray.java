import java.util.Scanner;
import java.util.ArrayList;
public class DeleteValueInArray {
    public static void deleteValue(int[] arr,int num){
        int i,k,count=0;
        boolean check=false;
        for (k = i = 0; i<arr.length; i++){
            if (arr[i]!=num){
                arr[k]=arr[i];
                k++;
            }else {
                check=true;
                count++;
            }
        }
        if (check){
            for (int x=1;x<=count;x++){
                arr[arr.length-x]=0;
            }
            System.out.print("Mảng sau khi xóa giá trị "+num+" là: ");
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j] + "\t");
            }
        }else {
            System.out.println("Giá trị "+num+" ko có trong mảng");
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int amount=scanner.nextInt();
        int[] arrA=new int[amount];
        System.out.println("Nhập các phần tử: ");
        for (int i=0;i<arrA.length;i++){
            arrA[i]=scanner.nextInt();
        }
//        int[] arrA={1,2,3,4,5,3,6};
        System.out.println("Nhập số nguyên bất kỳ: ");
        int n=scanner.nextInt();
        deleteValue(arrA,n);
    }
}
