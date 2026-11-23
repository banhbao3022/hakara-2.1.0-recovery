package p007c.p190n.p194b.p209b;

import java.util.Arrays;
import java.util.List;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.r */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1687r implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ExoPlayerImpl f7443f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExoPlayerImplInternal2.d f7444g;

    public /* synthetic */ RunnableC1687r(ExoPlayerImpl exoPlayerImpl, ExoPlayerImplInternal2.d dVar) {
        this.f7443f = exoPlayerImpl;
        this.f7444g = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExoPlayerImpl exoPlayerImpl = this.f7443f;
        ExoPlayerImplInternal2.d dVar = this.f7444g;
        int i = exoPlayerImpl.f6652s - dVar.f6722c;
        exoPlayerImpl.f6652s = i;
        if (dVar.f6723d) {
            exoPlayerImpl.f6653t = true;
            exoPlayerImpl.f6654u = dVar.f6724e;
        }
        if (dVar.f6725f) {
            exoPlayerImpl.f6655v = dVar.f6726g;
        }
        if (i == 0) {
            Timeline timeline = dVar.f6721b.f5929b;
            if (!exoPlayerImpl.f6657x.f5929b.m3470q() && timeline.m3470q()) {
                exoPlayerImpl.f6658y = -1;
                exoPlayerImpl.f6659z = 0L;
            }
            if (!timeline.m3470q()) {
                List listAsList = Arrays.asList(((PlaylistTimeline) timeline).f6607j);
                C2096e.m4570f(listAsList.size() == exoPlayerImpl.f6643j.size());
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    exoPlayerImpl.f6643j.get(i2).f6661b = (Timeline) listAsList.get(i2);
                }
            }
            boolean z = exoPlayerImpl.f6653t;
            exoPlayerImpl.f6653t = false;
            exoPlayerImpl.m3373A(dVar.f6721b, z, exoPlayerImpl.f6654u, 1, exoPlayerImpl.f6655v, false);
        }
    }
}
