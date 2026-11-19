import java.util.Arrays;

public class Assignment01Q04 {

    private static void reverse(int[] array, int left, int right){
        while(left < right){
            int x = array[left], y = array[right];
            array[left] = y;
            array[right] = x;
            left++;
            right--;
        }
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int len = array.length;

        if((direction != 'R' && direction != 'L') || len == 0) {
            return array;
        }
        if(direction == 'R') {
            move *= -1;
        }

        int shift = (move + len) % len;

        reverse(array, 0, shift-1);
        reverse(array, shift, len-1);
        reverse(array, 0, len-1);

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}