package bill;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;
//三种查询方式
public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;//插入航班
    Set<Flight> getAllFlight() throws  SQLException;
    Flight getFlightByccf(String departureAirPort);
    Flight getFlightBymmd(String destinationAirPort);
    Flight getFlightBycfsj(String getDepartureTime);
    void updateFlight(Flight flight);
}
