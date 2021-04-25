package customer;

import java.util.Scanner;

/**
 * @description：将不同的功能封装为方法，就是可以直接通过调用方法使用他的功能，二无需考虑具体的功能实现细节
 * @auther lurongrong
 * @create 2021-04-20 12:39
 */
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 用于菜单的选择，该方法读取键盘，如果用户键入‘1’——‘5’中的任意字符，则方法返回。返回值为用户键入字符。
     * @return 用户键入字符
     */
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5'){
                System.out.print("选择错误，请重新输入：");

            }else break;
        }
        return c;
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值。
     * @return
     */
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将defaultValue作为返回值
     * @param defaultValue
     * @return
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length() == 0) ? defaultValue :str.charAt(0);
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。
     * @return
     */
    public static int readInt(){
        int n;
        for (;;){
            String str = readKeyBoard(2,false);
            try{
                n = Integer.parseInt(str);//将字符型转换为整型
                break;
            }catch (NumberFormatException e){

                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以defaultValue作为返回值。
     * @param defaultValue
     * @return
     */
    public static int readInt(int defaultValue){
        int n;
        for (;;){
            String str = readKeyBoard(2,true);
            try {
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.print("数字输入有误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     * @return
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值。
     * 如果用户不输入字符而直接回车，方法将以fefaultValue作为返回值。
     * @param limit
     * @param defaultValue
     * @return
     */
    public static String readString(int limit,String defaultValue){
        String str  = readKeyBoard(limit,true);
        return str.equals("") ? defaultValue : str;
    }

    /**
     * 用于确认选择的输入。该方法从键盘读取‘Y’或‘N’，并将其作为方法的返回值。
     * @return
     */
    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }
    public static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length() == 0){
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit){
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
