package day06_assertions;

import org.junit.Assert;
import org.junit.Test;

public class C02_Assertion {
    int P1yas1=60;
    int P2yas2=66;
    int P3yas3=70;
    @Test
    public void test01(){
        //emekli yasi 65 olduguna gore
        //P2'nin emekli olabilecegini test edin
        Assert.assertTrue(P2yas2>65);
    }
    @Test

    public void test02(){
        //emekli yasi 65 olduguna gore
        //P1'nin emekli olamayacagini test edin
        Assert.assertFalse(P1yas1>65);


}
@Test
    public void test03(){

}}
