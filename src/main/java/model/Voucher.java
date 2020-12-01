package model;
/**
 * ENSF 619 Group Project
 * Voucher class represents the voucher object created upon ticket cancellation.
 * Voucher's are tracked by voucherId which is a randomly generated 4 digit integer and 
 * is assigned an ammoiunt based on the tickets being cancelled.
 * @author Ziad Chemali
 * @author Evan Boerchers
 * @author Myles Borthwick
 * @author Chetana Bijoor
 * @since Novemeber 2020
 */

import java.util.Random;

public class Voucher {

    private int voucherId;
    private double voucherAmmount;

    public Voucher(double ammount) {
        setVoucherAmmount(ammount);
        setVoucherId(generateRandom(4));
    }
    
    public Voucher(int id, double ammount) {
        setVoucherAmmount(ammount);
        this.voucherId = id;
    }

    private static int generateRandom(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length); // bound is exclusive

        Random random = new Random();

        return (random.nextInt(max - min) + min);
    }

    public int getVoucherId() {
        return this.voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public double getVoucherAmmount() {
        return this.voucherAmmount;
    }

    public void setVoucherAmmount(double voucherAmmount) {
        this.voucherAmmount = voucherAmmount;
    }


    @Override
    public String toString() {
        return "{" +
            " voucherId='" + getVoucherId() + "'" +
            ", voucherAmmount='" + getVoucherAmmount() + "'" +
            "}";
    }

   

    
}

