package ru.job4j.consumermessaging.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * Доменная модель - паспорт
 * Date created -дата выдачи
 * Date replace -дата окончания дествия документа
 */
@Data
@EqualsAndHashCode
public class Passport {
    @EqualsAndHashCode.Include
    private int id;

    private String seria;

    private int number;

    private String codeDepartment;

    private Date created;

    private Date replace;

    private String department;

    public Passport() {
    }

    public static Passport of(String seria) {
        Passport passport = new Passport();
        passport.seria = seria;
        return passport;
    }
}
