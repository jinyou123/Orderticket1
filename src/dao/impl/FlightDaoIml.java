package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public  class FlightDaoIml implements IFlightDao {
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:this:@localhost:1521:orcle";
        String username="opts";
        String password="opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql="insert into flight values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        System.out.println("当前连接："+conn);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(4,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,flight.getDestinationAirPort());
        pstmt.setString(7,flight.getGetDepartureTime());
        pstmt.executeUpdate();

    }

    @Override
    public Set<Flight> getAllFlight() {
        return null;
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

