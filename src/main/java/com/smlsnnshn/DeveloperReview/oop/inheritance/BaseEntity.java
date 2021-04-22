package com.smlsnnshn.DeveloperReview.oop.inheritance;


import java.time.LocalDateTime;

public abstract class BaseEntity {

    private long id;
    private LocalDateTime insertDateTime;
    private long insertUserId;
    private LocalDateTime lastUpdateDateTime;
    private long lastUpdateUserId;

    public BaseEntity() {
    }

    public BaseEntity(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime, long lastUpdateUserId) {
        this.id = id;
        this.insertDateTime = insertDateTime;
        this.insertUserId = insertUserId;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getInsertDateTime() {
        return insertDateTime;
    }

    public void setInsertDateTime(LocalDateTime insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    public long getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(long insertUserId) {
        this.insertUserId = insertUserId;
    }

    public LocalDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(LocalDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

}
