import java.util.Date;

public class Costumer {
    private String name;
    private Date dateOfReg;

    public Costumer() {
    }

    public Costumer(String name) {
        setName(name);
        setDateOfReg(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Date dateOfReg) {
        this.dateOfReg = dateOfReg;
    }
}
