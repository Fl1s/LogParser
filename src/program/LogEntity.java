package program;

import java.util.Date;

public class LogEntity {
    private String ip;
    private String user;
    private Date date;
    private Event event;
    private int eventAddParam;
    private Status status;

    public LogEntity(String ip, String user, Date date, Event event, int eventAddParam, Status status) {
        this.ip = ip;
        this.user = user;
        this.date = date;
        this.event = event;
        this.eventAddParam = eventAddParam;
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public String getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public Event getEvent() {
        return event;
    }

    public int getEventAddParam() {
        return eventAddParam;
    }

    public Status getStatus() {
        return status;
    }
}
