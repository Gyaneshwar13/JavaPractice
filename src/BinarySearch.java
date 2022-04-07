public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,13,18};
        int l1 = 0;
        int r1 = a.length-1;
        int mid = (l1 + r1) / 2;
        int find = 7;
        while (l1 <= r1)
        {
            if (a[mid] == find) {
                System.out.print("find is at " + mid + " index position");
                break;

            }
            else if (a[mid] < find)
            {
                l1 = mid + 1;
            }
            else
                {
                r1 =mid - 1;
            }
            mid = (l1 + r1) / 2;
        }
    }
}
