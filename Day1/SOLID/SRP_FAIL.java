public class PrinterDriver
{
    private File file;
    private Printer printer;
    private Scanner scanner
    private Fax fax;

    public PrinterDriver(File file, Printer printer){
        this.file = file;
        this.printer = printer;
    }
    
    public PrinterDriver(Scanner scanner, Printer printer){
        this.file = null;
        this.printer = printer;
        this.scanner = scanner
    }

     public PrinterDriver(Fax fax, Printer printer){
        this.file = null;
        this.printer = printer;
        this.scanner = null
        this.fax = fax
    }


    public void Print(){
        if (this.file != null){
        buffer page = file.readPage();
        while(!_file.IsEndOfFile(page)){
            printer.Print(page);
            page = file.readPage();
        }
        }
        else if(this.printer != null){
            // logic to do the operation
        }

        else if(this.scanner != null)
        {
            // logic to do the operation
        }
        else{
            // logic to do the operation
        }

    }
}

// this is violating the SRP and also it is a tightly coupled code, so there is a business risk that there might be mutliple bugs in this.
