package be.pxl.student;

import be.pxl.student.entity.Account;
import be.pxl.student.util.BudgetPlannerImporter;

import java.util.List;


public class BudgetPlanner {

    public static void main(String[] args) {
        BudgetPlannerImporter budgetPlannerImporter = new BudgetPlannerImporter("src/main/resources/account_payments.csv");

        List<Account> accounts = (List<Account>) budgetPlannerImporter.readFile();

        accounts.forEach(System.out::println);
    }

}
//https://logging.apache.org/log4j/2.x/manual/appenders.html#RollingFileAppender