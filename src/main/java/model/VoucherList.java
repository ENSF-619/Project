package model;

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
