public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        for(int i = 0; i < m.length; i++){
            m[i] = new Movie();
        }
        m[0].name = "Avatar";
        m[0].actor = "k";
        m[0].audience = 160;
        m[0].date = "22.12.30";
        m[1].name = "Die Hard";
        m[1].actor = "P";
        m[1].audience = 1620;
        m[1].date = "20.12.30";
        m[2].name = "Harry Potter";
        m[2].actor = "sfd";
        m[2].audience = 3123;
        m[2].date = "22.12.3";
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i].actor + "\t" + m[i].name + "\t" + m[i].date + "\t" + m[i].audience);
        }

    }
}
