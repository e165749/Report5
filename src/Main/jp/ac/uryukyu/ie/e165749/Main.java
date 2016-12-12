package jp.ac.uryukyu.ie.e165749;

/**
 * Created by South on 2016/12/13.
 */
public class Main {
    public static void main (String[] args) {

        String str = null;

        try{
            int len = str.length();
            System.out.println(len);
        }

        catch(java.lang.NullPointerException e){
            System.out.println("NullPointerExceptionが発生しました");
            e.printStackTrace();
        }
    }
}
