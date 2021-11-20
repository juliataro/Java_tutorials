package Algorithms;

// Lihne algoritm mis aitab arusaama kuidas soortimine toimib
// siin parema number iga kord v6rreldataske, kui vasakul number on suurem siis nihutatakse,
// ta pole effektiivne, sest kasutab nested sort osa nagu Inseriton sort

public class BubbleSort {
    void bubbleSort(int[] arr){
        // kaime labi massivi, kus i loop jaoks l'bi massivi
        // j sissemise massivi jaoks, ja tem  nihutamiseks

        int i,j,temp = 0;
        for (i=0; i< arr.length-1; i++)      // loop labi massivi
            for(j=0; j< arr.length-1-i; i++)   // sissemine loop laheb l6ppuni minus mis oli juba sorteritud
                if (arr[i] > arr[i+1] ) {       // kui number vasakult on surem kui paremalt
                    temp = arr[i];              // edasi on nihutamine
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
            }
}

    void display(int[] arr){                    // trukkib massiv
        for (int i=0; i<arr.length; ++i){       // selleks kaib l'bi massivi
            System.out.print(arr[i]+ ", ");
        }
    }

    public static void main(String[] args) {        // pea peetod kaivitamiseks
        BubbleSort massiiv = new BubbleSort();           // uus objekt
        int[] arr = {5, 6, 2, 9, 12, 2, 8, 4};      // massiv
        massiiv.bubbleSort(arr);                       // kuutsu me babbleSort meetodi
        massiiv.display(arr);                       // kursume trukkimine
    }
}
