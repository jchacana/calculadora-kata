package cl.sodimac;

import cl.sodimac.exceptions.MyException;

public class Calculadora {
    public Integer add(String string) throws MyException {
        Integer result = 0;
        if("".equals(string)) return 0;
        if(!string.contains(",") && !string.contains("\n")){
            result = Integer.parseInt(string.trim());
        } else {
            String[] nums = string.replace("\n",",").split(",", -1);

            for(int i = 0; i < nums.length; i++){
                if("".equals(nums[i])) throw new MyException("Error de entrada");
                result+=Integer.parseInt(nums[i].trim());
            }
        }
        return result;

    }
}
