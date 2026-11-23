package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qi1 {

    /* JADX INFO: renamed from: a */
    public final rh1 f18306a;

    /* JADX INFO: renamed from: b */
    public final uh1 f18307b;

    /* JADX INFO: renamed from: c */
    public final pw0 f18308c;

    /* JADX INFO: renamed from: d */
    public final bn1 f18309d;

    public qi1(pw0 pw0Var, bn1 bn1Var, rh1 rh1Var, uh1 uh1Var) {
        this.f18306a = rh1Var;
        this.f18307b = uh1Var;
        this.f18308c = pw0Var;
        this.f18309d = bn1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8205a(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m8207c(it.next(), 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8206b(List<String> list, int i) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m8207c(it.next(), i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8207c(String str, int i) {
        if (!this.f18306a.f18810d0) {
            bn1 bn1Var = this.f18309d;
            bn1Var.f12748a.execute(new an1(bn1Var, str));
        } else {
            rw0 rw0Var = new rw0(C2330u.f10884a.f10896k.mo5623c(), this.f18307b.f20318b, str, i);
            pw0 pw0Var = this.f18308c;
            pw0Var.m8169a(new nw0(pw0Var, rw0Var));
        }
    }
}
