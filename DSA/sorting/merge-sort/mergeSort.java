public class mergeSort {

    private static void mergeSorts(int[] arr, int l, int r)
    {
        if(l<r){

            int mid = (l+r)/2;
            mergeSorts(arr, l, mid);
            mergeSorts(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r)
    {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x = 0; x < n1; x++){
            lArr[x] = arr[l + x];
        }
        for(int x = 0; x <n2; x++)
        {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2)
        {
            if(lArr[i] <= rArr[j])
            {
                arr[k] = lArr[i];
                i++;
            }
            else
            {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j < n2)
        {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 11, 13, 5, 6, 7};

        for(int n : arr) System.out.print(n + " ");

        System.out.println();

        mergeSorts(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for(int n : arr) System.out.print(n + " ");
    }

}
