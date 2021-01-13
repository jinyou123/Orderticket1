package dao;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight) throws SQLException;//插入航班
    Set<Flight> getAllFlight();
    Flight getFlightByccf(String departureAirPort);
    Flight getFlightBymmd(String destinationAirPort);
    Flight getFlightBycfsj(String getDepartureTime);
    void updateFlight(Flight flight);

    Set<Flight> getAllFlights();
}
