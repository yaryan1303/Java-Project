package in.spring.beans;

public class Student {
    private Integer sid;
    private String sname;
    private String saddress;
    private Work work;

    public Student(Integer sid, String sname, String saddress, Work work) {
        this.sid = sid;
        this.sname = sname;
        this.saddress = saddress;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", work=" + work + "]";
    }
}
