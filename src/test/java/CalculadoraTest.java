import cl.sodimac.Calculadora;
import cl.sodimac.exceptions.MyException;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void isEmpty() throws MyException {
        //arrange
        String vacio = "";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(vacio);
        //assert
        Assert.assertNotEquals(null, result);
    }

    @Test
    public void test2() throws MyException {
        //arrange
        String numero = "1";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(1), result);
    }


    @Test
    public void test3() throws MyException {
        //arrange
        String numero = "1,2";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(3), result);
    }

    @Test(expected = MyException.class)
    public void test4() throws MyException {
        //arrange
        String numero = "1,2,";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(3), result);
    }

    @Test(expected = MyException.class)
    public void test5() throws MyException {
        //arrange
        String numero = "1,,2";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
    }

    @Test(expected = NumberFormatException.class)
    public void test6() throws MyException {
        //arrange
        String numero = "1,s";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
    }

    @Test
    public void test7() throws MyException {
        //arrange
        String numero = "1,2,3";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }

    @Test(expected = MyException.class)
    public void test8() throws MyException {
        //arrange
        String numero = "1,2,3,,3";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }

    @Test(expected = NumberFormatException.class)
    public void test9() throws MyException {
        //arrange
        String numero = "1.2.3";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }

    @Test
    public void test10() throws MyException {
        //arrange
        String numero = "1,2 ,3";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }

    @Test(expected = MyException.class)
    public void test11() throws MyException {
        //arrange
        String numero = ",,,,";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(0), result);
    }

    @Test
    public void test12() throws MyException {
        //arrange
        String numero = "1\n2,3";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }

    @Test(expected = MyException.class)
    public void test13() throws MyException {
        //arrange
        String numero = "1,\n";
        //act
        Calculadora calculadora = new Calculadora();

        Integer result = calculadora.add(numero);
        //assert
        Assert.assertEquals(new Integer(6), result);
    }
}

