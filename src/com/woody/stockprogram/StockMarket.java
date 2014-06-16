package com.woody.stockprogram;

public class StockMarket
{

  public static void main(String[] args)
  {

    ReadFiles r = new ReadFiles();

    System.out.println(r.checkIsFile());
    System.out.println(r.findRowNumber());

    r.convertToArray();
    Formulas f = new Formulas();

    f.createDataArray(r.getArray());
    f.printArray();

  }

}
