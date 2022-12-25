package javaFinal;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class Final_Q_Five_XML_read {

    /*
Create a class read the xml file named userandpass.xml
 inside xml_file package and print the values.
*/
    public static void main(String[] args) {

        File xmlFile = new File("C:\\Users\\tezir\\IdeaProjects\\Java_Exam_Submission\\src\\javaFinal\\userandpass.xml");

        DocumentBuilderFactory docXml = DocumentBuilderFactory.newInstance();

        try{

            DocumentBuilder dB = docXml.newDocumentBuilder();
            Document doc = dB.parse(xmlFile);

            NodeList nl = doc.getElementsByTagName("idPass");

            for (int a= 0; a < nl.getLength(); a++){
                Node nN = nl.item(a);

                Element ele = (Element) nN;

                System.out.println(ele.getElementsByTagName("user").item(0).getTextContent());

                System.out.println(ele.getElementsByTagName("pass").item(0).getTextContent());

                System.out.println("---------------------");
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
