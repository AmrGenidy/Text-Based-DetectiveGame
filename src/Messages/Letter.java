package Messages;

public class Letter {
    private String invitation;
    private String caseDescription;

    public Letter() {
        // Invitation content
        invitation = "To Mr. Sherlock Holmes,\n" +
                "221B Baker Street,\n" +
                "London.\n\n" +
                "Dear Mr. Holmes,\n\n" +
                "I find myself in need of your unique talents once again. A most perplexing and troubling case has arisen at Blackwood Hall, " +
                "the estate of the late Sir Reginald Blackwood. Last night, Sir Reginald was found dead in his study, stabbed with one of his own ceremonial daggers. " +
                "The door was locked from the inside, and the window was bolted shut—an impossible crime, by all accounts.\n\n" +
                "The family and guests are in a state of agitation, and the staff whisper of curses and phantoms. " +
                "I fear that without your keen eye and deductive reasoning, this case may remain unsolved.\n\n" +
                "I have secured your invitation to Blackwood Hall. A carriage will collect you and Dr. Watson at your earliest convenience. " +
                "Time is of the essence, as a storm threatens to cut off the estate from the outside world.\n\n" +
                "Yours sincerely,\n" +
                "Inspector G. Lestrade, Scotland Yard";

        // Case description content
        caseDescription = "The case of The Murder at Blackwood Hall is full of mystery and dark secrets. " +
                "The mansion feels alive, with shadowy hallways and hidden rooms that whisper tales of the past. " +
                "Sir Reginald Blackwood, a wealthy and powerful man, has been killed in his own Study. " +
                "The door was locked from the inside, and the window was bolted shut—making it seem impossible " +
                "for the killer to enter or exit.\n\n" +
                "The suspects are as puzzling as the crime:\n" +
                "Lady Eleanor Blackwood, Sir Reginald’s wife, whose calm demeanor belies her inner coldness " +
                "and the fortune she stands to inherit.\n" +
                "Victor Blackwood, Sir Reginald’s estranged son, an artist with a volatile temper and " +
                "a history of clashes with his father over money and lifestyle.\n" +
                "Miss Clara Hastings, Sir Reginald’s niece, quiet and polite, yet her hidden plans " +
                "make her hard to read.\n" +
                "Dr. Jonathan Graves, the family doctor, whose nervous behavior and odd disappearance " +
                "at times raise suspicion.\n" +
                "Mr. Harold Whitaker, Sir Reginald’s business partner, embroiled in financial disputes " +
                "and a crumpled contract of dubious nature.\n" +
                "Mrs. Beatrice Poole, the long-serving housekeeper, keeper of family secrets and " +
                "witness to muddy footprints outside the Study window.\n";
    }

    // Display the invitation
    public void displayInvitation() {
        System.out.println(invitation);
    }

    // Display the case description
    public void displayCaseDescription() {
        System.out.println(caseDescription);
    }
}