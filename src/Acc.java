import java.util.*;

 public class Acc {
    private long acc_no;
    private String name, email;
    private float amount;

    public void setAcc_no(long acc_no)
    {
        this.acc_no = acc_no;
    }
     public long getAcc_no(long acc_no)
     {
         return acc_no;
     }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }


    public static void main(String[] args) {

        Acc ac = new Acc();

        ac.setAcc_no(78978);
        ac.setName("Dharun");
        ac.setEmail("dharun@gmail.com");
        ac.setAmount(500);


        System.out.println("Name : "+ac.getName());
        System.out.println("Amount : "+ac.getAmount());
        System.out.println("Email : " + ac.getEmail());
        System.out.println("Acc no : " + ac.getAcc_no(78));


    }
}
