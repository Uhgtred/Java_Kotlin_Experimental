public abstract class JavaAppointment {
    private String date;
    private String participant;
    private String description;
    private String type;
    private String location;
    private String startTime;
    private String endTime;
    private String id;

    public JavaAppointment(
            String date,
            String participant,
            String description,
            String type,
            String location,
            String startTime,
            String endTime,
            String id) {
        this.date = date;
        this.participant = participant;
        this.description = description;
        this.type = type;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.id = id;
    }

    // Building getters and setters for all the values that should be accessible.
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    public String getParticipant() {return participant;}
    public void setParticipant(String participant) {this.participant = participant;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}
    public String getStartTime() {return startTime;}
    public void setStartTime(String startTime) {this.startTime = startTime;}
    public String getEndTime() {return endTime;}
    public void setEndTime(String endTime) {this.endTime = endTime;}
    public String getId() {return id;}

    public abstract void notifyParticipant();
}
