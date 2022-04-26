/**
 * Istomin, April 2022
 * 20 tasks
 * Usage: Specify task number (1..20) in the first line of main method
*/

import java.util.*;
public class Lab0 {
    public static void main(String[] args) {
        int task = 0;
        switch (task) {
            case 1:
                _1_oppositeHouse(1, 3);
                _1_oppositeHouse(2, 3);
                _1_oppositeHouse(3, 5);
                _1_oppositeHouse(5, 46);
                break;
            case 2:
                _2_nameShuffle("Donald Trump");
                _2_nameShuffle("Rosie O'Donnell");
                _2_nameShuffle("Seymour Butts");
                break;
            case 3:
                _3_discount(1500, 50); // ➞ 750
                _3_discount(89, 20);   // ➞ 71.2
                _3_discount(100, 75);  // ➞ 25
                break;
            case 4:
                _4_differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}); // ➞ 82
                _4_differenceMaxMin(new int[] {44, 32, 86, 19});                // ➞ 67
                break;
            case 5:
                _5_equal(3,4,3);    // 2
                _5_equal(1,1,1);    // 3
                _5_equal(3,4,1);    // 0
                break;
            case 6:
                _6_reverse("Hello World");               // ➞ "dlroW olleH"
                _6_reverse("The quick brown fox.");      // ➞ ".xof nworb kciuq ehT"
                _6_reverse("Edabit is really helpful!"); // ➞ "!lufpleh yllaer si tibadE"
                break;
            case 7:
                _7_programmers(147, 33, 526);  // ➞ 493
                _7_programmers(33, 72, 74);    // ➞ 41
                _7_programmers(1, 5, 9);       // ➞ 8
                break;
            case 8:
                _8_getXO("ooxx");      // ➞ true
                _8_getXO("xooxx");     // ➞ false
                _8_getXO("ooxXm");     // ➞ true
                _8_getXO("zpzpzpp");   // ➞ true
                break;
            case 9:
                _9_bomb("There is a bomb.");                    // ➞ "DUCK!"
                _9_bomb("Hey, did you think there is a BOMB?"); // ➞ "DUCK!"
                _9_bomb("This goes boom!!!");                   // ➞ "Relax..."
                break;
            case 10:
                _10_sameAscii("EdAbIt", "EDABIT");
                _10_sameAscii("AA", "B@");
                break;
            case 11:
                Map<String, Integer> cities = new HashMap<String, Integer>();
                cities.put("Nice", 942208);
                cities.put("Abu Dhabi", 1482816);
                cities.put("Naples", 2186853);
                cities.put("Manila", 13923452);
                cities.put("Kuala Lumpur", 7996830);
                cities.put("Jakarta", 10770487);
                cities.put("Vatican City", 572);
                _11_millionsRounding(cities);
                cities.put("Astrakhan", 457202);
                break;
            case 12:
                System.out.println(Arrays.toString(_12_otherSides(1)));  // ➞ [2.0, 1.73]
                System.out.println(Arrays.toString(_12_otherSides(12))); // ➞ [24.0, 20.0]
                System.out.println(Arrays.toString(_12_otherSides(2)));  // ➞ [4.0, 3.46]
                System.out.println(Arrays.toString(_12_otherSides(3)));  // ➞ [6.0, 5.2]
                break;
            case 13:
                System.out.println(_13_rps("rock", "paper"));        // ➞ "Player 2 wins"
                System.out.println(_13_rps("paper", "rock"));        // ➞ "Player 1 wins"
                System.out.println(_13_rps("paper", "scissors"));    // ➞ "Player 2 wins"
                System.out.println(_13_rps("scissors", "paper"));    // ➞ "Player 1 wins"
                System.out.println(_13_rps("scissors", "scissors")); // ➞ "TIE"
                break;
            case 14:
                _14_warOfNumbers(new int[] {2, 8, 7, 5});
                _14_warOfNumbers(new int[] {12, 90, 75});
                _14_warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
                break;
            case 15:
                System.out.println(_15_reverseCase("Happy Birthday"));   // "hAPPY bIRTHDAY"
                System.out.println(_15_reverseCase("MANY THANKS"));      // "many thanks"
                System.out.println(_15_reverseCase("sPoNtAnEoUs"));
                break;
            case 16:
                System.out.println(_16_inatorInator("Shrink"));     // "Shrinkinator 6000"
                System.out.println(_16_inatorInator("Doom"));       // "Doominator 4000"
                System.out.println(_16_inatorInator("EvilClone"));  // "EvilClone-inator 9000"
                break;
            case 17:
                System.out.println(_17_doesBrickFit(1, 1, 1, 1, 1)); //➞ true
                System.out.println(_17_doesBrickFit(1, 2, 1, 1, 1)); //➞ true
                System.out.println(_17_doesBrickFit(1, 2, 2, 1, 1)); //➞ false
                break;
            case 18:
                System.out.printf("%.2f%n", _18_totalDistance(70.0, 7.0, 0, false)); // ➞ 1000.0
                System.out.printf("%.2f%n", _18_totalDistance(36.1, 8.6, 3, true));  // ➞ 331.83
                System.out.printf("%.2f%n", _18_totalDistance(55.5, 5.5, 5, false)); // ➞ 807.3
                break;
            case 19:
                System.out.printf("%.4f%n", _19_mean(new int[] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));   // ➞ 2.55
                System.out.printf("%.4f%n", _19_mean(new int[] {2, 3, 2, 3}));                        // ➞ 2.50
                System.out.printf("%.4f%n", _19_mean(new int[] {3, 3, 3, 3, 3}));                     // ➞ 3.00
                break;
            case 20:
                System.out.println(_20_parityAnalysis(243)); // ➞ true // 243 is odd and so is 9 (2 + 4 + 3)
                System.out.println(_20_parityAnalysis(12));  // ➞ false // 12 is even but 3 is odd (1 + 2)
                System.out.println(_20_parityAnalysis(3));   // ➞ true // 3 is odd and 3 is odd and 3 is odd (3)
            default:
                System.out.println("Please, specify the task number");
        }
    }
    private static void _1_oppositeHouse(int house_number, int street_length) {
        int s = Math.abs(street_length * 2);
        int n = Math.abs(house_number) % s;
        int m = s - n + 1;
        System.out.printf("House:%d Opposite:%d \n", n, m);
    }

    private static void _2_nameShuffle(String full_name) {
        String[] names = full_name.split(" ");
        System.out.printf("%s %s%n", names[1], names[0]);
    }

    private static void _3_discount(int price, int discount) {
        double new_price = price - (double) price / 100 * discount;
        System.out.printf("%.2f%n", new_price);
    }

    private static void _4_differenceMaxMin(int[] array) {
        int x = Arrays.stream(array).max().getAsInt();
        int y = Arrays.stream(array).min().getAsInt();
        System.out.printf("%d\n", Math.abs(x - y));
    }

    private static void _5_equal(int a, int b, int c) {
        boolean e3 = (a == b) & (b == c);
        boolean e2 = (a == b) | (b == c) | (a == c);
        int n = (e3 ? 3 : (e2 ? 2 : 0));
        System.out.printf("%d\n", n);
    }

    private static void _6_reverse(String str) {
        System.out.println(new StringBuilder(str).reverse().toString());
    }

    private static void _7_programmers(int a, int b, int c) {
        int x = Arrays.stream(new int[]{a, b, c}).max().getAsInt();
        int y = Arrays.stream(new int[]{a, b, c}).min().getAsInt();
        System.out.printf("%d\n", Math.abs(x - y));
    }

    private static void _8_getXO(String str) {
        int nX = 0, nO = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.toUpperCase().charAt(i);
            nX += (c == 'X' ? 1 : 0);
            nO += (c == 'O' ? 1 : 0);
        }
        System.out.println(nX == nO);
    }

    private static void _9_bomb(String str) {
        String s1 = str.toUpperCase();
        String s2 = (s1.contains("BOMB") ? "DUCK!" : "Relax, there's no bomb.");
        System.out.println(s2);
    }

    private static void _10_sameAscii(String str1, String str2) {
        int n1 = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            n1 += c1;
        }
        int n2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            char c2 = str2.charAt(i);
            n2 += c2;
        }
        boolean y = (n1 == n2);
        System.out.println(y);
    }
    private static void  _11_millionsRounding(Map<String, Integer> cities) {
        final int k = 1_000_000;
        // System.out.println(cities);
        for(Map.Entry<String, Integer> city : cities.entrySet()){
            System.out.printf("City: %12s,\tPopulation: %8d,\tMillions round: %8d \n",
                    city.getKey(), city.getValue(),
                    Math.round((double)city.getValue() / k) * k);
        }
    }
    private static double[] _12_otherSides(double a) {
        double[] bc = new double[2];
        bc[0] = (a * 2);
        bc[1] = Math.ceil(a * Math.sqrt(3) * 1000) / 1000;
        return (bc);
    }
    private static String _13_rps(String x, String y) {
        String p = "paper";
        String r = "rock";
        String s = "scissors";
        String result;
        String res0 = "TIE";
        String res1 = "Player 1 wins";
        String res2 = "Player 2 wins";
        List<String> win1 = new ArrayList<>();
        win1.add(p+r); win1.add(r+s); win1.add(s+p);
        List<String> win2 = new ArrayList<>();
        win2.add(r+p); win2.add(s+r); win2.add(p+s);
        if (win1.contains(x+y)) result = res1; else
        if (win2.contains(x+y)) result = res2; else result = res0;
        return result;
    }
    private static int _14_warOfNumbers(int[] numbers) {
        int odd_count = 0;
        int evn_count = 0;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] % 2 == 0) {
                evn_count += numbers[i];
            } else {
                odd_count += numbers[i];
            }
        }
        int result = Math.abs(odd_count - evn_count);
        System.out.println(result);
        return result;
    }
    private static String _15_reverseCase(String str) {
        String strUpper = str.toUpperCase();
        String strLower = str.toLowerCase();
        String result = "";
        for (int i=0;i<str.length();i++) {
            char c0 = str.charAt(i);
            char c1 = strUpper.charAt(i);
            char c2 = strLower.charAt(i);
            result += (c0==c1 ? c2 : c1);
        }
        return result;
    }
    private static String _16_inatorInator(String str) {
        String result = "";
        // Alphabet = "abcdefghijklmnopqrstuvwxyz";
        String consonants = "bcdfghjklmnpqrstvwxz";
        List<Character> list1 = new ArrayList<>();
        for (int i=0;i<consonants.length();i++) {
            list1.add(consonants.charAt(i));
        }
        // System.out.println(list1.toString());
        char last_symbol = str.charAt(str.length()-1);
        if (list1.contains(last_symbol)) {
            result = str + "inator";
        } else {
            result = str + "-inator";
        }
        result = result + " " + str.length() + "000";
        return result;
    }
    private static boolean _17_doesBrickFit(int a, int b, int c, int w, int h) {
        return (a <= w & b <= h || b <= w & c <= h || a <= w & c <= h ||
                b <= w & a <= h || c <= w & b <= h || c <= w & a <= h);
    }
    private static double _18_totalDistance(double fuel, double fuel_consumption, int psgrs, boolean freez) {
        fuel_consumption = fuel_consumption * (1 + 0.05 * psgrs);
        if (freez) fuel_consumption = fuel_consumption * 1.1;
        return fuel / fuel_consumption * 100;
    }
    private static double _19_mean(int[] nn) {
        double summ = 0;
        for (int i = 0; i < nn.length; i++) summ += nn[i];
        return summ / nn.length;
    }
    private static boolean _20_parityAnalysis(int n) {
        int m = 0;
        int k = n;
        while (k > 0) {
            m += k % 10;
            k = k / 10;
        }
        return (n % 2 == 0) == (m % 2 == 0);
    }
 }