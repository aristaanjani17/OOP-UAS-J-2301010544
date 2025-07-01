/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiket_Bioskop;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FormatHarga {
    public static String formatRupiah(double harga) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        kursIndonesia.setMinimumFractionDigits(0); // Tanpa ,00
        kursIndonesia.setMaximumFractionDigits(0);

        return kursIndonesia.format(harga);
    }
}
