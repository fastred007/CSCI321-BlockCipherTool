/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockciphertool.wrappers;

import javax.xml.bind.annotation.XmlValue;

/**
 * @author Nick
 * class wrapper class. stores row data for tables, currently only used in sbox's
 */
public class Row {

    private String rowData;
    
    @XmlValue()
    public String getRowData() {
	return this.rowData;
    }
    
    public void setRowData(String RowData) {
	this.rowData = RowData;
    }
    
    
}
