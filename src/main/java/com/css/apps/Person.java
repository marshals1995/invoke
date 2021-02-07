package com.css.apps;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author marshal
 * @date 2021/2/4
 * @description
 */
@Data
@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Column(name="GENDER")
    private Integer gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
