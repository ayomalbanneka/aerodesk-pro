/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adp.util;

/**
 *
 * @author capta
 */
public class FlightData {

    String departureAirport;
    String departureTimezone;
    String departureGate;
    String departureTermianl;
    String departureScheduled;
    String arrivalTimezone;
    String arrivalGate;
    String arrivalTermianl;
    String arrivalScheduled;
    String airLine;
    String airReg;

    public FlightData(String departureAirport,
            String departureTimezone,
            String departureGate,
            String departureTermianl,
            String departureScheduled,
            String arrivalTimezone,
            String arrivalGate,
            String arrivalTermianl,
            String arrivalScheduled,
            String airLine,
            String airReg) {
        this.departureAirport = departureAirport;
        this.departureTimezone = departureTimezone;
        this.departureGate = departureGate;
        this.departureTermianl = departureTermianl;
        this.departureScheduled = departureScheduled;
        this.arrivalTermianl = arrivalTimezone;
        this.arrivalGate = arrivalGate;
        this.arrivalTermianl = arrivalTermianl;
        this.arrivalScheduled = arrivalScheduled;
        this.airLine = airLine;
        this.airReg = airReg;
    }

    public String getAirLine() {
        return airLine;
    }

    public String getAirReg() {
        return airReg;
    }

    public String getArrivalGate() {
        return arrivalGate;
    }

    public String getArrivalScheduled() {
        return arrivalScheduled;
    }

    public String getArrivalTermianl() {
        return arrivalTermianl;
    }

    public String getArrivalTimezone() {
        return arrivalTimezone;
    }

    public String getDepartureGate() {
        return departureGate;
    }

    public String getDepartureScheduled() {
        return departureScheduled;
    }

    public String getDepartureTermianl() {
        return departureTermianl;
    }

    public String getDepartureTimezone() {
        return departureTimezone;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

}
