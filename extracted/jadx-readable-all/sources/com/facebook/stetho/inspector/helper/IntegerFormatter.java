package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import android.view.ViewDebug;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    public static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
            super();
        }

        @Override // com.facebook.stetho.inspector.helper.IntegerFormatter
        @TargetApi(21)
        public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
            if (exportedProperty == null || !exportedProperty.formatToHexString()) {
                return super.format(num, exportedProperty);
            }
            StringBuilder sbM1556G = outline.m1556G("0x");
            sbM1556G.append(Integer.toHexString(num.intValue()));
            return sbM1556G.toString();
        }
    }

    public static IntegerFormatter getInstance() {
        if (cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                if (cachedFormatter == null) {
                    cachedFormatter = new IntegerFormatterWithHex();
                }
            }
        }
        return cachedFormatter;
    }

    public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
        return String.valueOf(num);
    }

    private IntegerFormatter() {
    }
}
