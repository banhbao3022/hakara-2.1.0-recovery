package com.cgfay.media;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class CainMetadata {
    private HashMap<String, String> mParcelMetadata;

    public CainMetadata(HashMap<String, String> map) {
        this.mParcelMetadata = map;
    }

    public boolean containsKey(String str) {
        return this.mParcelMetadata.containsKey(str);
    }

    public byte[] getByteArray(String str) {
        if (containsKey(str)) {
            return this.mParcelMetadata.get(str).getBytes();
        }
        return null;
    }

    public Date getDate(String str) {
        if (!containsKey(str)) {
            return null;
        }
        long jLongValue = Long.valueOf(this.mParcelMetadata.get(str)).longValue();
        String str2 = this.mParcelMetadata.get(str);
        if (str2.length() == 0) {
            return new Date(jLongValue);
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(str2));
        calendar.setTimeInMillis(jLongValue);
        return calendar.getTime();
    }

    public double getDouble(String str) {
        if (containsKey(str)) {
            return Double.valueOf(this.mParcelMetadata.get(str)).doubleValue();
        }
        return 0.0d;
    }

    public int getInt(String str) {
        if (containsKey(str)) {
            return Integer.valueOf(this.mParcelMetadata.get(str)).intValue();
        }
        return 0;
    }

    public long getLong(String str) {
        if (containsKey(str)) {
            return Long.valueOf(this.mParcelMetadata.get(str)).longValue();
        }
        return 0L;
    }

    public String getString(String str) {
        if (containsKey(str)) {
            return String.valueOf(this.mParcelMetadata.get(str));
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("MediaMetadata{ \nmParcelMetadata = ");
        sbM1556G.append(this.mParcelMetadata.toString());
        sbM1556G.append("\n}");
        return sbM1556G.toString();
    }
}
