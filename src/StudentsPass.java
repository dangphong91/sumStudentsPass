import java.util.Scanner;

public class StudentsPass {
    public static double[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i< size; i++) {
            System.out.println("Nhập điểm của sinh viên thứ " + (i+1) + " :");
            array[i] = scanner.nextDouble();
        }
        return array;
    }
    public static void printArr(double[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        double[] arr = creatArr();
        int count = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >=5) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên thi đỗ là: " + count + "/" + arr.length);
    }
}
