package CurrencyDenomination;

public class SortCurrency {
//    sorting the array in descending order using merge sort algorithm
//    dividing the array into small bits
    public void sort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left+right)/2;
            sort(arr, left,mid);
            sort(arr,mid+1, right);

            merge(arr, left, mid, right);
        }
    }

//    merging the array in descending order
    public void merge(int[] arr, int left, int mid, int right){
        int length1= mid-left+1;
        int length2= right-mid;

        int[] arrleft = new int[length1];
        int[] arrright = new int[length2];

        for(int i=0; i<length1;i++){
            arrleft[i] = arr[left+i];
        }

        for(int j= 0 ; j<length2; j++){
            arrright[j] = arr[mid+1+j];
        }

        int i=0 , j=0, k=left;
        while(i<length1 && j<length2){
            if(arrleft[i] >= arrright[j]){
                arr[k] = arrleft[i];
                i++;
            }
            else{
                arr[k] = arrright[j];
                j++;
            }
            k++;
        }

        while(i<length1){
            arr[k] = arrleft[i];
            i++;
            k++;
        }
        while(j<length2){
            arr[k] = arrright[j];
            j++;
            k++;
        }

    }
}
