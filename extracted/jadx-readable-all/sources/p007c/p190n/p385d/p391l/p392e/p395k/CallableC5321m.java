package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;
import p007c.p190n.p385d.p391l.p392e.p396l.LogFileManager;

/* JADX INFO: renamed from: c.n.d.l.e.k.m */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class CallableC5321m implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f26537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5335t f26539c;

    public CallableC5321m(C5335t c5335t, long j2, String str) {
        this.f26539c = c5335t;
        this.f26537a = j2;
        this.f26538b = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        if (this.f26539c.m11798p()) {
            return null;
        }
        LogFileManager logFileManager = this.f26539c.f26603t;
        logFileManager.f26652d.mo11816e(this.f26537a, this.f26538b);
        return null;
    }
}
