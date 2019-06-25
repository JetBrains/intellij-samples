package com.jetbrains.inspections;

@SuppressWarnings({"unused", "UnnecessaryLocalVariable"})
public class Java12Inspections {


    private PortType replaceSimpleSwitch(int port) {
        PortType type;
        switch (port) {
            case 20:
                type = PortType.FTP;
                break;
            case 80:
            case 8080:
                type = PortType.HTTP;
                break;
            case 27017:
                type = PortType.DATABASE;
                break;
            default:
                type = PortType.UNKNOWN;
        }
        return type;
    }

    private String createMissingSwitchBranch(PortType portType) {
        return switch (portType) {
            case HTTP -> "User";
            default -> "N/A";
        };
    }

    public enum PortType {
        HTTP, DATABASE, UNUSED, UNKNOWN, FTP, BUSY, SAFE
    }

}
