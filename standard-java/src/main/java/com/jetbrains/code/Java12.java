package com.jetbrains.code;

import java.io.IOException;

public class Java12 {
    String html = "<html>\n" +
                  "    <body>\n" +
                  "		    <p>Hello World.</p>\n" +
                  "    </body>\n" +
                  "</html>\n";

    String script = "function hello() {\n" +
                    "   print(\'\"Hello World\"\');\n" +
                    "}\n" +
                    "\n" +
                    "hello();\n";

    String query = "SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`\n" +
                   "WHERE `CITY` = ‘INDIANAPOLIS'\n" +
                   "ORDER BY `EMP_ID`, `LAST_NAME`;\n";
    //note that it doesn't mess with the whitespace when formatting the file


    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("\"C:\\Program Files\\foo\" bar"); //convert

        System.out.println("this".matches("\\w\\w\\w\\w"));
    }

}
