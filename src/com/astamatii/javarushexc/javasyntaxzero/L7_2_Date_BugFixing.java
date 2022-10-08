package com.astamatii.javarushexc.javasyntaxzero;

//Исправь ошибку, чтобы программа вывела "2010-01-06".
//Инициализацию переменной date не меняй.

import java.text.SimpleDateFormat;
import java.util.Date;

public class L7_2_Date_BugFixing {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); //Error in ("yyyy-mm-dd")
        System.out.println(formatter.format(date));
    }

	
}
