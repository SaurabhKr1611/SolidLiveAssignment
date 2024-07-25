package net.media.training.live.srp;

public class EmployeeDetailsPrinter {
    private Employee employee;
    public EmployeeDetailsPrinter(Employee employee){
        this.employee = employee;
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
        str += "<div class='right'><span>" + this.employee.calculateLeaveLeft() + "</span>";
        str += "<span>" + this.employee.calculateAnnualSalary() + "</span>";
        str += "<span>" + this.employee.getManager() + "</span>";

        str += "<span>" + this.employee.calculateTotalLeavePreviously() + "</span>";
        return str + "</div> </div>";
    }
}
