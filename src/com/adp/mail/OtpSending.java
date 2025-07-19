package com.adp.mail;

import com.adp.connection.RDSConnection;
import com.adp.interfaces.AuthenticateScreen;
import com.adp.loggers.CustomLoggers;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Random;

public class OtpSending {

    public static String sendOtp(String toEmail) {

        final String from = "ayomalkaushalya@gmail.com";
        final String password = "spcsdaihpssxyojz"; // App-specific password

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
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse(toEmail)
//            );
//            message.setSubject("Aero Desk OTP");
//            message.setText("Your login OTP is: " + otp);
//
//            Transport.send(message);
            RDSConnection.executeUpdate("UPDATE employee "
                    + "SET `v_code` = '" + otp + "' WHERE `email` = '" + toEmail + "'");

            CustomLoggers.logger.info("OTP Email sent successfully to: " + toEmail);

        } catch (Exception e) {
            System.out.println(e);
            CustomLoggers.logger.info("OTP Generated & Sending Faild");
        }

        return String.valueOf(otp);
    }

}
