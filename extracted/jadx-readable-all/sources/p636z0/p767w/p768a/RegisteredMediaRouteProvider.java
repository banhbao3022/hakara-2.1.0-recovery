package p636z0.p767w.p768a;

import java.util.Objects;

/* JADX INFO: renamed from: z0.w.a.r, reason: use source file name */
/* JADX INFO: compiled from: RegisteredMediaRouteProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class RegisteredMediaRouteProvider implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisteredMediaRouteProvider2.a f38901f;

    public RegisteredMediaRouteProvider(RegisteredMediaRouteProvider2.a aVar) {
        this.f38901f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        RegisteredMediaRouteProvider2.a aVar = this.f38901f;
        for (int i = 0; i < aVar.f38917h.size(); i++) {
            Objects.requireNonNull(aVar.f38917h.valueAt(i));
        }
        aVar.f38917h.clear();
    }
}
