package com.javeedishaq.gmailclone.models

import com.javeedishaq.gmailclone.R

data class MailData(
    val mailId: Int,
    val userName: String,
    val userMail: String,
    val subject: String,
    val mailText: String,
    val timeStamp: String,
)


val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Charlie",
        userMail = "charlie@gmail.com",
        subject = "This is regarding our recent conversation",
        mailText = "Hey there this mail is regarding our recent conversation over other platforms",
        timeStamp = "11:08 am"
    ),
    MailData(
        mailId = 2,
        userName = "Sam",
        userMail = "sam@gmail.com",
        subject = "Email regarding job opportunity",
        mailText = "This is regarding a job opportunity for the profile or android developer in our organisation.",
        timeStamp = "10:00 am"
    ),
    MailData(
        mailId = 3,
        userName = "Dexter",
        userMail = "dexter@gmail.com",
        subject = "Regarding github collaboration",
        mailText = "This mail is regarding github collaboration for the new demos. Reply to this email if interested " +
                "in collaborating for future projects",
        timeStamp = "08:05 am"
    ),
    MailData(
        mailId = 4,
        userName = "Lelly",
        userMail = "lelly@gmail.com",
        subject = "Instagram promotion trial",
        mailText = "Hey, out platform is offering free trial for some of the lucky users. " +
                "In this trial you will get an opportunity to use our products for free (For a limited time)." +
                "Hurry! before the offer closes.",
        timeStamp = "07:45 am"
    ),
    MailData(
        mailId = 5,
        userName = "Stephen",
        userMail = "stephen@gmail.com",
        subject = "Newsletter: issue #125",
        mailText = "#jetpack Alpha release. #Android 11 new beta out and more",
        timeStamp = "06:25 am"
    ),
    MailData(
        mailId = 6,
        userName = "Sam",
        userMail = "sam@gmail.com",
        subject = "This is regarding our recent conversation",
        mailText = "Hey there this mail is regarding our recent conversation over other platforms",
        timeStamp = "06:00 am"
    ),
    MailData(
        mailId = 7,
        userName = "Shirley",
        userMail = "shirley@gmail.com",
        subject = "Weekly issue #25",
        mailText = "Weekly Issue #25: With the release of jetpack compose many new doors are opening in terms of creating UI " +
                "more easily and fast.",
        timeStamp = "05:30 am"
    ),
    MailData(
        mailId = 8,
        userName = "Slevester",
        userMail = "slevester@gmail.com",
        subject = "This is regarding promotion on Instagram",
        mailText = "Hi,, our new channels are open for trial. If you want to know more about our plans you can follow " +
                "up directly with me over this email thread.",
        timeStamp = "05:00 am"
    ),
    MailData(
        mailId = 9,
        userName = "Cristy",
        userMail = "cristy@gmail.com",
        subject = "Jetpack release alpha #MonthlyIssue 201",
        mailText = "Jetpack alpha version is now released. With the release of this library declarative UI's are now " +
                "something is Android. Create UI's easily and fast with Jetpack compose.",
        timeStamp = "04:25 am"
    ),
    MailData(
        mailId = 10,
        userName = "Henry",
        userMail = "henry@gmail.com",
        subject = "New message on Linkedin",
        mailText = "Hi, you have a new message on linkedin.",
        timeStamp = "02:00 am"
    ),
    MailData(
        mailId = 6,
        userName = "Sam",
        userMail = "sam@gmail.com",
        subject = "This is regarding our recent conversation",
        mailText = "Hey there this mail is regarding our recent conversation over other platforms",
        timeStamp = "06:00 am"
    ),
    MailData(
        mailId = 7,
        userName = "Shirley",
        userMail = "shirley@gmail.com",
        subject = "Weekly issue #25",
        mailText = "Weekly Issue #25: With the release of jetpack compose many new doors are opening in terms of creating UI " +
                "more easily and fast.",
        timeStamp = "05:30 am"
    ),
    MailData(
        mailId = 8,
        userName = "Slevester",
        userMail = "slevester@gmail.com",
        subject = "This is regarding promotion on Instagram",
        mailText = "Hi,, our new channels are open for trial. If you want to know more about our plans you can follow " +
                "up directly with me over this email thread.",
        timeStamp = "05:00 am"
    ),
    MailData(
        mailId = 9,
        userName = "Cristy",
        userMail = "cristy@gmail.com",
        subject = "Jetpack release alpha #MonthlyIssue 201",
        mailText = "Jetpack alpha version is now released. With the release of this library declarative UI's are now " +
                "something is Android. Create UI's easily and fast with Jetpack compose.",
        timeStamp = "04:25 am"
    ),
    MailData(
        mailId = 10,
        userName = "Henry",
        userMail = "henry@gmail.com",
        subject = "New message on Linkedin",
        mailText = "Hi, you have a new message on linkedin.",
        timeStamp = "02:00 am"
    ), MailData(
        mailId = 11,
        userName = "Sam",
        userMail = "sam@gmail.com",
        subject = "This is regarding our recent conversation",
        mailText = "Hey there this mail is regarding our recent conversation over other platforms",
        timeStamp = "06:00 am"
    ),
    MailData(
        mailId = 12,
        userName = "Shirley",
        userMail = "shirley@gmail.com",
        subject = "Weekly issue #25",
        mailText = "Weekly Issue #25: With the release of jetpack compose many new doors are opening in terms of creating UI " +
                "more easily and fast.",
        timeStamp = "05:30 am"
    ),
    MailData(
        mailId = 13,
        userName = "Slevester",
        userMail = "slevester@gmail.com",
        subject = "This is regarding promotion on Instagram",
        mailText = "Hi,, our new channels are open for trial. If you want to know more about our plans you can follow " +
                "up directly with me over this email thread.",
        timeStamp = "05:00 am"
    ),
    MailData(
        mailId = 14,
        userName = "Cristy",
        userMail = "cristy@gmail.com",
        subject = "Jetpack release alpha #MonthlyIssue 201",
        mailText = "Jetpack alpha version is now released. With the release of this library declarative UI's are now " +
                "something is Android. Create UI's easily and fast with Jetpack compose.",
        timeStamp = "04:25 am"
    ),
    MailData(
        mailId = 15,
        userName = "Henry",
        userMail = "henry@gmail.com",
        subject = "New message on Linkedin",
        mailText = "Hi, you have a new message on linkedin.",
        timeStamp = "02:00 am"
    )
)