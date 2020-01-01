package edu.cscc;

/**
 * Created by bplatt on 6/27/2017.
 */
public class PhoneNumber {
    private int areaCode;
    private int prefix;
    private int lineNumber;

    // Constructor
    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    // Accessors / Mutators
    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    // Other methods
    public String toString() {
        return "(" + areaCode + ") " + prefix + "-" + lineNumber;
    }
}
