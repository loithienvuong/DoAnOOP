package mayatm;

 class User {
   private String name, cmnd, userName, pass, bankName, cardNumber; 
   private long money;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public User(String name, String cmnd, String userName, String pass, String bankName, String cardNumber, long money) {
        this.name = name;
        this.cmnd = cmnd;
        this.userName = userName;
        this.pass = pass;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.money = money;
    }
    
    public String toString(){
        return cmnd+" "+userName+" "+pass+" "+bankName+" "+cardNumber+" "+money+" "+name;
    }
}
