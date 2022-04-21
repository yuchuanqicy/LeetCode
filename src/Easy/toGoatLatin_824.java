package Easy;

/**
 * @Author: yuchuanqi
 * @Date: 2022/04/21/22:39
 * @Description:
 */
public class toGoatLatin_824 {
    public String toGoatLatin(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = sentence.split(" ");
        String   vowel="aeiouAEIOU";
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(vowel.indexOf(strings[i].charAt(0))==-1?strings[i].substring(1)+strings[i].charAt(0)+"ma":strings[i]+"ma");
            for (int j = 0; j < i+1; j++) {
                stringBuilder.append("a");
            }
            stringBuilder.append(" ");

        }
        return stringBuilder.toString().trim();
    }
}
