package com.test;

import com.bean.Person;
import com.bean.PersonVo;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;


/**
 * Stream.Map 管道转换
 * create by guoguangnan 2017-12-25
 */
public class ListStreamMap {

    public static void main(String[] args) {

        //java 1.8
        List<PersonVo> list = PersonList.getPersonList().stream().map(p->{
            PersonVo vo = new PersonVo();
            vo.setPersonAge(p.getPersonAge());
            vo.setPersonId(p.getPersonId());
            vo.setPersonName(p.getPersonName()+"---");
            return vo;
        }).collect(toList());

        list.forEach(p ->{
            System.out.println(p.getPersonId()+" "+p.getPersonAge()+" "+p.getPersonName());
        });


        Person p = new Person();
        p.setPersonId(1L);
        p.setPersonName("Tom");
        p.setPersonAge(18);

        PersonVo v = Optional.of(p).map(person -> {
            PersonVo vo = new PersonVo();
            vo.setPersonName(person.getPersonName());
            return vo;
        }).orElseThrow(()->{
            return new RuntimeException();
        });

    }
}
