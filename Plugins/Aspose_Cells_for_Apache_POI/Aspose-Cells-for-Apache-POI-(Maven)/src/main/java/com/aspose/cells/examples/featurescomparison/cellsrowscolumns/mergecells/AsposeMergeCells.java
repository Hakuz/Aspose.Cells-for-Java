package com.aspose.cells.examples.featurescomparison.cellsrowscolumns.mergecells;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class AsposeMergeCells
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeMergeCells.class);

        //Create a Workbook.
        Workbook wbk = new Workbook();

        //Create a Worksheet and get the first sheet.
        Worksheet worksheet = wbk.getWorksheets().get(0);

        //Create a Cells object to fetch all the cells.
        Cells cells = worksheet.getCells();

        //Merge some Cells (C6:E7) into a single C6 Cell.
        cells.merge(5,2,2,3);

        //Input data into C6 Cell.
        worksheet.getCells().get(5,2).setValue("This is a test of merging");

        //Save the Workbook.
        wbk.save(dataDir + "AsposeMergeCells_Out.xls");

        // Print message
        System.out.println("Process completed successfully");
    }
}
