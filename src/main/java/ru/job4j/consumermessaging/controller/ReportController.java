package ru.job4j.consumermessaging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.job4j.consumermessaging.model.Passport;

import java.util.*;

/**
 * Controller для работы с удаленным сервисом - job4j_synchronous_messaging,
 * который является частью-1 данного проекта
 * в рамках архитектуры микросервисов
 * используя RestTemplate rest;
 */
@RestController
@RequestMapping("/report")
public class ReportController {

    private static final String API = "http://localhost:8080/passport/";
    private static final String API_FIND = "http://localhost:8080/passport/find";
    private static final String API_UNAVAILIABLE = "http://localhost:8080/passport/unavaliabe";
    private static final String API_FIND_REPLACEABLE = "http://localhost:8080/passport/find-replaceable";
    private static final String API_ID = "http://localhost:8080/passport/{id}";
    private static final String API_SERIAL = "http://localhost:8080/passport/{seria}";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * find All Passport
     *
     * @return List<Passport>
     */
    @GetMapping("/")
    public List<Passport> findAll() {
        List<Passport> passports = restTemplate.exchange(
                API_FIND,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Passport>>() {
                }
        ).getBody();
        return passports;
    }

    /**
     * save in DB
     *
     * @param passport
     * @return
     */
    @PostMapping("/")
    public ResponseEntity<Passport> create(@RequestBody Passport passport) {
        Passport rsl = restTemplate.postForObject(API, passport, Passport.class);
        return new ResponseEntity<>(
                rsl,
                HttpStatus.CREATED
        );
    }

    @PutMapping("/")
    public ResponseEntity<Void> update(@RequestBody Passport passport) {
        restTemplate.put(API, passport);
        return ResponseEntity.ok().build();
    }

    /**
     * получить Паспорт используя его id
     *
     * @param id (int) Passport Object int DB
     * @return ResponseEntity<Passport>
     */

    /**
     * find Passport using by serial number
     *
     * @param seria String
     * @return ResponseEntity<Passport>
     */
    @GetMapping("/{seria}")
    public ResponseEntity<Passport[]> findBySerial(@PathVariable String seria) {
        ResponseEntity<Passport[]> responseEntity = restTemplate.getForEntity(API_SERIAL,
                Passport[].class, seria);
        return responseEntity;

    }

    /**
     * delete Passport using by Passport object id  in DB(int)
     *
     * @param id
     * @return void
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        restTemplate.delete(API_ID, id);
        return ResponseEntity.ok().build();
    }

    /**
     * find all Passport object which more invalid
     *
     * @return ResponseEntity<List < Passport>>
     */
    @GetMapping("/unavaliabe")
    public ResponseEntity<Passport[]> findByDateExpiretion() {
        ResponseEntity<Passport[]> responseEntity = restTemplate.getForEntity(API_UNAVAILIABLE,
                Passport[].class);
        return responseEntity;
    }

    @GetMapping("/find-replaceable")
    public ResponseEntity<Passport[]> findByDateExpiretionByThreeMounth() {
        ResponseEntity<Passport[]> responseEntity = restTemplate.getForEntity(API_FIND_REPLACEABLE,
                Passport[].class);
        return responseEntity;
    }

}
