/*Given two binary strings a and b, return their sum as a binary string.*/

import java.util.*;
public class addbinary {
    static Map<String, Map<Character, Character>> sumMap = new HashMap<>(); 
    static{
        Map<Character, Character> zerozero = new HashMap<>();
        zerozero.put('0', '0');
        Map<Character, Character> zeroone = new HashMap<>();
        zeroone.put('0', '1');
        Map<Character, Character> onezero = new HashMap<>();
        onezero.put('1', '0');
        Map<Character, Character> oneone = new HashMap<>();
        oneone.put('1', '1');

        sumMap.put("000", zerozero);
        sumMap.put("001", onezero);
        sumMap.put("010", onezero);
        sumMap.put("011", zeroone);
        sumMap.put("100", onezero);
        sumMap.put("101", zeroone);
        sumMap.put("110", zeroone);
        sumMap.put("111", oneone);

    }

    public  String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aLen = aChars.length;
        int bLen = bChars.length;
        int n = Math.max(aLen, bLen);
        char[] result = new char[n+1];
        char carry = '0';

        for(int i=n; i>0; i--){
            char aCurr = '0', bCurr='0';
            if(aLen > 0){
                aCurr = aChars[--aLen];
            }
            if(bLen > 0){
                bCurr = bChars[--bLen];
            }
            Map.Entry<Character, Character> entry = sumMap.get(""+                                             aCurr+bCurr+carry).entrySet().iterator().next();
            result[i] = entry.getKey();
            carry = entry.getValue();
        }
        if(carry == '1'){
            result[0] = '1';
            return new String(result);
        }else{
            return new String(Arrays.copyOfRange(result, 1, result.length));
        }
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String a=io.nextLine();
        String b=io.nextLine();
        addbinary s=new addbinary();
        System.out.println(s.addBinary(a, b));
        io.close();
    }
}
