package org.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Extract employee salary information
        ArrayList<Employee> employees = a.getAllSalaries();

        a.printSalaries(employees);

        // Disconnect from database
        a.disconnect();
    }
}