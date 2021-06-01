import java.util.*;

public class LabWork1 {

    /*Завдання 6*/
    /* Створіть метод, який дозволяє порівняти 2 будь яких масиви int[] за складом.
    Масиви можуть відрізнятися по порядку елементів, але бути однаковими зі складу.
    Приклад: [1,4,7]==[4,7,1- еквівалентні]*/
    public  void comparisons(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length) {
            Arrays.equals(arr1,arr2);
            System.out.print("Array 1 and Array 2 are similar\n");
        }
        else{
            System.out.print("Array 1 and Array 2 aren't similar\n");
        }

    }

    /*Завдання 18*/
    /* Створіть метод, який  приймає два параметри типу String та повертає кількість повних повторів
    одного слова літерами другого.
    Приклад: слово =він= можливо набрати три рази літерами , які є у рядку  =ннніііввввукег=*/
   public void findNumOfRep(String word, String lettersArr){

       HashMap<Character, Integer> word2 = uniqueChars(lettersArr);
       List<Integer> arrOfNum = new ArrayList<Integer>();
       int count=0;
       for (Map.Entry<Character, Integer> entry2 : word2.entrySet()) {
           for(int j=0; j < word.length(); j++){
               if (word.charAt(j) == entry2.getKey()) {
                   System.out.println(word.charAt(j)+" "+entry2.getKey());
                   arrOfNum.add(entry2.getValue());
               }
           };
       }
       Collections.sort(arrOfNum);
       Collections.min(arrOfNum);
       System.out.println(arrOfNum.get(0));
   }

    public HashMap<Character, Integer> uniqueChars(String word){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = word.toCharArray();

        for(int i=0; i<chars.length;i++)
        {
            if(!map.containsKey(chars[i]))
            {
                map.put(chars[i], 1);
            }
            map.put(chars[i], map.get(chars[i])+1);
        }
        return map;
    }

    /*Завдання 23*/
    /* Створіть метод, який рекурсивно рахує суму елементів масиву int[] , який передається як параметр методу.*/

    public int sumRecurs(int[] arr, int index){
        if (index == arr.length) {
            return 0;
        }
        else {
            return (sumRecurs(arr, index + 1)+arr[index]);
        }
    }

    /*Завдання 24*/
    /* Створіть метод, який сортує масив String у порядку довжини рядків.*/
    public void selectionSort(String[] arr)
    {
        for ( int i=0; i < arr.length-1; i++ )
        {
            int min = i;
            for ( int j=i+1; j < arr.length; j++ )
                if ( arr[j].compareTo(arr[min]) < 0 ) min = j;
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    /*Завдання 8*/
    /*  Створіть метод, який підраховує кількість однакових чисел у будь якому масиві int[] .
    Приклад [1,7,3,9,34,3,7]. Результат :  1 - 1 раз, 7 - 2 рази, 3 - 2 рази і т.д.*/
    public void countingNumb(int[] arr)
    {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i=0; i< arr.length; i++) {
            int newValue = counter.getOrDefault(arr[i], 0)+1 ;
            counter.put(arr[i],newValue);
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        System.out.println("***Task 6***");
        LabWork1 lb=new LabWork1();
        int[] arr1 = {1,2,3,4,2};
        int[] arr2 = {4,3,1,2,2};
        lb.comparisons(arr1,arr2);

        System.out.println("***Task 18***");
        String word = "він";
        String lettersArr = "нннііівввукег";
        lb.findNumOfRep(word, lettersArr);

        System.out.println("***Task 23***");
        int[] arr3 = {1,2,3,4,5};
        System.out.println(lb.sumRecurs(arr3, 0));

        System.out.println("***Task 24***");
        String arr[] = {"pineapple","orange","strawberry","apple"};
        System.out.println("Given array is:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
        lb.selectionSort(arr);
        System.out.println("Sorted array is:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("***Task 8***");
        int[] arr4 = new int[]{1, 7, 3, 9, 34, 3, 7};
        lb.countingNumb(arr4);

    }

}
