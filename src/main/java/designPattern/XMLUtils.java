package designPattern;


import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
public class XMLUtils {
    //�÷������ڴ�XML�����ļ�����ȡͼ�����ͣ�������������
	public static String getChartType() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("src/main/java/designPattern/TempleteMathodPattern/config.xml")); 
		
			//��ȡ����ͼ�����͵��ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        }   
       	catch(Exception e) {
           	e.printStackTrace();
        	return null;
        }
    }
}