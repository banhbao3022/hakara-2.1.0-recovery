package p509g1.p510j0.p517j;

import java.io.IOException;
import java.util.List;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.Buffer3;
import p524h1.BufferedSource;

/* JADX INFO: renamed from: g1.j0.j.r, reason: use source file name */
/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface PushObserver {

    /* JADX INFO: renamed from: a */
    public static final PushObserver f30510a;

    /* JADX INFO: renamed from: g1.j0.j.r$a */
    /* JADX INFO: compiled from: PushObserver.kt */
    public static final class a {

        /* JADX INFO: renamed from: g1.j0.j.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PushObserver.kt */
        public static final class C8544a implements PushObserver {
            @Override // p509g1.p510j0.p517j.PushObserver
            /* JADX INFO: renamed from: a */
            public boolean mo13575a(int i, List<Header> list) {
                Intrinsics2.m13090f(list, "requestHeaders");
                return true;
            }

            @Override // p509g1.p510j0.p517j.PushObserver
            /* JADX INFO: renamed from: b */
            public boolean mo13576b(int i, List<Header> list, boolean z) {
                Intrinsics2.m13090f(list, "responseHeaders");
                return true;
            }

            @Override // p509g1.p510j0.p517j.PushObserver
            /* JADX INFO: renamed from: c */
            public void mo13577c(int i, ErrorCode2 errorCode2) {
                Intrinsics2.m13090f(errorCode2, "errorCode");
            }

            @Override // p509g1.p510j0.p517j.PushObserver
            /* JADX INFO: renamed from: d */
            public boolean mo13578d(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
                Intrinsics2.m13090f(bufferedSource, "source");
                ((Buffer3) bufferedSource).skip(i2);
                return true;
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f30510a = new a.C8544a();
    }

    /* JADX INFO: renamed from: a */
    boolean mo13575a(int i, List<Header> list);

    /* JADX INFO: renamed from: b */
    boolean mo13576b(int i, List<Header> list, boolean z);

    /* JADX INFO: renamed from: c */
    void mo13577c(int i, ErrorCode2 errorCode2);

    /* JADX INFO: renamed from: d */
    boolean mo13578d(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;
}
