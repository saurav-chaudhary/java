public class TicketData
{
    String ScheduleNo;
    String routeNo;
    String fromStopId;
    String fromStopSeqNo;
    String tillStopId;
    String tillStopSeqNo;
    String tDate;
    String tTime;
    String tAmount;
    String distance;

    public String getScheduleNo() {
        return ScheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        ScheduleNo = scheduleNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getFromStopId() {
        return fromStopId;
    }

    public void setFromStopId(String fromStopId) {
        this.fromStopId = fromStopId;
    }

    public String getFromStopSeqNo() {
        return fromStopSeqNo;
    }

    public void setFromStopSeqNo(String fromStopSeqNo) {
        this.fromStopSeqNo = fromStopSeqNo;
    }

    public String getTillStopId() {
        return tillStopId;
    }

    public void setTillStopId(String tillStopId) {
        this.tillStopId = tillStopId;
    }

    public String getTillStopSeqNo() {
        return tillStopSeqNo;
    }

    public void setTillStopSeqNo(String tillStopSeqNo) {
        this.tillStopSeqNo = tillStopSeqNo;
    }

    public String gettDate() {
        return tDate;
    }

    public void settDate(String tDate) {
        this.tDate = tDate;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public String gettAmount() {
        return tAmount;
    }

    public void settAmount(String tAmount) {
        this.tAmount = tAmount;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TicketData [ScheduleNo=" + ScheduleNo + ", distance=" + distance + ", fromStopId=" + fromStopId
                + ", fromStopSeqNo=" + fromStopSeqNo + ", routeNo=" + routeNo + ", tAmount=" + tAmount + ", tDate="
                + tDate + ", tTime=" + tTime + ", tillStopId=" + tillStopId + ", tillStopSeqNo=" + tillStopSeqNo + "]\n";
    }

}