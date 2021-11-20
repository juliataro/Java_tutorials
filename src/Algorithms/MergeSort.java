package Algorithms;

public class MergeSort {

    // see meetod jagab array kaheks osaks - submassiiviks (vasak ja parem pool) ja parast kutsub merge array
    void mergeSort(int[] arr, int left, int right){

        int middle;                                     // middle muutua abil jagab kaheks osaks sortemiseks
        if (left < right) {                             // Sorterib, ainult kui vasaku osa index on vahem kui paremapoolt index, selleks jagab 2ks
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);                    //left subarray
            mergeSort(arr, middle + 1, right);           //right subarray

            merge(arr, left, middle, right);                //merge the two subarrays
        }
    }


    void merge(int[] arr, int left, int middle, int right) {
        // meetodile vaja sellised 4 parametrid

        int low = middle - left + 1;      //  Vasakupoolset massiivi suurus
        int high = right - middle;        // Paremapoolset massiivi suurus

        int[] L = new int[low];           // Loome vasakupoolset  ja paremapoolsed submassiivit
        int[] R = new int[high];

        int i = 0, j = 0;                  // Loome muutujas i vasakupoolse submassivi jaoks, j

        for (i = 0; i < low; i++) {       // Kopeerime elemendid vaskku submassivisse
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++){       //Kopeerime elemendid parema submassivisse
            R[j] = arr[middle + 1 + j];
        }


        int k = left;
        i = 0;                            // Tsuklite mutujate lahtistamine vaartusest enne uhendaminst
        j = 0;

        while (i < low && j < high)  {    // Uhendame vasaku ja parema submassivid, kuni elemendid ot otsas m6lemalt poolt
            if (L[i] <= R[j]){              // liidame vasukupoolse juurde
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];              // liidame paremapoolse juurde
                j++;
            }
            k++;
        }

        while (i < low){                  // Uhendame k6ik ulejaanud elemendid vasaku sub massiivise

            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high){                 // Uhendame k6ik ulejaanud elemendid parema submassiivise
            arr[k] = R[j];
            j++;
            k++;
        }
    }




    void display(int[] arr){             // printida tulemus

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 9, 3, 1, 5, 13, 12 };                 // array
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);       // object kasutab mergeSort meetod mis ise kutsub merge meetod
        ob.display(arr);                                     // display meetodi kutsumine
    }
}
