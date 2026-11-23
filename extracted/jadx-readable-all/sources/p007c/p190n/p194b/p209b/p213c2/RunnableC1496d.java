package p007c.p190n.p194b.p209b.p213c2;

import android.view.Surface;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.c2.d */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1496d implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VideoRendererEventListener2.a f6414f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Surface f6415g;

    public /* synthetic */ RunnableC1496d(VideoRendererEventListener2.a aVar, Surface surface) {
        this.f6414f = aVar;
        this.f6415g = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener2.a aVar = this.f6414f;
        Surface surface = this.f6415g;
        VideoRendererEventListener2 videoRendererEventListener2 = aVar.f6543b;
        int i = Util6.f6307a;
        videoRendererEventListener2.mo1153t(surface);
    }
}
