package com.whizlabs.spring.basics.bean.jsrannotation.data;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Provider;

@ManagedBean
public class Person {
    private Identity identity;
    private Provider<Location> locationProvider;
    private Occupation occupation;

    public Identity getIdentity() {
        return identity;
    }

    @Resource
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public Provider<Location> getLocationProvider() {
        return locationProvider;
    }

    @Inject
    public void setLocationProvider(Provider<Location> locationProvider) {
        this.locationProvider = locationProvider;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
}
