package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.k.b.w3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4706w3 {

    /* JADX INFO: renamed from: a */
    public String f24515a;

    /* JADX INFO: renamed from: b */
    public String f24516b;

    /* JADX INFO: renamed from: c */
    public long f24517c;

    /* JADX INFO: renamed from: d */
    public Bundle f24518d;

    public C4706w3(String str, String str2, Bundle bundle, long j2) {
        this.f24515a = str;
        this.f24516b = str2;
        this.f24518d = bundle;
        this.f24517c = j2;
    }

    /* JADX INFO: renamed from: b */
    public static C4706w3 m10819b(C4625p c4625p) {
        return new C4706w3(c4625p.f24249f, c4625p.f24251h, c4625p.f24250g.m10702K(), c4625p.f24252i);
    }

    /* JADX INFO: renamed from: a */
    public final C4625p m10820a() {
        return new C4625p(this.f24515a, new C4613o(new Bundle(this.f24518d)), this.f24516b, this.f24517c);
    }

    public final String toString() {
        String str = this.f24516b;
        String str2 = this.f24515a;
        String strValueOf = String.valueOf(this.f24518d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + outline.m1558I(str2, outline.m1558I(str, 21)));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return outline.m1550A(sb, ",params=", strValueOf);
    }
}
