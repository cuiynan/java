/**
 * @author : cuiyingnan
 * @date : 2019/7/26 17:06
 * @desc :
 */
public class SpearatorUtils {

    private final static String SEPARATOR = "-";

    /**
     * 获得症状第一个CODE
     * -1234-123  返回1234
     * 1234-1233   返回1234
     */
    public static String getFirstSymptomCode(String str) {
        String symptom = "";
        if (str.contains(SEPARATOR)) {
            String[] stringArr = str.split(SEPARATOR);
            symptom = stringArr[0];
            if ("".equals(symptom)) {
                symptom = stringArr[1];
            }
        }
        return symptom;
    }

}
