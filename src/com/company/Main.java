package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String Str;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки для записи в файл. Признак остановки записи - строка 'стоп'");
        try (FileWriter FW = new FileWriter("test.txt")){
            do {
                System.out.print(": ");
                Str = BR.readLine();
                if (Str.compareTo("стоп") == 0) break;
                Str = Str + "\r\n";
                FW.write(Str);
            }while (Str.compareTo("стоп") != 0);
        }catch (IOException io_exc){
            System.out.println("Ошибка ввода-вывода: " + io_exc);
        }
    }
}
