import java.util.Arrays;

public class WordSorter {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                    + " Whether `tis nobler in the mind to suffer"
                    + " the slings and arrows of outrageous fortune,"
                    + " or to take arms against a sea of troubles,"
                    + " and by opposing end them?";
        String[] words = text.toLowerCase().split("[^a-z]+");
        bubbleSort(words);
        System.out.println("Words in alphabetical order: " + Arrays.toString(words));
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
