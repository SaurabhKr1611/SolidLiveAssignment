package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;
    private int[] leavesLeftPreviously;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public static void setTotalLeavesAllowed(int totalLeavesAllowed) {
        TOTAL_LEAVES_ALLOWED = totalLeavesAllowed;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public void setLeaveTaken(int leaveTaken) {
        this.leaveTaken = leaveTaken;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getThisYeard() {
        return thisYeard;
    }

    public void setThisYeard(int thisYeard) {
        this.thisYeard = thisYeard;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }


// Refactored the print logic creating a new EmployeeDetailsPrinter Class


//    public String toHtml() {
//        String str = "<div>" +
//                "<h1>Employee Info</h1>" +
//                "<div id='emp" + empId + "'>" +
//                "<span>" + name + "</span>" +
//                "<div class='left'>" +
//                "<span>Leave Left :</span>" +
//                "<span>Annual Salary:</span>" +
//                "<span>Manager:</span>" +
//                "<span>Reimbursable Leave:</span>" +
//                "</div>";
//        str += "<div class='right'><span>" + (totalLeaveAllowed - leaveTaken) + "</span>";
//        str += "<span>" + Math.round(monthlySalary * 12) + "</span>";
//        if (manager != null) str += "<span>" + manager + "</span>";
//        else str += "<span>None</span>";
//        int years = 3;
//        if (yearsInOrg < 3) {
//            years = yearsInOrg;
//        }
//        int totalLeaveLeftPreviously = 0;
//        for (int i = 0; i < years; i++) {
//            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
//        }
//        str += "<span>" + totalLeaveLeftPreviously + "</span>";
//        return str + "</div> </div>";
//    }
    //other method related to customer
}
