package bill.impl;

import bean.Flight;
import bill.IFlightService;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println("界面传来的航班信息："+flight);
    }

    @Override
    public Set<Flight> getAllFlight() {
        return null;
    }

    @Override
    public Flight getFlightByccf(String cff) {
        return null;
    }

    @Override
    public Flight getFlightBymmd(String mdd) {
        return null;
    }

    @Override
    public Flight getFlightBycfsj(String cfsj) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
