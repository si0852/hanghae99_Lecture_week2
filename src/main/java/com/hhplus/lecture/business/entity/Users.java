package com.hhplus.lecture.business.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    private long userId;

    private String userName;

    @Builder
    public Users(long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
