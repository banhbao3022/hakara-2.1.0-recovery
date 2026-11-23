package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.qh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3436qh {

    /* JADX INFO: renamed from: a */
    public long f18280a;

    /* JADX INFO: renamed from: b */
    public final String f18281b;

    /* JADX INFO: renamed from: c */
    public final String f18282c;

    /* JADX INFO: renamed from: d */
    public final long f18283d;

    /* JADX INFO: renamed from: e */
    public final long f18284e;

    /* JADX INFO: renamed from: f */
    public final long f18285f;

    /* JADX INFO: renamed from: g */
    public final long f18286g;

    /* JADX INFO: renamed from: h */
    public final List<tr2> f18287h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<c.n.b.d.j.a.tr2>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public C3436qh(String str, hj2 hj2Var) {
        String str2 = hj2Var.f14878b;
        long j2 = hj2Var.f14879c;
        long j3 = hj2Var.f14880d;
        long j4 = hj2Var.f14881e;
        long j5 = hj2Var.f14882f;
        ?? arrayList = hj2Var.f14884h;
        if (arrayList == 0) {
            Map<String, String> map = hj2Var.f14883g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new tr2(entry.getKey(), entry.getValue()));
            }
        }
        this(str, str2, j2, j3, j4, j5, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static C3436qh m8202a(C3326ni c3326ni) throws IOException {
        if (C3328nk.m7870h(c3326ni) != 538247942) {
            throw new IOException();
        }
        String strM7874l = C3328nk.m7874l(c3326ni);
        String strM7874l2 = C3328nk.m7874l(c3326ni);
        long jM7872j = C3328nk.m7872j(c3326ni);
        long jM7872j2 = C3328nk.m7872j(c3326ni);
        long jM7872j3 = C3328nk.m7872j(c3326ni);
        long jM7872j4 = C3328nk.m7872j(c3326ni);
        int iM7870h = C3328nk.m7870h(c3326ni);
        if (iM7870h < 0) {
            throw new IOException(outline.m1585g(31, "readHeaderList size=", iM7870h));
        }
        List listEmptyList = iM7870h == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iM7870h; i++) {
            listEmptyList.add(new tr2(C3328nk.m7874l(c3326ni).intern(), C3328nk.m7874l(c3326ni).intern()));
        }
        return new C3436qh(strM7874l, strM7874l2, jM7872j, jM7872j2, jM7872j3, jM7872j4, listEmptyList);
    }

    public C3436qh(String str, String str2, long j2, long j3, long j4, long j5, List<tr2> list) {
        this.f18281b = str;
        this.f18282c = true == "".equals(str2) ? null : str2;
        this.f18283d = j2;
        this.f18284e = j3;
        this.f18285f = j4;
        this.f18286g = j5;
        this.f18287h = list;
    }
}
