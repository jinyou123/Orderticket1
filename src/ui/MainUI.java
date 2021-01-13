package ui;

import bean.Flight;
import bill.IFlightService;
import bill.impl.FlightServiceImpl;

import java.sql.SQLException;
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
                System.out.println(id.replace("-",""));
                System.out.print("请输入航班编号:");
                String flightID=sc.next();

                System.out.print("请输入机型:");
                String planeType =sc.next();

                System.out.print("请输入飞机座位数:");
                int currentSeatsNum =sc.nextInt();
                System.out.print("请输入起飞地点:");
                String departureAirPort =sc.next();
                System.out.print("请输入目的地:");
                String destinationAirPort =sc.next();
                System.out.print("请输入出发时间:");
                String getDepartureTime =sc.next();

                Flight flight = new Flight(id,flightID,planeType,currentSeatsNum,departureAirPort,destinationAirPort,getDepartureTime);
                IFlightService iFlightService = new FlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e){
                    String errorMessage=e.getMessage();
                    System.out.println(errorMessage);
                    String errorId = errorMessage.substring(0,9);
                    System.out.println("错误编码："+errorId);
                    if ("ORA-12899".equals(errorId)){
                        System.out.println("某列的值过大，请仔细检查");
                    }

                }

            }
        }
    }
}
