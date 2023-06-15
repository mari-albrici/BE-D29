package designPatterns.es3.handlers;

import designPatterns.es3.entities.enums.Role;

public class RoleChecker {
    Role role;
    long salary;
    SalaryValidator salaryValidator;

    public Role roleCheck(){
        if(salaryValidator.salaryCheck(salary) && salary>=1000){
            return Role.CAPTAIN;
        } else if(salaryValidator.salaryCheck(salary) && salary>=2000){
            return Role.MAJOR;
        } else if(salaryValidator.salaryCheck(salary) && salary>=3000){
            return Role.LIEUTENANT;
        } else if(salaryValidator.salaryCheck(salary) && salary>=4000){
            return Role.COLONEL;
        } else if(salaryValidator.salaryCheck(salary) && salary>=5000){
            return Role.GENERAL;
        } else {
            return Role.UNKNOWN;
        }
    }
}
