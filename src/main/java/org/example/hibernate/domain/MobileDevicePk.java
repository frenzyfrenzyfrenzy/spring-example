package org.example.hibernate.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileDevicePk implements Serializable {

    private String mid;

    private String username;
}
