package com.mabel;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int count = 1;
//
//        while (count 1=6){
//            System.out.println("count value is " + count);
//            count++;
//        }
        int x = 5;
        int counter = 0;
        int firstNumber = 20;
        while (x <= firstNumber )
        {
            if(!isEvenNumber(x))
            {
                x++;
                continue;

            }

            System.out.println("even number " + x);
            x++;
            counter++;
            if(counter >=5)
            {
                break;
            }
        }



    }

    public static boolean isEvenNumber(int x)
    {
      if(x%2 == 0)
      {
          return true;

      }else {
          return false;
      }
    }
}
