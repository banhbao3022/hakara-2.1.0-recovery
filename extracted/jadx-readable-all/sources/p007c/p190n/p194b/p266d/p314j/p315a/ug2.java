package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ug2 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vg2 f20311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug2(vg2 vg2Var, Looper looper) {
        super(looper);
        this.f20311a = vg2Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        vg2 vg2Var = this.f20311a;
        Objects.requireNonNull(vg2Var);
        switch (message.what) {
            case 0:
                vg2Var.f20777m--;
                return;
            case 1:
                vg2Var.f20775k = message.arg1;
                Iterator<qg2> it = vg2Var.f20770f.iterator();
                while (it.hasNext()) {
                    it.next().mo6665g(vg2Var.f20774j, vg2Var.f20775k);
                }
                return;
            case 2:
                vg2Var.f20778n = message.arg1 != 0;
                Iterator<qg2> it2 = vg2Var.f20770f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo6675t0(vg2Var.f20778n);
                }
                return;
            case 3:
                if (vg2Var.f20777m == 0) {
                    dn2 dn2Var = (dn2) message.obj;
                    vg2Var.f20773i = true;
                    vg2Var.f20781q = dn2Var.f13326a;
                    vg2Var.f20782r = dn2Var.f13327b;
                    vg2Var.f20766b.mo6067b(dn2Var.f13328c);
                    Iterator<qg2> it3 = vg2Var.f20770f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo6662c(vg2Var.f20781q, vg2Var.f20782r);
                    }
                    return;
                }
                return;
            case 4:
                int i = vg2Var.f20776l - 1;
                vg2Var.f20776l = i;
                if (i == 0) {
                    vg2Var.f20784t = (xg2) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<qg2> it4 = vg2Var.f20770f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo6663d();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (vg2Var.f20776l == 0) {
                    vg2Var.f20784t = (xg2) message.obj;
                    Iterator<qg2> it5 = vg2Var.f20770f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo6663d();
                    }
                    return;
                }
                return;
            case 6:
                zg2 zg2Var = (zg2) message.obj;
                vg2Var.f20776l -= zg2Var.f22276d;
                if (vg2Var.f20777m == 0) {
                    vg2Var.f20779o = zg2Var.f22273a;
                    vg2Var.f20780p = zg2Var.f22274b;
                    vg2Var.f20784t = zg2Var.f22275c;
                    Iterator<qg2> it6 = vg2Var.f20770f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo6664f(vg2Var.f20779o, vg2Var.f20780p);
                    }
                    return;
                }
                return;
            case 7:
                gh2 gh2Var = (gh2) message.obj;
                if (vg2Var.f20783s.equals(gh2Var)) {
                    return;
                }
                vg2Var.f20783s = gh2Var;
                Iterator<qg2> it7 = vg2Var.f20770f.iterator();
                while (it7.hasNext()) {
                    it7.next().mo6661b(gh2Var);
                }
                return;
            case 8:
                pg2 pg2Var = (pg2) message.obj;
                Iterator<qg2> it8 = vg2Var.f20770f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo6660a(pg2Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
