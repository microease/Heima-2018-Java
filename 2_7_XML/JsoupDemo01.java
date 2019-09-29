import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //2 获取Document对象，根据xml文档获取
        //2.1 获取student.xml的path
        String path = JsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        //2.2 解析xml文档，加载文档到内存，获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3 获取元素对象 Element
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        Element element = elements.get(0);
        System.out.println(element.text() );
    }
}
