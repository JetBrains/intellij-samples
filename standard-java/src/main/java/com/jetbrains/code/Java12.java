package com.jetbrains.code;

import java.io.IOException;

@SuppressWarnings("unused")
public class Java12 {
    String html = `<html>
    <body>
		    <p>Hello World with a snjgrn misgnjfrn.</p>
    </body>
</html>
`;

    String splitExample = (`<html>
                                 <body>
                                    <p>Split here.</p>
                                 </body>
                              </html>
                            `).align();

    String script = `function hello() {
   print('"Hello World"');
}

hello();
`;

    String query = ``SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
WHERE `CITY` = ‘INDIANAPOLIS'
ORDER BY `EMP_ID`, `LAST_NAME`;
``;
    //note that it doesn't mess with the whitespace when formatting the file

    String pastedMultiLineStringLiteral = "<html>\n" +
                                          "    <body>\n" +
                                          "        <p>Text here.</p>\n" +
                                          "    </body>\n" +
                                          "</html>";
    String pastedMultiLineRawStringLiteral = `<html>
    <body>
        <p>Text here.</p>
    </body>
</html> `;


    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec(`"C:\Program Files\foo" bar`); //convert

        System.out.println("this".matches(`\w\w\w\w`));
    }

}
