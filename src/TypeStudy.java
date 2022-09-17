import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TypeStudy {
    public static void main(String[] args) {
        Number();
        Bool();
        Char();
        Str();
        Arr();
        Lst();
    }

    static void Number() {
        int a = 10;
        int b = 5;
        int octal = 023;
        int hex = 0xCB;
        int bin = 0b01;

        System.out.println("3-1 Number");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(octal);
        System.out.println(hex);
        System.out.println(bin);
        System.out.println();
    }

    static void Bool() {
        System.out.println("3-2 Bool");
        System.out.printf("2>1 -> %b\n", 2>1);
        System.out.printf("1==2 -> %b\n", 1==2);
        System.out.printf("3%%2==1 -> %b\n", 3%2==1);
        System.out.printf("\"3\".equals(\"2\") -> %b\n", "3".equals("2"));

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
        System.out.println();
    }

    static void Char() {
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';

        System.out.println("3-3 Char");
        System.out.printf("%c, %c, %c\n", a1, a2, a3);
        System.out.println();
    }

    static void Str() {
        // StringBuffer로 객체 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량 많고 속도 느림
        // 상황에 따라(문자열 변경 양에 따라) StringBuffer가 아닌 String을 사용하는 것이 유리
        // StringBuffer와 StringBuilder의 사용법은 거의 동일, StringBuffer는 멀티스레드 환경에서 안전
        // 반면 StringBuilder는 비교적 성능이 우선
        System.out.println("3-4, 3-5 String");

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        String result = sb.toString();
        System.out.println(result);

        sb.insert(0, "[INSERT TEST]: ");
        result = sb.toString();
        System.out.println(result);

        System.out.println(sb.substring(0, 14));
        System.out.println();
    }

    static void Arr() {
        System.out.println("3-6 Array");

        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.printf("Index 3: %s\n", weeks[3]);

        for (int i=0; i<weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        System.out.println();
    }

    static void Lst() {
        System.out.println("3-7 List");

        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        System.out.println(pitches.size());
        System.out.println(pitches.get(1));
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.remove("129"));
        System.out.println(pitches);

        pitches.add("121");
        pitches.add("122");

        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);

        System.out.println();
    }
}
