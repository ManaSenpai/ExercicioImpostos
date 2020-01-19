/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos;

import entities.Company;
import entities.Individual;
import entities.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> pList = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of tax payers: ");
        Integer n = sc.nextInt();
        for (int i = 1; i < n+1; i++){
            System.out.printf("\tTax payer #%d data:\n",i);
            System.out.print("Individual or Company(i/c)? ");
            char t = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            Person p;
            if (t == 'i'){
                System.out.print("Health Expenditures: ");
                Double expenditures = sc.nextDouble();
                p = new Individual(name, anualIncome, expenditures);
            }else{
                System.out.print("Number of employees: ");
                Integer employees = sc.nextInt(); 
                p = new Company(name, anualIncome, employees);
            }
            pList.add(p);
            
        }
        System.out.println("------------");
        System.out.println("TAXES PAID:");
        Double sum = 0d;
        for (Person p : pList){
            System.out.println(p.toString());
            sum+= p.getAnualTax();
        }
        System.out.println("-------------");
        System.out.printf("TOTAL TAXES: $ %.2f\n", sum);
    }
    
}
