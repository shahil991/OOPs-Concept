package Encapsulation;

import java.util.Scanner;

public class Product {
    private int pId;
    private String pName;
    private String pRatings;

    //Mutator/Setter
    public void setpId(int pId) {
        // Validation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Key to set PId");
        int id = sc.nextInt();

        if(id==1111) {
            this.pId=pId;
        }


        // this.pId=pId; // this->to diff between local & instance var
    }
    public void setpName(String pName) {
        this.pName=pName;
    }
    public void setpRatings(String pRatings) {
        this.pRatings=pRatings;
    }

    // Getter / Accessor

    public int getpId(){
        return pId;
    }

    public String getpName(){
        return pName;
    }
    public String getpRatings(){
        return pRatings;
    }

}
