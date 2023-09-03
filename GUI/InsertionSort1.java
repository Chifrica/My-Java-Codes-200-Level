public class InsertionSort1 {
    public static void main(String[] args) {
        int array[] = {2, 5, 3, 7, 4, 9, 8, 6, 1};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}