package p007c.p008a.p009a.p010a.p014h;

import p007c.p008a.p009a.p010a.p027i.OnCompletionListener2;

/* JADX INFO: renamed from: c.a.a.a.h.b, reason: use source file name */
/* JADX INFO: compiled from: ListenerMux.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerMux2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListenerMux f1517f;

    public ListenerMux2(ListenerMux listenerMux) {
        this.f1517f = listenerMux;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnCompletionListener2 onCompletionListener2 = this.f1517f.f1506h;
        if (onCompletionListener2 != null) {
            onCompletionListener2.mo1205g();
        }
    }
}
