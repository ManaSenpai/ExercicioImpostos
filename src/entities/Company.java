/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author 
 */
public final class Company extends Person{
    private Integer numberEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome,Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }
    
    
    @Override
    public final Double totalTax() {
        int imposto;
        if (numberEmployees < 10){
            imposto = 16;
        }else{
            imposto = 14;
        }
        return anualIncome /100 * imposto;
    }
    
}
