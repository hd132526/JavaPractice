package org.dimigo.basic;

public class ShortCircuit {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      boolean flag = true;
      int a = 10, b = 0;
      
      //OR ������ true�� �� ���ɼ��� ���� �� ���� �ۼ� 
      if(flag || (a / b == 0)) { //flag �� ���̹Ƿ� a/b ���� ����
         
         System.out.println("OR ����");

      }
      
      //AND ������ false�� �� ���ɰ��� ���� �� ���� �ۼ�
      if(!flag && (a / b == 0)) { //!flag �� �����̹Ƿ� a/b ���� ����
         
         System.out.println("AND ����");
      }
      
   }

}