import java.util.Random;
public class Account {
    //Account Attributes
    private String Account_Name;
    private Long Account_Number;

    private String Account_UserName;
    private String Account_Password;
    private int Money;


    //Account setters and getters
    public String getAccount_Name() {
        return Account_Name;
    }

    public void setAccount_Name(String account_Name) {
        Account_Name = account_Name;
    }

    public Long getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(Long account_Number) {
        Account_Number = account_Number;
    }

    public String getAccount_UserName() {
        return Account_UserName;
    }

    public void setAccount_UserName(String account_UserName) {
        Account_UserName = account_UserName;
    }

    public String getAccount_Password() {
        return Account_Password;
    }

    public void setAccount_Password(String account_Password) {
        Account_Password = account_Password;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    //Account Constructors for setup
    Account(String AccountName, String AccountUserName, String AccountPassword){
        Random r = new Random();
        Long r1 = r.nextLong(2L);

        setAccount_Name(AccountName);
        setAccount_UserName(AccountUserName);
        setAccount_Password(AccountPassword);
        setAccount_Number(r1);
    }
    //Account withdrawal,deposit, change username, change password

    public int Withdrawal_Money(int Money){
        int withdrawal =0;
        if (Money==0){
            IO.println("Withdrawal can't be completed due to no money.");
        } else if (withdrawal >Money) {
            IO.println("Withdrawal can't be completed due to the amount being greater than the total money.");
        }else
            IO.println("Withdrawal was successful.");
            return getMoney() - withdrawal;
    }

    public int Deposit_Money(int Money){
        int deposit = 0;
        return getMoney() + deposit;
    }

    public String Change_Username(String Usern){
        String NewUsername = getAccount_UserName();
        if(Usern == getAccount_UserName()){
             NewUsername="";
        }
        return NewUsername;
    }
}
