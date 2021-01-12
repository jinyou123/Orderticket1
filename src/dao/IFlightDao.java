package dao;

import bean.Flight;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight>getAllFlight();
    Flight getFlightByccf(String cff);
    Flight getFlightBymmd(String mdd);
    Flight getFlightBycfsj(String cfsj);
    void updateFlight(Flight flight);

}
