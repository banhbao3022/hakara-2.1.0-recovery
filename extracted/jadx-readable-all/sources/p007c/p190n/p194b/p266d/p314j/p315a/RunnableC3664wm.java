package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2612g;
import p007c.p190n.p194b.p266d.p298f.C2614h;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.wm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3664wm implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f21259f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3147io f21260g;

    public RunnableC3664wm(Context context, C3147io c3147io) {
        this.f21259f = context;
        this.f21260g = c3147io;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f21260g.m7286a(C2211a.m4656b(this.f21259f));
        } catch (C2612g | C2614h | IOException | IllegalStateException e) {
            this.f21260g.m7287b(e);
            C2622l.m5438t3("Exception while getting advertising Id info", e);
        }
    }
}
