package p007c.p190n.p194b.p209b.p215n1;

import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.n1.c */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1603c implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AudioRendererEventListener2.a f6991f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Exception f6992g;

    public /* synthetic */ RunnableC1603c(AudioRendererEventListener2.a aVar, Exception exc) {
        this.f6991f = aVar;
        this.f6992g = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener2.a aVar = this.f6991f;
        Exception exc = this.f6992g;
        AudioRendererEventListener2 audioRendererEventListener2 = aVar.f7116b;
        int i = Util6.f6307a;
        audioRendererEventListener2.mo1133H(exc);
    }
}
