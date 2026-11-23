package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 {

    /* JADX INFO: renamed from: b */
    public int f21970b;

    /* JADX INFO: renamed from: a */
    public final Object f21969a = new Object();

    /* JADX INFO: renamed from: c */
    public final List<xp2> f21971c = new LinkedList();

    /* JADX INFO: renamed from: a */
    public final boolean m8823a(xp2 xp2Var) {
        synchronized (this.f21969a) {
            Iterator<xp2> it = this.f21971c.iterator();
            while (it.hasNext()) {
                xp2 next = it.next();
                C2330u c2330u = C2330u.f10884a;
                if (((C2311z0) c2330u.f10893h.m6649f()).m4835e()) {
                    if (!((C2311z0) c2330u.f10893h.m6649f()).m4837g() && xp2Var != next && next.f21652q.equals(xp2Var.f21652q)) {
                        it.remove();
                        return true;
                    }
                } else if (xp2Var != next && next.f21650o.equals(xp2Var.f21650o)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8824b(xp2 xp2Var) {
        synchronized (this.f21969a) {
            if (this.f21971c.size() >= 10) {
                int size = this.f21971c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C2622l.m5318U2(sb.toString());
                this.f21971c.remove(0);
            }
            int i = this.f21970b;
            this.f21970b = i + 1;
            xp2Var.f21647l = i;
            synchronized (xp2Var.f21642g) {
                int i2 = xp2Var.f21639d ? xp2Var.f21637b : (xp2Var.f21646k * xp2Var.f21636a) + (xp2Var.f21647l * xp2Var.f21637b);
                if (i2 > xp2Var.f21649n) {
                    xp2Var.f21649n = i2;
                }
            }
            this.f21971c.add(xp2Var);
        }
    }
}
