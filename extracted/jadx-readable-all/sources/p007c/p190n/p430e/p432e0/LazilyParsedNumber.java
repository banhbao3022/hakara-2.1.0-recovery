package p007c.p190n.p430e.p432e0;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: c.n.e.e0.r, reason: use source file name */
/* JADX INFO: compiled from: LazilyParsedNumber.java */
/* JADX INFO: loaded from: classes.dex */
public final class LazilyParsedNumber extends Number {

    /* JADX INFO: renamed from: f */
    public final String f27485f;

    public LazilyParsedNumber(String str) {
        this.f27485f = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f27485f);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f27485f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = this.f27485f;
        String str2 = ((LazilyParsedNumber) obj).f27485f;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f27485f);
    }

    public int hashCode() {
        return this.f27485f.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f27485f);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f27485f);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f27485f).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f27485f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f27485f).longValue();
        }
    }

    public String toString() {
        return this.f27485f;
    }
}
