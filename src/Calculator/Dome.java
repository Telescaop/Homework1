package Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
//(1+2*(3-5))*(2-1)
public class Dome {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.println("请输入正确的表达式，式子不能包含括号:");
        String str = cin.next();
        operator(str);
    }
    public static void operator(String str) {
        ScriptEngine script = new ScriptEngineManager().getEngineByName("js");
        Double result = null;
        try {
            result = Double.valueOf(script.eval(str).toString());
            if (result == null) {
                result = (double) 0;
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result.intValue());
    }
}
