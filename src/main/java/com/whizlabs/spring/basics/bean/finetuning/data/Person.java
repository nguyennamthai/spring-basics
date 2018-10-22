package com.whizlabs.spring.basics.bean.finetuning.data;

import com.whizlabs.spring.basics.bean.finetuning.Trailblazer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Person {
    private Name first;
    private Name second;
    private Name third;
    @Autowired
    @Qualifier("eagle")
    private Name forth;
    private Name fifth;

    private List<Name> names;

    public Name getFirst() {
        return first;
    }

    @Autowired
    @Primary
    public void setFirst(Name first) {
        this.first = first;
    }

    public Name getSecond() {
        return second;
    }

    @Autowired
    public void setSecond(@Qualifier("renegade") Name second) {
        this.second = second;
    }

    public Name getThird() {
        return third;
    }

    @Autowired
    public void setThird(@Trailblazer Name third) {
        this.third = third;
    }

    public Name getForth() {
        return forth;
    }

    public Name getFifth() {
        return fifth;
    }

    @Autowired(required = false)
    public void setFifth(@Qualifier("fifth") Name fifth) {
        this.fifth = fifth;
    }

    public List<Name> getNames() {
        return names;
    }

    @Autowired
    public void setNameMap(List<Name> names) {
        this.names = names;
    }
}
