/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_decorator;

/**
 *
 * @author vadimzubchenko
 */
public class Ananas extends Decorator{
    
    public Ananas(Pizza pizzatäytteineen) {
        super(pizzatäytteineen);
    }

    @Override
    public String getTäyte() {
        return super.getTäyte() + ", ananas"; 
    }

    @Override
    public double gethinta() {
        return super.gethinta() + 1.10; 
    }
    
}
