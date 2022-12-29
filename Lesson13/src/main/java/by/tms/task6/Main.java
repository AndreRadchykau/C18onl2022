package by.tms.task6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иванов Иван Иванович", 111.11);
        employees[1] = new Employee("Петров Петр Петрович", 222.22);
        employees[2] = new Employee("Андреич Андрей Адронный", 333.33);
        Report report = new Report();
        report.generateReport(employees);
    }
}
