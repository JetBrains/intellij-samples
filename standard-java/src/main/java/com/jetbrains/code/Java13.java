package com.jetbrains.code;

@SuppressWarnings("unused")
public class Java13 {
    String html = "<html>\n" +
                  "    <body>\n" +
                  "        <p>Hello World.</p>\n" +
                  "    </body>\n" +
                  "</html>\n";

    String splitExample = "<html>\n" +
                          "    <body>\n" +
                          "        <p>Split here.</p>\n" +
                          "    </body>\n" +
                          "</html>\n";

    String script = "function hello() {\n" +
                    "   print('\"Hello World\"');\n" +
                    "}\n" +
                    "\n" +
                    "hello();\n";

    String query = "SELECT id, last_name FROM employee\n" +
                   "WHERE city = 'London'\n" +
                   "ORDER BY id, last_name;\n";

    //note that it doesn't mess with the whitespace when formatting the file

    String pastedMultiLineTextBlock = "";

    String command = "\"C:\\Program Files\\foo\" bar";

    public static void main(String[] args) {
    }

}
