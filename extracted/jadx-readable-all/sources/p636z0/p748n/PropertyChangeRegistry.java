package p636z0.p748n;

/* JADX INFO: renamed from: z0.n.h, reason: use source file name */
/* JADX INFO: compiled from: PropertyChangeRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class PropertyChangeRegistry extends CallbackRegistry<Observable.a, Observable, Void> {

    /* JADX INFO: renamed from: k */
    public static final CallbackRegistry.a<Observable.a, Observable, Void> f38200k = new a();

    /* JADX INFO: renamed from: z0.n.h$a */
    /* JADX INFO: compiled from: PropertyChangeRegistry.java */
    public static class a extends CallbackRegistry.a<Observable.a, Observable, Void> {
        @Override // p636z0.p748n.CallbackRegistry.a
        /* JADX INFO: renamed from: a */
        public void mo406a(Observable.a aVar, Observable observable, int i, Void r4) {
            aVar.m16405a(observable, i);
        }
    }

    public PropertyChangeRegistry() {
        super(f38200k);
    }
}
