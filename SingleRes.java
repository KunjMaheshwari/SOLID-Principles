class Report{
    private String title;
    private String content;


    public Report(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getReportDetails(){
        return "Title: "+ title +" Content: "+ content;
    }
}

class ReportPrinter{
    public void printReport(Report report){
        System.out.println(report.getReportDetails());
    }
}

public class SingleRes {
    public static void main(String args[]){
        Report report = new Report("Capstone Project", "VITB");
        ReportPrinter printer = new ReportPrinter();

        printer.printReport(report);
    }
}
