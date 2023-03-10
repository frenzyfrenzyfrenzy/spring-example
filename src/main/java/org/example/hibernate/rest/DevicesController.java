package org.example.hibernate.rest;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/devices", produces = MediaType.APPLICATION_JSON_VALUE)
public class DevicesController {

    @GetMapping
    public List<String> getAllDevices() {
        log.info("HERE");
       return Lists.newArrayList("first device", "second device");
    }

}
