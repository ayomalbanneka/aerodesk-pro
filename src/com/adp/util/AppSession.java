package com.adp.util;

import com.adp.model.Employee;

public class AppSession {
    private static Employee currentEmployee;

    public static Employee getCurrentEmployee() {
        return currentEmployee;
    }

    public static void setCurrentEmployee(Employee currentEmployee) {
        AppSession.currentEmployee = currentEmployee;
    }
}
