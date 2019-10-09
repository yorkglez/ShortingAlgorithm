/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortingalgorithm;

/**
 *
 * @author York
 */
public class ShortingAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Vector[] = {100,8,6,7,2,1,8,6,8,7,1,9,7,7,10,50};
        int OrderedArray [];          
        /*Call function BubbleSort*/
        //OrderedArray = BubbleSort(Vector);
        /*Call function InsertionSort*/
        //OrderedArray = InsertionSort(Vector);
        OrderedArray = SelectionSort(Vector);
        for (int i = 0; i < OrderedArray.length; i++) {
            System.out.print(OrderedArray[i]+"-");
        }                                
    } 
  
    public static int[] BubbleSort(int[] array){
        System.out.println("--Method burble--");
        int Aux = 0; //Declare aux
        /*Obtener el valor de la segunda posicion*/
        for (int i = 0; i < array.length; i++) {
          //  System.out.println("i: "+i);
            /*Obtener valor de la primera posicion*/
            for (int j = 0; j < i; j++) {
               /// System.out.println("j: "+j);
                /*Compare actual position with next position*/
                if(array[i] < array[j]){
                    Aux = array[j]; //Save valor in aux
                    /*Change valor of position*/
                    array[j] = array[i]; 
                    array[i] = Aux;
                }
            }
 
        }            
        return array;
    }
    
    public static int[] InsertionSort(int[] Vector){
        /*Insertion Sort*/
        /*
        100-8-6-7
            i = 1   j = 0
            Current = Vector[i] = 8
            Vector[j] = 100 
            0 >= 0 && 8 < 100
                Vector[j+i]//8  = Vector[j]//100
                100-100-6-7
                j-- = -1
                Vector[j+1]//1 = Current = 8
                8-100-6-7                
        */
        System.out.println("Method Insertion Sort");
        int j = 0;
        for (int i = 1; i < Vector.length; i++) {
            int Current = Vector[i]; //Current valor index of vector.
            j = i -1; //Index before i position
            /**/
            while(j >= 0 && Current < Vector[j]){
                Vector[j+1] = Vector[j];
                j--;
            }
            Vector[j+1] = Current;
        }
        return Vector;
    }
    
    public static int[] SelectionSort(int[] Vector){
        /*Selection Sort*/
        /*
            100-8-6-7
            i = 0
            Min = Vector[i] // 100
            Minindex = i //0
            for
                j = 0 + 1 
                Vector[j] //8 < Min //100
                    Min = Vector[j] //8 
                    Minindex = Aux //100
            Aux = Vector[i]
            Vector[i] = Min
            Vector[Miniindex] = Aux
        */
        int Min = 0;
        int Minindex  = 0;
        int Aux = 0;
        for (int i = 0; i < Vector.length; i++) {
            Min = Vector[i];
            Minindex = i;
            for (int j = i+1; j < Vector.length; j++) {
                if (Vector[j] < Min) {  
                    Min = Vector[j];
                    Minindex = j;                   
                }
            }
            Aux = Vector[i];
            Vector[i] = Min;
            Vector[Minindex] = Aux;
        }
        return Vector;
    }
}
