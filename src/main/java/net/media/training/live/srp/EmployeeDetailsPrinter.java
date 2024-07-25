package net.media.training.live.srp;

public class EmployeeDetailsPrinter {
    private Employee employee;
    public EmployeeDetailsPrinter(Employee employee){
        this.employee = employee;
    }
    private int calculateLeaveLeft(){
        return (this.employee.getTotalLeaveAllowed() - this.employee.getLeavesTaken());
    }

    private int calculateTotalLeavePreviously(){
        int years = 3;
        if (this.employee.getYearsInOrg() < 3) {
            years = this.employee.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.employee.getLeavesLeftPreviously()[this.employee.getYearsInOrg()-i-1];
        }
        return totalLeaveLeftPreviously;
    }

    private String getManager(){
        if(this.employee.getManager() != null){
            return this.employee.getManager();
        }
        return "None";
    }

    private double calculateAnnualSalary(){
        return Math.round(this.employee.getMonthlySalary() * 12);
    }


    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + this.employee.getEmpId() + "'>" +
                "<span>" + this.employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + calculateLeaveLeft() + "</span>";
        str += "<span>" + calculateAnnualSalary() + "</span>";
        str += "<span>" + getManager() + "</span>";

        str += "<span>" + calculateTotalLeavePreviously() + "</span>";
        return str + "</div> </div>";
    }
}
