package p500e1.p501a;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: e1.a.w1, reason: use source file name */
/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Timeout extends CancellationException {

    /* JADX INFO: renamed from: f */
    public final Job f29817f;

    public Timeout(String str, Job job) {
        super(str);
        this.f29817f = job;
    }

    public Timeout(String str) {
        this(str, null);
    }
}
