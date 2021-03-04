package com.jetbrains.code.jdk15;

/**
 * Text Blocks. Followed on from Raw String Literals which targeted #JDK12 but was never previewed.
 * #PreviewFeature First Preview #JDK13
 * #PreviewFeature Second Preview #JDK14
 * #StandardFeature #JDK15
 */
@SuppressWarnings("unused")
public class TextBlocks {
    String html = "<html>\n" +
                  "    <body>\n" +
                  "        <p>Hello World.</p>\n" +
                  "    </body>\n" +
                  "</html>\n";

    String query = "SELECT id, last_name FROM employee\n" +
                   "WHERE city = 'London'\n" +
                   "ORDER BY id, last_name;\n";

    String script = "function hello() {\n" +
                    "   print(\"Hello World\");\n" +
                    "}\n" +
                    "\n" +
                    "hello();\n";

    String json = "{\n" +
                  "      \"openStreetMapId\": 2852153005,\n" +
                  "      \"location\": {\n" +
                  "        \"coordinates\": [\n" +
                  "          \"-73.616748\",\n" +
                  "          \"45.4699795\"\n" +
                  "        ],\n" +
                  "        \"type\": \"Point\"\n" +
                  "      },\n" +
                  "      \"amenity\": \"cafe\",\n" +
                  "      \"cuisine\": \"coffee_shop\",\n" +
                  "      \"internet_access\": \"yes\",\n" +
                  "      \"name\": \"Chimera\",\n" +
                  "      \"smoking\": \"no\"\n" +
                  "    }";

    String mixedTabsAndSpacesWhitespace = """
            <html>
            	<body>
               		<p>Hello World.</p>
                </body>
            </html>
            """;

    //note that it doesn't mess with the whitespace when formatting the file

    String pastedMultiLineTextBlock = "";

}
