import java.util.*;

class intToRoman {
    public String _intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        String res = "";

        while (num >= 1000) {
            res += map.get(1000);
            num -= 1000;
        }
        while (num >= 900) {
            res += map.get(900);
            num -= 900;
        }
        while (num >= 500) {
            res += map.get(500);
            num -= 500;
        }
        while (num >= 400) {
            res += map.get(400);
            num -= 400;
        }
        while (num >= 100) {
            res += map.get(100);
            num -= 100;
        }
        while (num >= 90) {
            res += map.get(90);
            num -= 90;
        }
        while (num >= 50) {
            res += map.get(50);
            num -= 50;
        }
        while (num >= 40) {
            res += map.get(40);
            num -= 40;
        }
        while (num >= 10) {
            res += map.get(10);
            num -= 10;
        }
        while (num >= 9) {
            res += map.get(9);
            num -= 9;
        }
        while (num >= 5) {
            res += map.get(5);
            num -= 5;
        }
        while (num >= 4) {
            res += map.get(4);
            num -= 4;
        }
        while (num >= 1) {
            res += map.get(1);
            num -= 1;
        }

        return res;
    }
}
