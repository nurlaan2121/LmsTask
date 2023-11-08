public class Singer extends Person{
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}' + super.toString();
    }

    public String singing(){
        return ("ALATOO");
    };
    public String playGitar(){
        return ("Papito");
    }
}
