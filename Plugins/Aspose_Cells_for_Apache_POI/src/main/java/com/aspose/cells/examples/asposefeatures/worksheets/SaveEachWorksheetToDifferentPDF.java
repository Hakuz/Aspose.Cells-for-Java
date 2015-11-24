package com.aspose.cells.examples.asposefeatures.worksheets;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class SaveEachWorksheetToDifferentPDF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveEachWorksheetToDifferentPDF.class);

        //Get the Excel file path
        String filePath = dataDir + "workbook.xlsx";

        //Instantiate a new workbook and open the Excel
        //File from its location
        Workbook workbook = new Workbook(filePath);

        //Get the count of the worksheets in the workbook
        int sheetCount = workbook.getWorksheets().getCount();

        //Make all sheets invisible except first worksheet
        for (int i = 1; i < workbook.getWorksheets().getCount(); i++)
        {
             workbook.getWorksheets().get(i).setVisible(false);
        }

        //Take Pdfs of each sheet
        for (int j = 0; j < workbook.getWorksheets().getCount(); j++)
        {
            Worksheet ws = workbook.getWorksheets().get(j);
            workbook.save(dataDir + ws.getName() + ".pdf");

            if (j < workbook.getWorksheets().getCount() - 1)
            {
               workbook.getWorksheets().get(j + 1).setVisible(true);
               workbook.getWorksheets().get(j).setVisible(false);
            }
        }
        System.out.println("PDF files saved.");
    }
}
