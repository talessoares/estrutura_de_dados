
public class Main {
    public static void main(String[] args) {
        Ordena ordena = new Ordena();


        // int[] array = { 5, 3, 17, 10, 8, 9 };
        // ordena.heapSort(array);
        // for (int i = 0; i < array.length; i++)
        //     System.out.print(array[i] + " ");



        int[] array2 = { 5, 3, 17, 10, 8, 9 };
        ordena.quickSort(array2);
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }



}