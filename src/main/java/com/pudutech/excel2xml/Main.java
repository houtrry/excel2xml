package com.pudutech.excel2xml;

public class Main {

    public static void main(String[] args) {
        String filePath = "F:\\xmls\\翻译文件_19语种.xlsx";
//        Utils.excelToXml(filePath, "F:\\xmls\\strings0.xml", "F:\\xmls\\strings1.xml", "F:\\xmls\\strings2.xml",
//                "F:\\xmls\\strings3.xml", "F:\\xmls\\strings4.xml", "F:\\xmls\\strings5.xml",
//                "F:\\xmls\\strings6.xml", "F:\\xmls\\strings7.xml", "F:\\xmls\\strings8.xml",
//                "F:\\xmls\\strings9.xml", "F:\\xmls\\strings10.xml", "F:\\xmls\\strings11.xml",
//                "F:\\xmls\\strings12.xml", "F:\\xmls\\strings13.xml", "F:\\xmls\\strings14.xml",
//                "F:\\xmls\\strings15.xml", "F:\\xmls\\strings16.xml", "F:\\xmls\\strings17.xml",
//                "F:\\xmls\\strings18.xml", "F:\\xmls\\strings19.xml", "F:\\xmls\\strings20.xml");

        Utils.xml2Excel("F:\\xmls\\test1.xlsx", "F:\\xmls\\strings0.xml", "F:\\xmls\\strings1.xml", "F:\\xmls\\strings2.xml",
                "F:\\xmls\\strings3.xml", "F:\\xmls\\strings4.xml", "F:\\xmls\\strings5.xml",
                "F:\\xmls\\strings6.xml", "F:\\xmls\\strings7.xml", "F:\\xmls\\strings8.xml",
                "F:\\xmls\\strings9.xml", "F:\\xmls\\strings10.xml", "F:\\xmls\\strings11.xml",
                "F:\\xmls\\strings12.xml", "F:\\xmls\\strings13.xml", "F:\\xmls\\strings14.xml",
                "F:\\xmls\\strings15.xml", "F:\\xmls\\strings16.xml", "F:\\xmls\\strings17.xml",
                "F:\\xmls\\strings18.xml", "F:\\xmls\\strings19.xml", "F:\\xmls\\strings20.xml");

//        Utils.xml2Excel("F:\\xmls\\test2.xlsx",
//                "F:\\xmls\\strings0.xml"
//                );
    }

}
