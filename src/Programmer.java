public class Programmer extends Person{
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}'+super.toString();
    }

    public String coding(){
        return ("Java");
    }
}
