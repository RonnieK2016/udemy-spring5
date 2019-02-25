package com.udemy.sfg.jokes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerJokesSource {

    private List<String> quotes;

    public ComputerJokesSource() {
        quotes = new ArrayList<>(Arrays.asList(
                "Why did the computer go to the doctor?\n Because it had a virus!",
                "What do you call a computer floating in the ocean?\n A Dell Rolling in the Deep.",
                "What is written on Steve Jobs tombstone?\n iCame, iSaw, iConquered, iLeft, iCameBack, iThinkDifferent, iMac, iPod, iTunes, iPhone, iPad, iCloud, iRIP",
                "Why do Java developers wear glasses?\n Because they don't C#.",
                "What do you call a computer that sings?\n A-Dell",
                "Where did the computer go to dance?\n To a disc-o.",
                "Why was the computer cold at night?\n Because it left its windows open.",
                "What is an astronaut's favorite place on a computer?\n The Space bar!",
                "What did the dentist say to the computer?\n This won't hurt a byte.",
                "What type of a computer does a horse like to eat?\n A Macintosh.",
                "What does a blonde do when her laptop computer freezes?\n She sticks it in the microwave!",
                "How do you know if a blonde has been using a computer?\n There's whiteout on the screen.",
                "What do you call a woman you married off the internet?\n Wife-I.",
                "What does a baby computer calls its father?\n Obsolete",
                "What do you get if you cross a computer with a ballet dancer?\n The Netcracker suite.",
                "What does a king computer do?\n Execute his programs!",
                "Why won't blondes take their iPhones to the bathroom?\n Because they don't want to give away their IP address!",
                "How do you get a computer drunk?\n A Screenshot of Tequila.",
                "Why couldn't Bill Gates get a mistress?\n Because he's penis was MICROSOFT!",
                "What part of a computer does a spider use?\n The webcam.",
                "What happens when a Buddhist becomes totally absorbed with the computer he is working with?\n He enters Nerdvana.",
                "Why did Jack and Jill \"really\" go up the hill?\n To get better Wi-fi.",
                "Why was the computer shy?\n Because it had hardware and software but no underware.",
                "What was the spider doing on the computer?\n Searching the web!",
                "Why can't an elephant use a computer?\n He's too afraid of the mouse.",
                "What do you get when you cross a hamburger with a computer?\n A big mac!",
                "How are elephants and computers similar?\n They both have big memories.",
                "How did the spider destroy the (worldwide) web?\n It gave it a bug.",
                "Why did Mark Zuckerberg visit Beijing, China?\n To see the \"Great Firewall\".",
                "Why are PCs like air conditioners?\n They stop working properly if you open Windows!",
                "What did mommy spider say to baby spider?\n You spend too much time on the web.",
                "What was the hipster doing at the computer?\n Looking in the recycling bin for something retro.",
                "Why did the computer break up with the internet?\n There was no \"Connection\".",
                "Why was the computer tired when it got home?\n It had a \"hard drive\"",
                "What do you call a country with slow internet speeds?\n America Online.",
                "Why did the boy lick the USB port?\n Because he was an etard.",
                "What's the difference between Paul Walker and a computer?\n I actually care when my computer crashes.",
                "Why did the computer go to the dentist?\n Because it had Bluetooth.",
                "How many programmers does it take to change a light bulb?\n None, that's a hardware problem.",
                "What do you call an iPhone that isn't kidding around?\n Dead Siri-ous",
                "What is the difference between a redhead and a computer?\n Redhead won't accept a three and a half inch. ",
                "What did the turkey say to the computer?\n Google, google, google!",
                "How do trees us a computer?\n They log in!",
                "What's the difference between an Linux and a virus?\n A virus does something.",
                "What kind of party does a laptop go to?\n A CISCO party.",
                "How do you know you are using Linux?\n Your computer only has 4 modes: Abort, Retry, Fail and Reboot!",
                "Why did the powerpoint maker cross the road?\n To get to the other slide!",
                "How many Microsoft programmers does it take to change a lightbulb?\n None. Bill Gates will just redefine Darkness(TM) as the new industry standard. ",
                "What do you call a brunette in between 2 French blondes visiting America?\n Google translate.",
                "What do you call an egg who is on the computer too much?\n An \"Egg Head\"",
                "What's the difference between a virus and Windows Vista?\n Viruses rarely fail. ",
                "Programming is like sex:\\r\\n One mistake and you have to support it for the rest of your life.",
                "Person1: Aren't we all internet explorers?\n Person2: You mean we run slow and no one likes us.",
                "Somebody stole my new Microsoft Office last week and they are going to pay!\\r\\n You have my Word!"
        ));
    }

    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(1, quotes.size()));
    }

}
