package org.dimigo.basic;

public class ShortCircuit {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      boolean flag = true;
      int a = 10, b = 0;
      
      //OR 연산은 true가 된 가능성이 높은 것 먼저 작성 
      if(flag || (a / b == 0)) { //flag 가 참이므로 a/b 수행 안함
         
         System.out.println("OR 연산");

      }
      
      //AND 연산은 false가 될 가능겅이 높은 것 먼저 작성
      if(!flag && (a / b == 0)) { //!flag 가 거짓이므로 a/b 수행 안함
         
         System.out.println("AND 연산");
      }
      
   }

}