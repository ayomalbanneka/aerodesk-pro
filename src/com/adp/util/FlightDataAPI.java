/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adp.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author capta
 */
public class FlightDataAPI {

    public static Vector<FlightData> flightData = new Vector();
    private final static String API_KEY = "15faba367437fa6966b48f77a060adb0";

    public static Vector<FlightData> fetchFlightData() {
        try {
            String endPoint = String.format("https://api.aviationstack.com/v1/flights?access_key=" + API_KEY);
            URL url = new URL(endPoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            InputStreamReader in = new InputStreamReader(con.getInputStream());
            BufferedReader br = new BufferedReader(in);
            StringBuilder jsonBuilder = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                jsonBuilder.append(line);
            }
            br.close();

            JSONObject json = new JSONObject(jsonBuilder.toString());
            JSONArray data = json.getJSONArray("data");
            for (int i = 0; i < data.length(); i++) {
                System.out.println(i);
                JSONObject flight = data.getJSONObject(i);
                String departureAirport = flight.getJSONObject("departure").optString("airport", "N/A");
                String departureTimezone = flight.getJSONObject("departure").optString("timezone", "N/A");
                String departureGate = flight.getJSONObject("departure").optString("gate", "N/A");
                String departureTermianl = flight.getJSONObject("departure").optString("terminal", "N/A");
                String departureScheduled = flight.getJSONObject("departure").optString("scheduled", "N/A");

                String arrivalTimezone = flight.getJSONObject("arrival").optString("timezone", "N/A");
                String arrivalGate = flight.getJSONObject("arrival").optString("gate", "N/A");
                String arrivalTermianl = flight.getJSONObject("arrival").optString("terminal", "N/A");
                String arrivalScheduled = flight.getJSONObject("arrival").optString("scheduled", "N/A");

                String airLine = flight.getJSONObject("airline").optString("name", "N/A");

                String airReg = flight.getJSONObject("flight").optString("number", "N/A");
                flightData.add(new FlightData(departureAirport, departureTimezone, departureGate, departureTermianl, departureScheduled, arrivalTimezone, arrivalGate, arrivalTermianl, arrivalScheduled, airLine, airReg));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flightData;
    }

//    public static void main(String[] args) {
//        Vector<FlightData> fetchedData = fetchFlightData();
//        for (FlightData flight : fetchedData) {
//            String departureAirport = flight.departureAirport;
//            String departureTimezone = flight.departureTimezone;
//            String departureGate = flight.departureGate;
//            String departureTermianl = flight.departureTermianl;
//            String departureScheduled = flight.departureScheduled;
//            String arrivalTimezone = flight.arrivalTimezone;
//            String arrivalGate = flight.arrivalGate;
//            String arrivalTermianl = flight.departureTermianl;
//            String arrivalScheduled = flight.arrivalScheduled;
//            String airLine = flight.airLine;
//            String airReg = flight.airReg;
//            System.out.println( departureAirport + "\n: " + departureTimezone+"\n"+departureGate+"\n"+departureTermianl+"\n"+departureScheduled+"\n"+arrivalTimezone+"\n"+arrivalGate+"\n"+
//                    arrivalTermianl+"\n"+arrivalScheduled+"\n"+airLine+"\n"+airReg);
//        }
//    }
}
