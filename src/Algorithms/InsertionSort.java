package Algorithms;

import java.util.Arrays;

/*  0   1   2   3   4       <--index
    10  5   3   7   2       <--massivide elementid
    10                      <--uus array
    i                       <--valjaspoolne loop i
        j                   <--sissepoolne loop j kahe numbrite nihutamiseks

    x                       <--markaja mis naitab sorteritud osa

    Mingi element v6etakse nagu key ja kui key vahem kui eelmine elementi
    valju siis liigutakse oma kohale

 */

public class InsertionSort {

    public static void main(String[] args) {
        int [] numbers = {10,7,5,3,2};

        sort(numbers);
        printArray(numbers);
    }

    public static int[] sort(int[] arr){

        // ja "j" loop kahe nubrite vehel rootam vasukupoole nihumiseks

        for(int i = 1; i < arr.length; i++){  // Kaime labi massivi teisest elementist, sest hakkame teisest elemendist
            int key = arr[i]; //  kus "key" on praegune element millega tootame
            int j = i - 1; //  element vasukpoole nihutamiseks

            while (j>=0 && key< arr[j]){ // nihutamine loop tootab kuni j on null ja kuni key k6ige vaiksem massivis
                arr[j+1] = arr[j]; // siis liigume surema valjuga element paremaale
                j--;
            }
            arr[j+1] = key;  // paneb viimane element 6ige kohale
        }
        return arr;
    }

    public static void printArray(int[] arr){  // Trukkib masiivi
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }




}
