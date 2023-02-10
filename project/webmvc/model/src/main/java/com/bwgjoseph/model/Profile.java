package com.bwgjoseph.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Profile {
    private String id;
    private String name;
    private String gender;
    private String address;
}
