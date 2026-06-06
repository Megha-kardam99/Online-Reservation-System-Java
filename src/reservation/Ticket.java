package reservation;

/**
 * Ticket.java
 * Represents a confirmed train reservation.
 * PNR is auto-generated using a static counter.
 *
 * @author  Megha Kardam
 * @version 1.0
 */
public class Ticket {

    private static int pnrCounter = 100001;

    private String pnrNumber;
    private String passengerName;
    private int    passengerAge;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String dateOfJourney;
    private String fromStation;
    private String toStation;
    private String loginId;
    private double fare;

    public Ticket(String passengerName, int passengerAge,
                  String trainNumber,   String trainName,
                  String classType,     String dateOfJourney,
                  String fromStation,   String toStation,
                  String loginId,       double fare) {
        this.pnrNumber     = "PNR" + (pnrCounter++);
        this.passengerName = passengerName;
        this.passengerAge  = passengerAge;
        this.trainNumber   = trainNumber;
        this.trainName     = trainName;
        this.classType     = classType;
        this.dateOfJourney = dateOfJourney;
        this.fromStation   = fromStation;
        this.toStation     = toStation;
        this.loginId       = loginId;
        this.fare          = fare;
    }

    public String getPnrNumber()     { return pnrNumber; }
    public String getPassengerName() { return passengerName; }
    public int    getPassengerAge()  { return passengerAge; }
    public String getTrainNumber()   { return trainNumber; }
    public String getTrainName()     { return trainName; }
    public String getClassType()     { return classType; }
    public String getDateOfJourney() { return dateOfJourney; }
    public String getFromStation()   { return fromStation; }
    public String getToStation()     { return toStation; }
    public String getLoginId()       { return loginId; }
    public double getFare()          { return fare; }
}
