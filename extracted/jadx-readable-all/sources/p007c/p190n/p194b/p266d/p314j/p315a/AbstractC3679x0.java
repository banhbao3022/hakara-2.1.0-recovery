package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.a.x0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3679x0<T> implements Comparable<AbstractC3679x0<T>> {

    /* JADX INFO: renamed from: f */
    public final C3355oa f21403f;

    /* JADX INFO: renamed from: g */
    public final int f21404g;

    /* JADX INFO: renamed from: h */
    public final String f21405h;

    /* JADX INFO: renamed from: i */
    public final int f21406i;

    /* JADX INFO: renamed from: j */
    public final Object f21407j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3275m4 f21408k;

    /* JADX INFO: renamed from: l */
    public Integer f21409l;

    /* JADX INFO: renamed from: m */
    public C3311n3 f21410m;

    /* JADX INFO: renamed from: n */
    public boolean f21411n;

    /* JADX INFO: renamed from: o */
    public hj2 f21412o;

    /* JADX INFO: renamed from: p */
    public C3283mc f21413p;

    /* JADX INFO: renamed from: q */
    public final ao2 f21414q;

    public AbstractC3679x0(int i, String str, InterfaceC3275m4 interfaceC3275m4) {
        Uri uri;
        String host;
        this.f21403f = C3355oa.f17570a ? new C3355oa() : null;
        this.f21407j = new Object();
        int iHashCode = 0;
        this.f21411n = false;
        this.f21412o = null;
        this.f21404g = i;
        this.f21405h = str;
        this.f21408k = interfaceC3275m4;
        this.f21414q = new ao2();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f21406i = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f21409l.intValue() - ((AbstractC3679x0) obj).f21409l.intValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m8702f(String str) {
        if (C3355oa.f17570a) {
            this.f21403f.m7975a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8703h(String str) {
        C3311n3 c3311n3 = this.f21410m;
        if (c3311n3 != null) {
            synchronized (c3311n3.f17007b) {
                c3311n3.f17007b.remove(this);
            }
            synchronized (c3311n3.f17014i) {
                Iterator<InterfaceC3384p2> it = c3311n3.f17014i.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            }
            c3311n3.m7772c(this, 5);
        }
        if (C3355oa.f17570a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC2825a(this, str, id));
            } else {
                this.f21403f.m7975a(str, id);
                this.f21403f.m7976b(toString());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8704j(int i) {
        C3311n3 c3311n3 = this.f21410m;
        if (c3311n3 != null) {
            c3311n3.m7772c(this, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m8705l() {
        String str = this.f21405h;
        if (this.f21404g == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8706m() {
        synchronized (this.f21407j) {
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public Map<String, String> mo4829q() throws ji2 {
        return Collections.emptyMap();
    }

    /* JADX INFO: renamed from: s */
    public byte[] mo4830s() throws ji2 {
        return null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f21406i));
        String strConcat = strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        m8706m();
        String str = this.f21405h;
        String strValueOf2 = String.valueOf(this.f21409l);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(strConcat).length() + 6 + strValueOf2.length());
        outline.m1572W(sb, "[ ] ", str, " ", strConcat);
        return outline.m1550A(sb, " NORMAL ", strValueOf2);
    }

    /* JADX INFO: renamed from: u */
    public final void m8707u() {
        synchronized (this.f21407j) {
            this.f21411n = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8708v() {
        boolean z;
        synchronized (this.f21407j) {
            z = this.f21411n;
        }
        return z;
    }

    /* JADX INFO: renamed from: w */
    public abstract C3092h6<T> mo4728w(lv2 lv2Var);

    /* JADX INFO: renamed from: x */
    public abstract void mo4729x(T t);

    /* JADX INFO: renamed from: y */
    public final void m8709y(C3092h6<?> c3092h6) {
        C3283mc c3283mc;
        List<AbstractC3679x0<?>> listRemove;
        synchronized (this.f21407j) {
            c3283mc = this.f21413p;
        }
        if (c3283mc != null) {
            hj2 hj2Var = c3092h6.f14768b;
            if (hj2Var != null) {
                if (!(hj2Var.f14881e < System.currentTimeMillis())) {
                    String strM8705l = m8705l();
                    synchronized (c3283mc) {
                        listRemove = c3283mc.f16713a.remove(strM8705l);
                    }
                    if (listRemove != null) {
                        if (C3282mb.f16709a) {
                            C3282mb.m7680a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), strM8705l);
                        }
                        Iterator<AbstractC3679x0<?>> it = listRemove.iterator();
                        while (it.hasNext()) {
                            c3283mc.f16716d.m8585a(it.next(), c3092h6, null);
                        }
                        return;
                    }
                    return;
                }
            }
            c3283mc.m7688a(this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8710z() {
        C3283mc c3283mc;
        synchronized (this.f21407j) {
            c3283mc = this.f21413p;
        }
        if (c3283mc != null) {
            c3283mc.m7688a(this);
        }
    }
}
