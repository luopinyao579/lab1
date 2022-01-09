package app;


import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.Scanner;

public class Main {
    private  static  XMLHelper helper = new XMLHelper();
    Obfuscator obfuscator = new Obfuscator();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input file path: ");
        String input = in.nextLine();
        System.out.println("Enter output file path: ");
        String output = in.nextLine();
        System.out.println("Enter mode (obfuscate or deobfuscate): ");
        String mode = in.nextLine();
        try {
            helper.XMLProccesor(new File(input), new File(output), mode.equals("obfuscate"));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
