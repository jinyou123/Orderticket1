package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.*;
import java.util.Set;

public  class FlightDaoIml implements IFlightDao {
    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
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
    public Flight getFlightdepartureAirPort(String departureAirPort) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql="insert into flight values(?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return null;
    }

    @Override
    public Flight getFlightBydestinationAirPort(String destinationAirPort) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql="insert into flight values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String DepartureTime) throws SQLException {
        String sql = "SELECT FLIGHT_ID,PLANE_TYPE,\n" +
                "TOTAL_SEATS_NUM,DEPARTURE_AIRPORT,\n" +
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight \n" +
                "WHERE DEPARTURE_TIME=?";
        String url = "jdbc:oracle:thin:@localhost:1521:orclhc";
        String username = "opts";
        String password = "opts1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        Flight flight = null;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,DepartureTime);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentSeatsNum = rs.getInt("TOTAL_SEATS_NUM");
            String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort = rs.getString("DESTINATION_AIRPORT");
            String departureTimes = rs.getString("DEPARTURE_TIME");

            flight = new Flight(flightId, planeType, currentSeatsNum, departureAirPort, destinationAirPort, departureTimes);
        }
        return flight;
    }

    @Override
    public void updateFlight(Flight flight) {

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }
}

