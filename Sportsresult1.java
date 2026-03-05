interface student {
    int score = 10; // academic score

    void displayscore();
}

interface sports {
    int score = 25; // sports score

    void displaysports();
}

class result implements student, sports {
    public void displayscore() {
        System.out.println("Academic score is " + student.score);
    }

    public void displaysports() {
        System.out.println("Sports score is " + sports.score);
    }
}

public class Sportsresult1 {
    public static void main(String[] args) {
        result r = new result();
        r.displayscore();
        r.displaysports();
    }
}