package p007c.p165l;

import android.os.Handler;
import java.util.HashSet;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.f0, reason: use source file name */
/* JADX INFO: compiled from: RequestProgress.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestProgress {

    /* JADX INFO: renamed from: a */
    public final GraphRequest2 f4563a;

    /* JADX INFO: renamed from: b */
    public final Handler f4564b;

    /* JADX INFO: renamed from: c */
    public final long f4565c;

    /* JADX INFO: renamed from: d */
    public long f4566d;

    /* JADX INFO: renamed from: e */
    public long f4567e;

    /* JADX INFO: renamed from: f */
    public long f4568f;

    /* JADX INFO: renamed from: c.l.f0$a */
    /* JADX INFO: compiled from: RequestProgress.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ GraphRequest2.f f4569f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ long f4570g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ long f4571h;

        public a(RequestProgress requestProgress, GraphRequest2.f fVar, long j2, long j3) {
            this.f4569f = fVar;
            this.f4570g = j2;
            this.f4571h = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4569f.m2694a(this.f4570g, this.f4571h);
        }
    }

    public RequestProgress(Handler handler, GraphRequest2 graphRequest2) {
        this.f4563a = graphRequest2;
        this.f4564b = handler;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        this.f4565c = FacebookSdk.f5359h.get();
    }

    /* JADX INFO: renamed from: a */
    public void m2267a() {
        long j2 = this.f4566d;
        if (j2 > this.f4567e) {
            GraphRequest2.c cVar = this.f4563a.f5381j;
            long j3 = this.f4568f;
            if (j3 <= 0 || !(cVar instanceof GraphRequest2.f)) {
                return;
            }
            GraphRequest2.f fVar = (GraphRequest2.f) cVar;
            Handler handler = this.f4564b;
            if (handler == null) {
                fVar.m2694a(j2, j3);
            } else {
                handler.post(new a(this, fVar, j2, j3));
            }
            this.f4567e = this.f4566d;
        }
    }
}
