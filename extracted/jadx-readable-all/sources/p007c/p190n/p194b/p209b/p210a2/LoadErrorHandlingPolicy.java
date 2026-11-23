package p007c.p190n.p194b.p209b.p210a2;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;

/* JADX INFO: renamed from: c.n.b.b.a2.a0, reason: use source file name */
/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public interface LoadErrorHandlingPolicy {

    /* JADX INFO: renamed from: c.n.b.b.a2.a0$a */
    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LoadEventInfo f5951a;

        /* JADX INFO: renamed from: b */
        public final MediaLoadData f5952b;

        /* JADX INFO: renamed from: c */
        public final IOException f5953c;

        /* JADX INFO: renamed from: d */
        public final int f5954d;

        public a(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, int i) {
            this.f5951a = loadEventInfo;
            this.f5952b = mediaLoadData;
            this.f5953c = iOException;
            this.f5954d = i;
        }
    }
}
