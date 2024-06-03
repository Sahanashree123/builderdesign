package builderdesign;
public class Client {
 public static void main(String[] args) {
    //Phone phone =new Phone("Android","Lith",6,"Canon",6.5);
    Phone phone = new PhoneBuilder().setOs("Android").setSize(6).setDisplay(6.5).getPhone();
    System.out.println(phone.toString());
   Laptop laptop = new LaptopBuilder().setCamera("360 Cameras").setSize(7).getLaptop();
   System.out.println(laptop.toString());
 }

}
