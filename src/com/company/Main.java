package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        Scanner sc1 = new Scanner(new File("class.txt"));
         ArrayList<String> names= new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 18; i++){
            names.add(sc1.nextLine());
        }
        for (int i = 0; i < 17; i++){
            int rando = rd.nextInt(18-i);
            System.out.println(names.get(rando));
            names.remove(rando);
        }

        System.out.print(names.get(0));

    }
}
