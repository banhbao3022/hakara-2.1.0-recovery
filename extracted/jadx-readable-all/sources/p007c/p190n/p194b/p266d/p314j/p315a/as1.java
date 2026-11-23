package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class as1 extends zr1 {

    /* JADX INFO: renamed from: a */
    public final char f12262a;

    public as1(char c2) {
        this.f12262a = c2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr1
    /* JADX INFO: renamed from: a */
    public final boolean mo5844a(char c2) {
        return c2 == this.f12262a;
    }

    public final String toString() {
        int i = this.f12262a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return outline.m1552C(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
