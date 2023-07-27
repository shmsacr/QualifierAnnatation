package com.example.QualifierAnnatation;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFİleReader implements Reader{
    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
