package pro0328homework;

// java homework No.06 20191458 정민혁
public class No06 {

    public static void main(String[] args) {

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while (true) {

            System.out.print("영어 단어를 입력 하세요 >>");
            String t = sc.next();

            if (t.equals(eng)) {
                System.out.println(kor);
            } else if (t.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("그런 영어 단어는 없습니다.");
            }
        }

    }

}
