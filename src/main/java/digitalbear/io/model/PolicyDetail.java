package digitalbear.io.model;

public class PolicyDetail {
    String policyNo;
    String title;
    String forename;
    String surname;

    public PolicyDetail() {}

    public PolicyDetail(String policyNo, String title, String forename, String surname) {
        this.policyNo = policyNo;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
