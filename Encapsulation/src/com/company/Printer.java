package com.company;

public class Printer {

    private int tonerLevel;
    private int numPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 0;
        }
        this.numPages = 0;
        this.duplex = duplex;
    }

    public int fillToner(int fillAmount) {
        if (fillAmount > 0 && fillAmount <= 100) {
            if (this.tonerLevel + fillAmount > 100) {
                return -1;
            }
            this.tonerLevel += fillAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages/2) + (pages%2);
            this.numPages += pagesToPrint;
            System.out.println("Printing in duplex mode.");
        }
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumPages() {
        return numPages;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
