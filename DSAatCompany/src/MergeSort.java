import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {20,13 , 2 , 5 ,19, 9 , 7};
        printArr(arr);
        mergeSort(arr, 0 , arr.length-1);
        printArr(arr);
    }
    static void mergeSort(int [] arr, int low , int high){
        if(low >= high) return;
        int mid = (low+high) /2;
        mergeSort(arr , low ,mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int [] arr, int low, int mid, int high){
        ArrayList <Integer> list = new ArrayList <>();
        int left = low;
        int right = mid+1;

        while(left <=mid && right <=high){
            if(arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[high]);
            right++;
        }
        for(int i = low ; i <= high ; i++ ){
            arr[i] = list.get(i-low);
        }
    }

    static void printArr(int [] arr){
        System.out.println("Array Is : ");
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
