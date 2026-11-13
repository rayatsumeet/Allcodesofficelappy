package newp;

public class binary {

    public static void main(String args[]) {
        int a[] = { 1, 6, 7, 8, 9 };
        int target = 3;
        int start = 0;
        int end = a.length - 1;
        boolean b = false;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (a[mid] == target) {
                b = true;
                break;
            } else {
                if (target > a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(b);
    }
}
