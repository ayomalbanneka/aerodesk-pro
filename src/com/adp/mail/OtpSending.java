/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adp.mail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Random;

public class OtpSending {

    public static String sendOtp(String toEmail) {
        final String from = "ayomalkaushalya@gmail.com";
        final String password = ""; // App-specific password

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        // Generate 9-digit OTP
        int otp = new Random().nextInt(900_000_000) + 100_000_000;

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail)
            );
            message.setSubject("Aero Desk OTP");
            message.setText("Your login OTP is: " + otp);

            Transport.send(message);
            System.out.println("OTP Email sent successfully to: " + toEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return String.valueOf(otp);
    }

}
