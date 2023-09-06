public class AccessModifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Nirav";
        // myAcc.password = "Nrv123"; it can't be accessed from our object
        myAcc.setPassword("Nrv123");// password can be changed via this function but can't be accessed
    }
}

class BankAccount {
    public String userName; // Can be accessed from anywhere
    private String password; // Can be only accessed inside this class

    public void setPassword(String pwd) { // function to change the password
        password = pwd;
    }
}
