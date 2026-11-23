package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4589m {

    /* JADX INFO: renamed from: a */
    public final String f24134a;

    /* JADX INFO: renamed from: b */
    public final String f24135b;

    /* JADX INFO: renamed from: c */
    public final String f24136c;

    /* JADX INFO: renamed from: d */
    public final long f24137d;

    /* JADX INFO: renamed from: e */
    public final long f24138e;

    /* JADX INFO: renamed from: f */
    public final C4613o f24139f;

    public C4589m(C4707w4 c4707w4, String str, String str2, String str3, long j2, long j3, C4613o c4613o) {
        C2622l.m5359e(str2);
        C2622l.m5359e(str3);
        Objects.requireNonNull(c4613o, "null reference");
        this.f24134a = str2;
        this.f24135b = str3;
        this.f24136c = TextUtils.isEmpty(str) ? null : str;
        this.f24137d = j2;
        this.f24138e = j3;
        if (j3 != 0 && j3 > j2) {
            c4707w4.mo10684l().f24421i.m10813c("Event created with reverse previous/current timestamps. appId, name", C4662s3.m10738s(str2), C4662s3.m10738s(str3));
        }
        this.f24139f = c4613o;
    }

    /* JADX INFO: renamed from: a */
    public final C4589m m10647a(C4707w4 c4707w4, long j2) {
        return new C4589m(c4707w4, this.f24136c, this.f24134a, this.f24135b, this.f24137d, j2, this.f24139f);
    }

    public final String toString() {
        String str = this.f24134a;
        String str2 = this.f24135b;
        String strValueOf = String.valueOf(this.f24139f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(str2).length() + String.valueOf(str).length() + 33);
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }

    public C4589m(C4707w4 c4707w4, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        C4613o c4613o;
        C2622l.m5359e(str2);
        C2622l.m5359e(str3);
        this.f24134a = str2;
        this.f24135b = str3;
        this.f24136c = TextUtils.isEmpty(str) ? null : str;
        this.f24137d = j2;
        this.f24138e = j3;
        if (j3 != 0 && j3 > j2) {
            c4707w4.mo10684l().f24421i.m10812b("Event created with reverse previous/current timestamps. appId", C4662s3.m10738s(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c4707w4.mo10684l().f24418f.m10811a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM10872D = c4707w4.m10837t().m10872D(next, bundle2.get(next));
                    if (objM10872D == null) {
                        c4707w4.mo10684l().f24421i.m10812b("Param value can't be null", c4707w4.m10838u().m10720x(next));
                        it.remove();
                    } else {
                        c4707w4.m10837t().m10875I(bundle2, next, objM10872D);
                    }
                }
            }
            c4613o = new C4613o(bundle2);
        } else {
            c4613o = new C4613o(new Bundle());
        }
        this.f24139f = c4613o;
    }
}
