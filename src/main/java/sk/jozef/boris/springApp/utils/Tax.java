package sk.jozef.boris.springApp.utils;

import java.math.BigDecimal;

public class Tax {
    private  static final  int currentTax = 20;

    public static BigDecimal addTax(BigDecimal suma){
        return suma.add(suma.divide(BigDecimal.valueOf(100l)).multiply(BigDecimal.valueOf(currentTax)));
    }
}
