package com.jetbrains.code;

@SuppressWarnings("unused")
public class Java13 {
    String html = """
                  <html>
                      <body>
                          <p>Hello World.</p>
                      </body>
                  </html>
                  """;

    String splitExample = """
                          <html>
                              <body>
                                  <p>Split here.</p>
                              </body>
                          </html>
                          """;

    String script = """
                    function hello() {
                       print('"Hello World"');
                    }

                    hello();
                    """;

    String query = """
                   SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
                   WHERE `CITY` = ‘INDIANAPOLIS'
                   ORDER BY `EMP_ID`, `LAST_NAME`;
                   """;
    //note that it doesn't mess with the whitespace when formatting the file

    String pastedMultiLineTextBlock = "";

    String command = "\"C:\\Program Files\\foo\" bar";

}
