package me.stelios.prologserver.models;

public class Task {

    private final String lectureId;

    private final String roomId;
    private final int startTime;

    public Task(String lectureId, String roomId, int startTime) {
        this.lectureId = lectureId;
        this.roomId = roomId;
        this.startTime = startTime;
    }

    public String getLectureId() {
        return lectureId;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getStartTime() {
        return startTime;
    }
}
