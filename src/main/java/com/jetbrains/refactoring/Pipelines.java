package com.jetbrains.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SuppressWarnings("Duplicates")
public class Pipelines {
    public static List<CityAndPhone> acquireData(String input) {
        String[] lines = input.split("\n");
        return Arrays.stream(lines)
                     .skip(1)
                     .filter(line -> !Objects.equals("", line.trim()))
                     .map(line -> line.split(","))
                     .filter(fields -> Objects.equals("China", fields[1].trim()))
                     .map(fields -> new CityAndPhone(fields[0].trim(), fields[2].trim()))
                     .collect(Collectors.toList());
    }

    public static class CityAndPhone {

        private String city;
        private String phone;

        public CityAndPhone(String city, String phone) {
            this.city = city;
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CityAndPhone that = (CityAndPhone) o;

            if (city != null ? !city.equals(that.city) : that.city != null) {
                return false;
            }
            return phone != null ? phone.equals(that.phone) : that.phone == null;
        }

        @Override
        public int hashCode() {
            int result = city != null ? city.hashCode() : 0;
            result = 31 * result + (phone != null ? phone.hashCode() : 0);
            return result;
        }
    }
}
