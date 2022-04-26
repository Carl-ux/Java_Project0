public class InstanceTest {
    public static void main(String[] args){
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();

        //匿名对象   即用即销毁
        new Phone().sendEmail();
        new Phone().playGame();        //两次调用的不是同一个对象

        new Phone().price = 1999;
        new Phone().showPrice();       //两次调用的不是同一个对象
    //****************************************************************
        PhoneMall mall = new PhoneMall();
        //匿名对象的使用
        mall.show(new Phone());
    }
}

class Phone{
    double price;  //价格
    public void sendEmail(){
        System.out.println("send email");
    }
    public void playGame(){
        System.out.println("play game");
    }
    public void showPrice(){
        System.out.println("price = " + price);
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}