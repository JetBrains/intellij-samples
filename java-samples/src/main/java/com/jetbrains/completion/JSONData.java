package com.jetbrains.completion;

@SuppressWarnings("unused")
public class JSONData {
    // #JDK15 Text blocks
    String json = """
            {
                  "openStreetMapId": 2852153005,
                  "location": {
                    "coordinates": [
                      "-73.616748",
                      "45.4699795"
                    ],
                    "type": "Point"
                  },
                  "amenity": "cafe",
                  "cuisine": "coffee_shop",
                  "internet_access": "yes",
                  "name": "Chimera",
                  "smoking": "no"
                }
                """;

    public void evaluateJSONPath() {
        String findAllStarbucks = "$.json[? (@.name == 'Starbucks')]";
        String findShowCoordinates = "$.location.coordinates";
        String findAllNames = "$..name";
    }
}
