package com.woody.stockprogram;

import java.util.*;
import java.text.SimpleDateFormat;

public class Formulas
{

  ReadFiles r = new ReadFiles();
  float[][] dataArray = new float[r.findRowNumber()][6];
  Date[] dateArray = new Date[r.findRowNumber()];

  public void createDateArray(String[][] n)
  {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    for (int x = 0; x < n.length; x++)
    {
      for (int y = 0; y < n[x].length; y++)
      {
        if (y == 0)
        {
          try
          {
            Date newdate = (Date)df.parse(n[x][0]);
            dateArray[x] = newdate;
          }
          catch (Exception e)
          {
            System.out.println(e);
          }
        }
      }
    }
  }

  // create float array
  public void createDataArray(String[][] n)
  {
    for (int x = 0; x < n.length; x++)
    {
      for (int y = 0; y < n[x].length; y++)
      {
        switch (y)
        {
          case 0:
            dataArray[x][y] = 0;
            break;
          case 1:
            dataArray[x][y] = new Float(n[x][y]);
            break;
          case 2:
            dataArray[x][y] = new Float(n[x][y]);
            break;
          case 3:
            dataArray[x][y] = new Float(n[x][y]);
            break;
          case 4:
            dataArray[x][y] = new Float(n[x][y]);
            break;
          case 5:
            dataArray[x][y] = new Float(n[x][y]);
            break;
          case 6:
            dataArray[x][y] = new Float(n[x][y]);
            break;
        }
      }
    }
  }


  // print data array
  public void printArray()
  {
    for(int x = 0; x < dataArray.length; x++)
    {
      for (int y = 0; y < dataArray[x].length; y++)
      {
      System.out.printf("%s ", dataArray[x][y]);
      }
      System.out.println();
    }
  }
}
