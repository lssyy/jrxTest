package com.jrx.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {


        public void method1() throws ArithmeticException, InputMismatchException {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入被除数：");
            int num1 = input.nextInt();
            System.out.print("请输入除数：");
            int num2 = input.nextInt();
            int result = num1/num2;
            System.out.println("商为："+result);
        }
        /**
         * method2()作为调用者没有处理
         * @throws ArithmeticException
         * @throws InputMismatchException
         */
        public void method2() throws ArithmeticException, InputMismatchException{
            method1();
        }
        /**
         * method3()作为调用者选择了处理
         */

        public void method3(){
            try{
                method1();
            }catch(ArithmeticException e){
                e.printStackTrace();
                System.out.println("除数不能为0!");
            }catch(InputMismatchException e){
                e.printStackTrace();
                System.out.println("除数或者被除数只能是数字！");

            }
        }
    public static void main(String[] args) {
           new Exception().method3();
    }

}
