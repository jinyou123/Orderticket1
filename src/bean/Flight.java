package bean;

public class Flight {
    private String id;//主键
    private String flightId;
    private String planeType; //飞机类型
    private int currentSeatsNum; //飞机座位数
    private String departureAirPort;//出发地
    private String destinationAirPort;//目的地
    private String getDepartureTime;//出发时间

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String getDepartureTime) {
        this.id = id;
        this.flightId=flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.getDepartureTime = getDepartureTime;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getGetDepartureTime() {
        return getDepartureTime;
    }

    public void setGetDepartureTime(String getDepartureTime) {
        this.getDepartureTime = getDepartureTime;
    }
}