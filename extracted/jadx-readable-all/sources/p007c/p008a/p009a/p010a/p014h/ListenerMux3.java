package p007c.p008a.p009a.p010a.p014h;

import p007c.p008a.p009a.p010a.p027i.OnPreparedListener2;

/* JADX INFO: renamed from: c.a.a.a.h.c, reason: use source file name */
/* JADX INFO: compiled from: ListenerMux.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerMux3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListenerMux f1518f;

    public ListenerMux3(ListenerMux listenerMux) {
        this.f1518f = listenerMux;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenerMux listenerMux = this.f1518f;
        listenerMux.f1516r.mo1009c();
        OnPreparedListener2 onPreparedListener2 = listenerMux.f1505g;
        if (onPreparedListener2 != null) {
            onPreparedListener2.mo1207a();
        }
    }
}
