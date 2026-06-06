package reservation;

import java.util.*;

/**
 * ReservationDatabase.java
 * Central in-memory data store for users, trains and tickets.
 * In a production system this would use JDBC + MySQL.
 *
 * @author  Megha Kardam
 * @version 1.0
 */
public class ReservationDatabase {

    private Map<String, User>   users   = new HashMap<>();
    private List<String[]>      trains  = new ArrayList<>();
    private Map<String, Ticket> tickets = new HashMap<>();

    public static final Map<String, Double> CLASS_FARES = new LinkedHashMap<>();
    static {
        CLASS_FARES.put("1A  - First AC",       4.5);
        CLASS_FARES.put("2A  - Second AC",       3.0);
        CLASS_FARES.put("3A  - Third AC",        2.2);
        CLASS_FARES.put("SL  - Sleeper",         1.2);
        CLASS_FARES.put("CC  - Chair Car",       1.8);
        CLASS_FARES.put("2S  - Second Sitting",  0.8);
    }

    public ReservationDatabase() {
        users.put("admin",  new User("admin",  "admin123", "System Administrator", true));
        users.put("MK2024", new User("MK2024", "megha123", "Megha Kardam",         false));
        users.put("RK2024", new User("RK2024", "rahul123", "Rahul Kumar",          false));
        users.put("PS2024", new User("PS2024", "priya123", "Priya Sharma",         false));

        trains.add(new String[]{"12301", "Rajdhani Express",     "New Delhi", "Kolkata",   "1450", "17h 30m"});
        trains.add(new String[]{"12951", "Mumbai Rajdhani",      "New Delhi", "Mumbai",    "1385", "16h 00m"});
        trains.add(new String[]{"12302", "Shatabdi Express",     "New Delhi", "Bhopal",    "700",  "8h 15m" });
        trains.add(new String[]{"22691", "Rajdhani Express",     "Bangalore", "New Delhi", "2366", "32h 30m"});
        trains.add(new String[]{"12627", "Karnataka Express",    "Bangalore", "New Delhi", "2444", "40h 45m"});
        trains.add(new String[]{"12001", "Bhopal Shatabdi",      "New Delhi", "Bhopal",    "704",  "8h 25m" });
        trains.add(new String[]{"15001", "Jan Sadharan Express", "Patna",     "New Delhi", "997",  "15h 10m"});
        trains.add(new String[]{"12589", "Gorakhpur Express",    "Gorakhpur", "Mumbai",    "2003", "34h 00m"});
    }

    public User login(String id, String pwd) {
        User u = users.get(id);
        return (u != null && u.getPassword().equals(pwd)) ? u : null;
    }

    public boolean registerUser(String id, String pwd, String name) {
        if (users.containsKey(id)) return false;
        users.put(id, new User(id, pwd, name, false));
        return true;
    }

    public List<String[]>      getTrains()          { return trains; }
    public Map<String, Ticket> getAllTickets()       { return tickets; }
    public Map<String, User>   getAllUsers()         { return users; }
    public void    addTicket(Ticket t)              { tickets.put(t.getPnrNumber(), t); }
    public Ticket  getTicket(String pnr)            { return tickets.get(pnr); }
    public boolean cancelTicket(String pnr)         { return tickets.remove(pnr) != null; }

    public String[] getTrainByNumber(String number) {
        for (String[] t : trains)
            if (t[0].equals(number)) return t;
        return null;
    }

    public List<Ticket> getTicketsByUser(String loginId) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket t : tickets.values())
            if (t.getLoginId().equals(loginId)) result.add(t);
        return result;
    }
}
