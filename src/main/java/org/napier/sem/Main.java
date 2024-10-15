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
        // Get Employee
        ArrayList<Employee> employees = a.getEmployeesByRole("Engineer");
        // Display results
        employees.forEach(a::displayEmployee);

        // Disconnect from database
        a.disconnect();
    }
}