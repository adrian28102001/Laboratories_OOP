package lab7;

public class biggestNumber {

    public static void biggestNumberArray(double[] array) {
        int size = array.length;
        double temp;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Largest area is:: " + array[size - 1]);
    }
}

