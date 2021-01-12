package bill;

import bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight);
    Set<Flight> getAllFlight();
    Flight getFlightByccf(String cff);
    Flight getFlightBymmd(String mdd);
    Flight getFlightBycfsj(String cfsj);
    void updateFlight(Flight flight);
}
