package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2286o;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u71 implements Callable {

    /* JADX INFO: renamed from: a */
    public static final Callable f20227a = new u71();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        C2330u c2330u = C2330u.f10884a;
        C2286o c2286o = c2330u.f10899n;
        synchronized (c2286o.f10755a) {
            str = c2286o.f10757c;
        }
        return new w71(str, c2330u.f10899n.m4794c());
    }
}
