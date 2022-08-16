public class lists {
    public static void main(String[] args) {
        int[] score;
        score = new int[5];

        System.out.println(score.length);

        score[0] = 3;
        System.out.println(score[0]);

        int[] scores = new int[] {10, 20, 30, 40, 50, 60, 70};
        System.out.println(scores[2]);

        String[] names = new String[] {"홍길동", "김예닮", "추승준"};
        System.out.println(names.length);

        String[] lists = {"나미", "김세정", "이종수", "김희대", "김예닮"};
        System.out.println(lists[2]);
    }
}
