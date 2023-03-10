package org.example.hibernate.rest;

import com.google.common.collect.Lists;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.example.hibernate.domain.MobileDevice;
import org.example.hibernate.domain.MobileDevicePk;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/devices", produces = MediaType.APPLICATION_JSON_VALUE)
public class DevicesController {

    @Autowired
    private SessionFactory sessionFactory;

    @PostMapping
    @Transactional
    public MobileDevice insertDevice(
            @RequestParam("mid") String mid,
            @RequestParam("username") String username,
            @RequestParam("appVersion") String appVersion) {

        MobileDevice mobileDevice = MobileDevice.builder()
                .mid(mid)
                .username(username)
                .appVersion(appVersion)
                .build();

        sessionFactory.getCurrentSession().persist(mobileDevice);

        return mobileDevice;
    }

    @PutMapping
    @Transactional
    public MobileDevice insertOrUpdateDevice(
            @RequestParam("mid") String mid,
            @RequestParam("username") String username,
            @RequestParam("appVersion") String appVersion) {

        MobileDevice mobileDevice = MobileDevice.builder()
                .mid(mid)
                .username(username)
                .appVersion(appVersion)
                .build();

        sessionFactory.getCurrentSession().saveOrUpdate(mobileDevice);

        return mobileDevice;
    }

    @GetMapping
    @Transactional
    public MobileDevice getUserDevices(@RequestParam("mid") String mid, @RequestParam("username") String username) {


        MobileDevicePk pk = MobileDevicePk.builder()
                .mid(mid)
                .username(username)
                .build();

        return sessionFactory.getCurrentSession().find(MobileDevice.class, pk);
    }

}
