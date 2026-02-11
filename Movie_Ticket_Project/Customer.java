

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Customer {

    private String name;
    private String phoneNumber;
    private boolean isMember;
    private static int totalCustomers = 0;

    public Customer(String name, String phoneNumber, boolean isMember){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isMember = isMember;
        totalCustomers++;
    }
    public Customer(){
        this.name = "Null";
        this.phoneNumber = "Null";
        this.isMember = false;
        totalCustomers++;

    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.length() >= 9){
        this.phoneNumber = phoneNumber;
        }
    }

    public boolean isIsMember() {
        return isMember;
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

}
