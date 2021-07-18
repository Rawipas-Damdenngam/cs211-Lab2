import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args){
        System.out.println("Hello World");

        Student Rawipas = new Student("6310451367","Rawipas",19);

        System.out.println(Rawipas);

//        คลาส คือ แม่แบบที่กำหนดตัวแปรและฟังชั่น
//        ออปเจก คือ สิ่งที่สร้างมาจากคลาส

        ArrayList<String> socialmedia = new ArrayList<String>();
        socialmedia.add("Facebook");

//        java.util.ArrayList

        LocalDateTime myTime = LocalDateTime.now();
        myTime.getMonth();
        LocalDateTime

//        การสร้าง ออปเจก ของคลาส LocalDateTime จะไม่ได้ใช้ method new เหมือนการสร้าง ออปเจก ของคลาส ArrayList

        Point A = new Point(5.0, 10.0);
        Point pos[] = new Point[2];
        pos[0] = new Point(10,20);
        pos[1] = new Point(20,40);

        double max = pos[0].distanceFromOrigin();
        for(int i = 0; i < 2; i++){
            if (max < pos[i].distanceFromOrigin()){
                max = pos[i].distanceFromOrigin();
            }
        }
        System.out.println(max);

        Circle circle = new Circle("wongkom", 4);
        circle.area();
        Circle.radiansToDegrees(9);

//        instance method จำเป็นที่จะต้องสร้าง ออปเจก ของคลาสนั้นก่อนที่จะเรียกใช้ instance method ได้
//        คลาส method สามารถเรียกใช้ผ่าน คลาส นั้นได้เลยโดยใช้ dot operator
//        สังเกตจาก คลาส method จะมีการประกาศ static ไว้

//        Class and Interface
//          - ขึ้นต้นตัวอักษรพิมพ์ใหญ่
//        Method
//          -ขึ้นต้นตัวอักษรพิมพ์เล็กคั่นคำเป็นตัวอักษรพิมพ์ใหญ่
//        Instance Variable
//          -ขึ้นต้นตัวอักษรพิมพ์เล็กคั่นคำเป็นตัวอักษรพิมพ์ใหญ่
//        Constant variable or static variable
//          -เป็นตัวอักษรพิมพ์ใหญ่ทั้งหมดคั่นคำด้วย underscores
//        Package
//          -ตัวอักษรพิมพ์เล็กทั้งหมด


        public class AirCondition {
            private String brand;
            private double price;
            public AirCondition(String brand, double price){
                this.brand = brand;
                this.price = price;
            }
            public String getAir(){
                return brand + " Price : " + price;
            }
        }
        MainProgram
        public class MainProgram {
            public static void main(String[] args)
            {
                AirCondition air = new AirCondition("HITACHI" ,19800 );
                System.out.println(air.getAir());
            }
        }


        //ArrayList<Integer> room = new ArrayList<>();

    }
}
