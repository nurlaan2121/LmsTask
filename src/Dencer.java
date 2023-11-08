public class Dencer extends Person{
    private String groupName;

    public Dencer() {
    }

    public Dencer(String groupName) {
        this.groupName = groupName;
    }

    public Dencer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dencer{" +
                "groupName='" + groupName + '\'' +
                '}'+ super.toString();
    }

    public String dancing(){
        return ("VAlS");
    }
}
