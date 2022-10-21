
public class H021 {
    public static void main(String[] args) {
        // create a object for H021 class becasuse the containsString method
        // is non static so we can use the object to get the method
        String s=" ";
        s.indexOf("k");
        s.contains(s);
        H021 obj_Boolean_Contains = new H021();
        

        System.out.println(obj_Boolean_Contains.containsString("Hello", 'o',0));
        System.out.println(obj_Boolean_Contains.containsString("Tharun", 'h',0));
        System.out.println(obj_Boolean_Contains.containsString("Yellow", 'u',0));
        System.out.println(obj_Boolean_Contains.containsString("Tower", 'W',0));
    }

    

    private boolean containsString(String str, char c,int startIndex) {
        // base Condition...

       
        if (startIndex > str.length() - 1)
            return false;
        // check whether the character is true or flase
        if (str.charAt(startIndex) == c)
            return true;

            startIndex++;
        // recursive call
        return containsString(str, c,startIndex);
    }
}