public class Assignment01Q01 {
    public static void main(String[] args) {
        for(String str: args){
            char firstCharacter = str.charAt(0);
            if(firstCharacter % 5 == 0){
                System.out.println(firstCharacter);
            }
        }
    }
}
