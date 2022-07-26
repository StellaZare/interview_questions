package main;

public class Arrays {

    public static boolean all_unique(String str){
        for (int i=0; i<str.length(); i++){
            for (int j=0; j<str.length(); j++){
                if (i != j && str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
