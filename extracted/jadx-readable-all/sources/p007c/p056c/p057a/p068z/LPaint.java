package p007c.p056c.p057a.p068z;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* JADX INFO: renamed from: c.c.a.z.a, reason: use source file name */
/* JADX INFO: compiled from: LPaint.java */
/* JADX INFO: loaded from: classes.dex */
public class LPaint extends Paint {
    public LPaint() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public LPaint(int i) {
        super(i);
    }

    public LPaint(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public LPaint(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
