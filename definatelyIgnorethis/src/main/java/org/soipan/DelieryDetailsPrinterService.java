package org.soipan;

public class DelieryDetailsPrinterService {
    private Sorter sorter;

    public DelieryDetailsPrinterService(Sorter sorter) {
        this.sorter = sorter;
    }
     public void printDetails(){
        sorter.sortDetails();
     }
}
