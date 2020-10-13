import java.sql.SQLOutput;

public class JoinSortedArrays {

    public static void main(String[] args) {

    int[] list1 = new int[]{2, 4, 5, 3, 6, 2, 8, 9, 3, 7};
    int[] list2 = new int[]{9, 3, 5, 2, 8, 5, 1, 2, 7, 3};

    for (int i : merge(list1, list2)) {
        System.out.print(i + ", ");
    }


    }

    public static int[] merge(int[] list1, int[] list2) {
        int temp = 0;
        int length = list1.length + list2.length;
        int[] joinedArray = new int[length];
        int pos = 0;
        for (int element : list1) {
            joinedArray[pos] = element;
            pos++;
        }
        for (int element : list2) {
            joinedArray[pos] = element;
            pos++;
        }

        for (int i = 0; i < joinedArray.length; i++) {
            for (int j = i + 1; j < joinedArray.length; j++) {
                if(joinedArray[i] > joinedArray[j]) {
                    temp = joinedArray[i];
                    joinedArray[i] = joinedArray[j];
                    joinedArray[j] = temp;
                }
            }
        }


        return joinedArray;
    }
}
