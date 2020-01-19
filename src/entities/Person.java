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
public abstract class  Person {
    private String name;
    protected Double anualIncome;
    private Double anualTax;

    public Person() {
    }

    public Person(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public Double getAnualTax() {
        return anualTax;
    }

    public void setAnualTax(Double anualTax) {
        this.anualTax = anualTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    @Override
    public String toString() {
        
        anualTax = totalTax();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(": $ ");
        sb.append(String.format("%.2f",anualTax));
        
        return sb.toString();
    }
    public abstract Double totalTax();
    
    
}
