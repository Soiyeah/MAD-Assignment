package com.example.asus.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String month = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        showMessage(month);
    }

    public void showMessage(String month)
    {

        String message="";

        switch(month) {
            case "January" :
                message = "\tAmbitious and powerful. Born leader. Stubborn nature. You always stand out in the crowd." +
                        " You love to live the good life. Romantic at heart. Deep thinker. Loyal to friends. Ever ready to " +
                        "learn and try out new things. Serious about life. Like to make other happy. Not too introvert, not too" +
                        " extrovert. Smart and well dressed.";
                break;

            case "February" :
                message = "Creative and unconventional, you have difficulty working a traditional 9 to 5 job. " +
                        "You are better suited for a career in the arts. You need to work hard to be self-sufficient, " +
                        "but you have the motivation to reach your goals. However, it will be difficult for you to be financially " +
                        "stable if you can't control your rebellious streak.";
                break;

            case "March" :
                message = "Attractive personality. sexy. Affectionate Shy and reserved. Secretive. Naturally honest, generous and " +
                        "sympathetic. Loves peace and serenity. Sensitive to others. Great kisser. Easily angered." +
                        " Trustworthy. Appreciative and returns kindness. Hardly shows emotions. Tends to bottle up feelings. " +
                        "Observant and assesses others.";
                break;

            case "April" :
                message = "Suave and compromising. Funny and humorous. Stubborn. Very talkative. Calm and cool. Kind and sympathetic." +
                        " Concerned and detailed. Loyal. Does work well with others. Very confidant. Sensitive. Positive Attitude." +
                        " Thinking generous. Good memory. Clever and knowledgeable. Loves to look for information. Able to cheer everyone" +
                        " up and/or make them laugh. able to motivate oneself and others. Understanding. Fun to be around. Outgoing. Hyper." +
                        " Bubbly personality. Secretive. Boy/girl crazy. Loves sports, music, leisure and traveling. Systematic. Hot but has brains.";
                break;

            case "May" :
                message = "Pleasing and attractive personality. Good looking. You adapt well to-wards life. Independent. Secretive. Intelligent mind." +
                        " You get easily angry. Very stubborn at time. You love attention. More logical than emotional. You dream big. " +
                        "Dynamic and active. Quick to re-turn favors. Honest.";
                break;

            case "June" :
                message = "Foresighted. Get easily worried. Quite talkative. Very friendly. Stylish and fashionable. Warm and considerate towards people. " +
                        "Great sense of humor. Quite sensitive. Star in the crowd. Active and visionary thinker. Kind and generous. de-bate. of life. ";
                break;

            case "July" :
                message = "Fun to be with. Secretive. Difficult to fathom and to be understood. Quiet unless excited or tensed. " +
                        "Takes pride in oneself. Has reputation. Easily consoled. Honest. Concerned about people's Feelings. " +
                        "Tactful. Friendly. Approachable. ";
                break;

            case "August" :
                message = "Very ambitious. Brave and daring attitude. Devoted lover. Sensitive nature. You get jealous easily." +
                        " You also get angry very easily. You are proud of your achievements. Attention seeker. Very generous. " +
                        "Easy going. Strong character. Born to be successful. Observant. Creative bent of mind. Caring and loving. " +
                        "Faithful friend.";
                break;

            case "September" :
                message = "Wise and humble. Inspiring character. Cool in difficult situations. Altruistic and sympathetic." +
                        " You love traveling. Knowledgeable-beyond your years. Industrious. Understanding nature. Friendly with all." +
                        " You like helping others. Fun to be with. Loyal lover. Good looker and great dresser. Confident.";
                break;

            case "October" :
                message = "Clairvoyant. Nature lover. You are a born leader. People look up to you. Amiable. Honest. " +
                        "More emotional than practical. Rebellious at times. Totally independent. Good looker. Clever. " +
                        "Faithful towards family, friends and your love. You give importance where due. Dedicated and hard working.";
                break;

            case "November" :
                message = "Trustworthy and loyal. Very passionate and dangerous. Wild at time. Knows how to have fun. Sexy and mysterious." +
                        " Everyone is drawn towards your inner and outer beauty and independent personality.";
                break;

            case "December" :
                message = "Greater sense of humor. Cheerful and vibrant. Ambitious. Short tempered. Impatient. More logical than emotional." +
                        " Attractive looks and pleasing personality. Honest and trustworthy. Generous. Amiable. Dynamic. Ove to be praised.";
                break;

            default :
                System.out.println("Invalid month");
        }


        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message); // should be message
    }









}
