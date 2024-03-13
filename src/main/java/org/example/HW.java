package org.example;

public class HW {
    /*
        Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
        Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
        Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
*/
    public static int evenNumbers(int[] countEvens) {
        int count = 0;
        if (countEvens != null) {
            for (int i = 0; i < countEvens.length; i++) {
                if (countEvens[i] % 2 == 0) {
                    count++;
                }
            }
        } return count;
    }
    public static int arrMinMaxDif(int[] countEvens){
        if(countEvens == null){
            System.out.println(" Передается пустой массив");
        }
        return   arrMax(countEvens) - arrMin(countEvens);
    }
    public static int arrMin(int[] countEvens){
        int min = countEvens[0];
        for (int i = 0; i < countEvens.length; i++) {
              if(min <= countEvens[i]){

              }else {
                  min = countEvens[i];
              }

        }
        /*System.out.println("min "+min);*/
        return min;

    }
    public static int arrMax(int[] countEvens){
        int max = 0;
        for (int i = 0; i < countEvens.length; i++) {
            if(countEvens[i] > max){
               max = countEvens[i] ;
            }

        }
        /*System.out.println("max "+max);*/
        return max;

    }

    public static boolean ifDoubleZero(int[] someNumbers){

        for (int i = 0; i < someNumbers.length-1; i++) {
            if(someNumbers[i] == 0 && someNumbers[i + 1] == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]  numbers = {1,2,3,4,5,6,7,8,9,0,1,1,0,0};
        System.out.println(evenNumbers(numbers));
        System.out.println(arrMinMaxDif(numbers));
        System.out.println(ifDoubleZero(numbers));

    }


}
