class Account {
    public String name;     //public access modifier

    protected String email;   //protected access modifier

    private String passward;     //Private access modifier

    // getter and setter method is used to access private elements :
    public void setPassward(String pass) {
        this.passward = pass;
    }

    public String getPassward() {
        return this.passward;
    }

}

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna college";
        account1.email = "apnacollege@gmail.com";
        account1.setPassward("abcd");
        System.out.println(account1.getPassward());
    }
}
