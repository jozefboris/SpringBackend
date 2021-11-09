package sk.jozef.boris.springApp.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TaxTest {
    @Test
    public void sumaTest(){
        assertEquals(BigDecimal.valueOf(120l), Tax.addTax(BigDecimal.valueOf(100l)));

    }

    @Test
    public void sumaTest2(){
        assertEquals(BigDecimal.valueOf(169.20).setScale(2), Tax.addTax(BigDecimal.valueOf(141l)));

    }




}