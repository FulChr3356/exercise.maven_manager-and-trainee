package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class Manager extends AbstractEmployee {


    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public Manager(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        super(id,name,address,phoneNumber,basicSalary);
    }


    // TODO - Modify to ensure the respective test case passes
    public Manager() {
        this.setSpecialAllowance(250.8);
        this.setHealthReimbursementAccount(1000.5);
    }
}
