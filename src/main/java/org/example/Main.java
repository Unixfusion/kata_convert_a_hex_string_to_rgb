package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "#Fa3456";
        int[] a = hexStringToRGB(s);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] hexStringToRGB(String hex) {
        String s = hex.substring(1);
        byte[] ans = new byte[s.length() / 2];

        for (int i = 0; i < ans.length; i++) {
            int index = i * 2;
                int val = Integer.parseInt(s.substring(index, index + 2), 16);
            ans[i] = (byte)val;
            }
        int[] result = new int[ans.length];
        for (int k = 0; k < result.length; k++) {
            result[k] = Byte.toUnsignedInt(ans[k]);
        }
        return result;
    }
}