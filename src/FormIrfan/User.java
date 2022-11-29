package FormIrfan;

public class User {
    private String Nomor;
    private String ATM;
    private String Bank;
    private String Nama;
    private String dataNama;

    public User() {
    }

    public User(String nomor, String ATM, String bank, String nama, String dataNama) {
        Nomor = nomor;
        this.ATM = ATM;
        Bank = bank;
        Nama = nama;
        this.dataNama = dataNama;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }

    public String getATM() {
        return ATM;
    }

    public void setATM(String ATM) {
        this.ATM = ATM;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDataNama() {
        return dataNama;
    }

    public void setDataNama(String dataNama) {
        this.dataNama = dataNama;
    }

    @Override
    public String toString() {
        return "User{" +
                "Nomor='" + Nomor + '\'' +
                ", ATM='" + ATM + '\'' +
                ", Bank='" + Bank + '\'' +
                ", Nama='" + Nama + '\'' +
                ", dataNama='" + dataNama + '\'' +
                '}';
    }
}
