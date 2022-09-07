package Easy;

import java.util.Arrays;

/**
 * @ClassNmae reorderSpaces_1592
 * @Author:yys4608
 * @Date: 2022/9/7 11:14
 * @Description:每日一题1592
 */
public class reorderSpaces_1592 {
    public String reorderSpaces(String text) {
        int len=text.length();
        String [] WordString =text.trim().split("\\s+");
        StringBuffer stringBuffer=new StringBuffer();
        int SpaceCount=0;
        int WordCount=WordString.length;



        if(WordCount==1){
            stringBuffer.append(WordString[0]);
            for (int i = 0; i < len-WordString[0].length(); i++) {
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
        for (int i = 0; i < len; i++) {
            if (text.charAt(i)  ==' ') {
                SpaceCount+=1;
            }
        }
        int AvgSpace=SpaceCount/(WordCount-1);
        int RestSpace=SpaceCount-AvgSpace*(WordCount-1);

        for (int i = 0; i < WordCount; i++) {
            if(i>0){
                for (int j = 0; j < AvgSpace; j++) {
                    stringBuffer.append(' ');
                }
            }

            stringBuffer.append(WordString[i]);
        }
        for (int i = 0; i < RestSpace; i++) {
            stringBuffer.append(' ');

        }
        return stringBuffer.toString();
    }
}
