package dataStructureQuiz;

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void displayContactInfo() {
        super.displayContactInfo();
        System.out.println(", 회사: " + company);
    }
}
