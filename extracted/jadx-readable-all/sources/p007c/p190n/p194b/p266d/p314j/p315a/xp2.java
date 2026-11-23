package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 {

    /* JADX INFO: renamed from: a */
    public final int f21636a;

    /* JADX INFO: renamed from: b */
    public final int f21637b;

    /* JADX INFO: renamed from: c */
    public final int f21638c;

    /* JADX INFO: renamed from: d */
    public final boolean f21639d;

    /* JADX INFO: renamed from: e */
    public final nq2 f21640e;

    /* JADX INFO: renamed from: f */
    public final tq2 f21641f;

    /* JADX INFO: renamed from: n */
    public int f21649n;

    /* JADX INFO: renamed from: g */
    public final Object f21642g = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayList<String> f21643h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public final ArrayList<String> f21644i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public final ArrayList<jq2> f21645j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f21646k = 0;

    /* JADX INFO: renamed from: l */
    public int f21647l = 0;

    /* JADX INFO: renamed from: m */
    public int f21648m = 0;

    /* JADX INFO: renamed from: o */
    public String f21650o = "";

    /* JADX INFO: renamed from: p */
    public String f21651p = "";

    /* JADX INFO: renamed from: q */
    public String f21652q = "";

    public xp2(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f21636a = i;
        this.f21637b = i2;
        this.f21638c = i3;
        this.f21639d = z;
        this.f21640e = new nq2(i4);
        this.f21641f = new tq2(i5, i6, i7);
    }

    /* JADX INFO: renamed from: d */
    public static final String m8744d(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append(arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    /* JADX INFO: renamed from: a */
    public final void m8745a(String str, boolean z, float f, float f2, float f3, float f4) {
        m8747c(str, z, f, f2, f3, f4);
        synchronized (this.f21642g) {
            if (this.f21648m < 0) {
                C2622l.m5318U2("ActivityContent: negative number of WebViews.");
            }
            m8746b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8746b() {
        synchronized (this.f21642g) {
            int i = this.f21639d ? this.f21637b : (this.f21646k * this.f21636a) + (this.f21647l * this.f21637b);
            if (i > this.f21649n) {
                this.f21649n = i;
                C2330u c2330u = C2330u.f10884a;
                if (!((C2311z0) c2330u.f10893h.m6649f()).m4835e()) {
                    this.f21650o = this.f21640e.m7930a(this.f21643h);
                    this.f21651p = this.f21640e.m7930a(this.f21644i);
                }
                if (!((C2311z0) c2330u.f10893h.m6649f()).m4837g()) {
                    this.f21652q = this.f21641f.m8447a(this.f21644i, this.f21645j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8747c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.f21638c) {
            return;
        }
        synchronized (this.f21642g) {
            this.f21643h.add(str);
            this.f21646k += str.length();
            if (z) {
                this.f21644i.add(str);
                this.f21645j.add(new jq2(f, f2, f3, f4, this.f21644i.size() - 1));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xp2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((xp2) obj).f21650o;
        return str != null && str.equals(this.f21650o);
    }

    public final int hashCode() {
        return this.f21650o.hashCode();
    }

    public final String toString() {
        int i = this.f21647l;
        int i2 = this.f21649n;
        int i3 = this.f21646k;
        String strM8744d = m8744d(this.f21643h, 100);
        String strM8744d2 = m8744d(this.f21644i, 100);
        String str = this.f21650o;
        String str2 = this.f21651p;
        String str3 = this.f21652q;
        int length = String.valueOf(strM8744d).length();
        int length2 = String.valueOf(strM8744d2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(strM8744d);
        outline.m1572W(sb, "\n viewableText", strM8744d2, "\n signture: ", str);
        return outline.m1553D(sb, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
