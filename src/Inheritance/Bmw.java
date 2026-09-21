package Inheritance;

public class Bmw extends Car{
    /*public Bmw(){
        super(10);
        System.out.println("Bmw const");

        //drive()   :   Inherited Method
        //speed()   :   Inherited Method
        //engine()  :   Inherited but cannot be override
        //Constructor cannot be inherited
    }*/

    //Override method
    @Override
    public void speed(){
        System.out.println("Bmw speed");
    }
}
