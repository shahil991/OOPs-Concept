package Association.com;

public class Account {
    private String an;
    private String ifsc;
    private String bankName;

    public Account(String an, String ifsc, String bankName) {
        this.an = an;
        this.ifsc = ifsc;
        this.bankName = bankName;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAn() {
        return an;
    }

    public String getIfsc() {
        return ifsc;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "an='" + an + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
