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
public final class Individual extends Person{
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    
    
    @Override
    public final Double totalTax() {
        Integer imposto;
        if (anualIncome < 20000){
            imposto = 15;
        }else{
            imposto = 25;
        }
        
        return (anualIncome /100 * imposto) - (healthExpenditures / 2);
    }
}
