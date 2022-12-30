package by.tms.task6;

public class Report implements ReportRun {
    @Override
    public void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("| %-20s|%15.2f|\n", cutPartOfFullName(employee), employee.getSalary());
        }
    }

    private String cutPartOfFullName(Employee employee) {
        String[] partNames = employee.getFullName().split(" ");
        StringBuilder result = new StringBuilder(" ");
        for (int i = 1; i < partNames.length; i++) {
            result.append(partNames[i].substring(0, 1).toUpperCase()).append(".");
        }
        result.append(" ").append(partNames[0]);
        return result.toString().trim();
    }
}
