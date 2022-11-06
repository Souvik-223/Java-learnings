package bank;

class account{
    public String name;
    protected int accountno;
    private String password;

    //getters and setters
    public String getpassword(){
        return this.password;
    }   
    private void setpassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {   
        account a1 = new account();
        a1.name = "souvik";
        a1.accountno = 93983485;
        System.out.println(a1.getpassword());
    }
}