package com.company;

public class Main {

    public static void main(String[] args) {

            Employee e[] = new Employee[5];

            for(int i=0; i<5; i++) {

                e[i] = new Employee();
                e[i].getInput();
            }

            System.out.println("**** Data Entered as below ****");

            for(int i=0; i<5; i++) {

                e[i].display();
            }

    }
    }

