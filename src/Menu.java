import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.*;

public class Menu {
    public static void mainMenu(){
        Logger logger1 = Logger.getLogger(Menu.class.getName());
        ConsoleHandler ch1 = new ConsoleHandler();
        SimpleFormatter sf1 = new SimpleFormatter();
        logger1.info("Старт программы.");
        Scanner in = new Scanner(System.in);
        System.out.println("1 - Отобразить справочник");
        System.out.println("2 - Выгрузить данные");
        System.out.println("3 - Загрузить данные");
        System.out.println(". ".repeat(15)+".");
        System.out.print("Выберите действие: ");
        int input = in.nextInt();

        FileImport fi = new FileImport();
        FileExport fe = new FileExport();
        Addressbook phones = new Addressbook();
        phones.Addressbook();

        switch (input) {
            case 1:
                phones.showAddressBook();
                logger1.info("Отобразили справочник");
                break;
            case 2:
                phones.Addressbook();
                fe.fileExport(phones.pb);
                System.out.println("Export finish");
                logger1.info("Выгрузили данные");
                break;
            case 3:
                phones.Addressbook();
                fi.fileImport(phones.pb);
                phones.showAddressBook();
                logger1.info("Загрузили данные");
                break;
        }
    }

}
