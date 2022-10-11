public class reverse {
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void reverse(int[] a, int i, int j) {
        while (i < j)
            swap(a, i++, j--);
    }

    // REVERSE 2D ARRAYS....
    public void reverse(int[][] a, int i, int j) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                int temp = 0;
                temp = a[i][j];
                a[i][j] = a[i][a.length - 1 - j];
                a[i][a.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        reverse r = new reverse();// You can't call something that doesn't exist. Since you haven't created an
                                  // object, the non-static method doesn't exist yet. A static method (by
                                  // definition) always exists.

        int[] a = new int[] { 1, 4, 5 };
        r.reverse(a, 0, a.length - 1);
        for (int i : a)
            System.out.println(i);

    }

}
