package java_programming.method;

import java.util.Arrays;

public class ReturnDemo4 {
	 
    public static String[] getMembers() {
        String[] members = { "������", "������", "���̶�" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        	System.out.println(Arrays.deepToString(members));//�迭�� ��� �� ���
        }
    }
