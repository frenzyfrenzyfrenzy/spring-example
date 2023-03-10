package org.example.hibernate.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MOBILE_DEVICES")
@IdClass(MobileDevicePk.class)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobileDevice {

    @Id
    @Column(name = "MID")
    private String mid;

    @Id
    @Column(name = "USERNAME")
    private String username;

    @Column(name = "APP_VERSION")
    private String appVersion;

}
