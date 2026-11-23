package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.g1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6267g1 extends CompletionHandler2 implements Job2, InterfaceC6317x0 {

    /* JADX INFO: renamed from: i */
    public C6270h1 f29743i;

    @Override // p500e1.p501a.InterfaceC6317x0
    /* JADX INFO: renamed from: a */
    public boolean mo13216a() {
        return true;
    }

    @Override // p500e1.p501a.Job2
    public void dispose() {
        Object objM13242x;
        C6270h1 c6270h1 = this.f29743i;
        if (c6270h1 == null) {
            Intrinsics2.m13096l("job");
            throw null;
        }
        do {
            objM13242x = c6270h1.m13242x();
            if (!(objM13242x instanceof AbstractC6267g1)) {
                if (!(objM13242x instanceof InterfaceC6317x0) || ((InterfaceC6317x0) objM13242x).mo13217e() == null) {
                    return;
                }
                m13149p();
                return;
            }
            if (objM13242x != this) {
                return;
            }
        } while (!C6270h1.f29745f.compareAndSet(c6270h1, objM13242x, C6273i1.f29761g));
    }

    @Override // p500e1.p501a.InterfaceC6317x0
    /* JADX INFO: renamed from: e */
    public C6282l1 mo13217e() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C6270h1 m13218r() {
        C6270h1 c6270h1 = this.f29743i;
        if (c6270h1 != null) {
            return c6270h1;
        }
        Intrinsics2.m13096l("job");
        throw null;
    }

    @Override // p500e1.p501a.p503c2.LockFreeLinkedList3
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C5729a.m12463r(this));
        sb.append("[job@");
        C6270h1 c6270h1 = this.f29743i;
        if (c6270h1 == null) {
            Intrinsics2.m13096l("job");
            throw null;
        }
        sb.append(C5729a.m12463r(c6270h1));
        sb.append(']');
        return sb.toString();
    }
}
