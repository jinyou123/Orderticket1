package bill;

import bean.Flight;

import java.util.Set;
//三种查询方式
public interface IFlightService {
    void insertFlight(Flight flight);//插入航班
    Set<Flight> getAllFlight();
    Flight getFlightByccf(String departureAirPort);
    Flight getFlightBymmd(String destinationAirPort);
    Flight getFlightBycfsj(String getDepartureTime);
    void updateFlight(Flight flight);
}
