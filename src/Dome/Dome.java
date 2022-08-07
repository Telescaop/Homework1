package Dome;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author zll
 * @Date {}
 */
public class Dome {
    public static void main(String[] args) {

        String str = "(11+9)*50/5+3";
        Calculator.Dome.operator(str);
    }
}