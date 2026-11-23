package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n62 extends k62 {

    /* JADX INFO: renamed from: a */
    public final m62 f17032a = new m62();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k62
    /* JADX INFO: renamed from: a */
    public final void mo7442a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.f17032a.m7659a(th, true).add(th2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k62
    /* JADX INFO: renamed from: b */
    public final void mo7443b(Throwable th) {
        th.printStackTrace();
        List<Throwable> listM7659a = this.f17032a.m7659a(th, false);
        if (listM7659a == null) {
            return;
        }
        synchronized (listM7659a) {
            for (Throwable th2 : listM7659a) {
                System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.k62
    /* JADX INFO: renamed from: c */
    public final void mo7444c(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listM7659a = this.f17032a.m7659a(th, false);
        if (listM7659a == null) {
            return;
        }
        synchronized (listM7659a) {
            for (Throwable th2 : listM7659a) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
