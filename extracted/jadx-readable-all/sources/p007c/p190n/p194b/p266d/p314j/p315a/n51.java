package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n51 implements qu1 {

    /* JADX INFO: renamed from: a */
    public static final qu1 f17027a = new n51();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
    /* JADX INFO: renamed from: a */
    public final kv1 mo4612a(Object obj) {
        final String str = (String) obj;
        return cw0.m6231a(new ha1(str) { // from class: c.n.b.d.j.a.o51

            /* JADX INFO: renamed from: a */
            public final String f17540a;

            {
                this.f17540a = str;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
            /* JADX INFO: renamed from: d */
            public final void mo5696d(Object obj2) {
                ((Bundle) obj2).putString("ms", this.f17540a);
            }
        });
    }
}
