package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Įveskite žodį");
        Scanner sc = new Scanner(System.in);
        String zod = sc.nextLine();
        boolean arSkaicius = false;
        try{
            Float.parseFloat(zod);
            arSkaicius = true;
        }catch (Exception e){
            if(arSkaicius == true){
            System.out.println("Įvesta ne skaičius");

    }
            int kiekis = 0;
            for (int i = 0; i < zod.length();i++){
                char raide = zod.charAt(i);
                if(raide == 'a' || raide == 'A'){
                    kiekis++;
                }
            }System.out.println("A raidžių kiekis yra : " + kiekis);
        }
}
}

