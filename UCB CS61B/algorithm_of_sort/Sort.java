public class Sort {
    /** Sorts strings destructively.
     * 1.using iterative way:
     * */
    public static void sort(String[] x) {
        // find the index of the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        for (int i = 0; i < x.length - 1; i++) {
            int smallestIndex;
            smallestIndex = findSmallestIndex(x,i);
            swap(x,i,smallestIndex);
        }
    }

    /** Sorts strings destructively.
     * 2.using recursive way: ( a faster way)
     * */
//    public static void sort(String[] x) {
//        sort(x,0);
//    }
//    private static void sort(String[] x, int start) {
//        if (start == x.length) {
//            return;
//        }
//        int smallestIndex;
//        smallestIndex =findSmallestIndex(x,start);
//        swap(x,start,smallestIndex);
//        sort(x,start+1);
//    }

    /** Returns the index of the smallest element in x. */
    public static int findSmallestIndex(String[] x, int start) {
        int smallestIndex = start;
        int length = x.length;
        for (int i = start; i < length; i++) {
            int judge = x[smallestIndex].compareTo(x[i]);
            if (judge > 0) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /** Exchanges two elements. */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}

