public class Acount {
    private String id;
    private String name;
    private int balance;
    Acount(String id , String name){
        this.id = id;
        this.name = name;
    }
    Acount (String id , String name, int balance){
        this(id,name);//call the previous constructor
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public int getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    //credit اضافه
    //debit السحب
    public int credit(int amount){
        if(amount >0){
            System.out.println("✅ Amount credited: " + amount + " | New Balance: " + balance);
            return balance+=amount;
        }else{
            System.out.println("❌ Credit failed: Amount must be greater than 0.");
            return 0 ;
        }
    }
    public int debit(int amount){
        if(balance >= amount){
            System.out.println("✅ Amount debited: " + amount + " | Remaining Balance: " + balance);
            return balance-=amount;
        }else{
            System.out.println("❌ Debit failed: Insufficient balance. Current Balance: " + balance);
            return 0 ;
        }
    }
    public int transfer(Acount another , int amount){
        if(balance >= amount){
            balance-=amount;
            System.out.println("✅ Transferred " + amount + " from " + this.name + " to " + another.getName());
            System.out.println("📦 " + this.name + "'s New Balance: " + this.balance);
            System.out.println("📥 " + another.getName() + "'s New Balance: " + another.getBalance());
            return another.credit(amount);
        }else{
            System.out.println("❌ Transfer failed: " + this.name + " has insufficient funds to transfer " + amount + " to " + another.getName());
            return 0 ;
        }
    }
    public String toString(){
        return "=====================\n" +
                "👤 Account Info:\n" +
                "🆔 ID      : " + id + "\n" +
                "👨 Name    : " + name + "\n" +
                "💰 Balance : " + balance + "\n" +
                "=====================";
    }
}
