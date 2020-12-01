package model;

/**
 * ENSF 619 Group Project
 * VoucherList stores a list of all vouchers saved in our system. Remove and
 * add functionality is implemented here to handle creation and deletion of voucher
 * objects
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.util.ArrayList;

public class VoucherList {
	private ArrayList<Voucher> vouchers;

	public VoucherList(ArrayList<Voucher> v){
		this.vouchers = v;
	}
	
	public void addVoucher(Voucher v) {
		vouchers.add(v);
	}
	
	public void removeVoucher(Voucher v) {
		for(int i = 0; i < vouchers.size(); i++) {
			if(vouchers.get(i).equals(v)) {
				vouchers.remove(i);
				return;
			}
		}
	}
	
	public Voucher getVoucher(int id) {
		for (Voucher v : vouchers) {
			if (v.getVoucherId() == id) {
				return v;
			}
		}
		return null;
	}

}
