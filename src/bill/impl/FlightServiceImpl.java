package bill.impl;

import bean.Flight;
import bill.IFlightService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.IFlightDao;
import dao.impl.FlightDaoIml;

import java.lang.ref.PhantomReference;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    public FlightServiceImpl() {
    iFlightDao=new FlightDaoIml();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        //System.out.println("界面传来的航班信息："+flight);
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlight() throws SQLException {
        return iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByccf(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightBymmd(String destinationAirPort) {
        return null;
    }

    @Override
    public Flight getFlightBycfsj(String getDepartureTime) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
