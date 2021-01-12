package ui;

import bean.Flight;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入相应的数字进行操作：");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票预定");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();
            if (choice==1){
                String id= UUID.randomUUID().toString();
                System.out.println("航班id");

                System.out.print("请输入航班编号");
                String flightID=sc.next();
                System.out.print("请输入机型");
                String planeType =sc.next();
                System.out.print("请输入飞机座位数");
                String currentSeatsNum =sc.next();
                System.out.print("请输入起飞地点");
                String cdf =sc.next();
                System.out.print("请输入目的地");
                String mmd =sc.next();
                System.out.print("请输入出发时间");
                String cfsj =sc.next();

                Flight flight=new Flight(id,cdf,mmd,cfsj,planeType,currentSeatsNum);

            }
        }
    }
}
