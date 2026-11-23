package p636z0.p667e.p676b.p677v1;

import android.content.Context;
import p636z0.p667e.p676b.InitializationException;

/* JADX INFO: renamed from: z0.e.b.v1.q1, reason: use source file name */
/* JADX INFO: compiled from: UseCaseConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public interface UseCaseConfigFactory {

    /* JADX INFO: renamed from: z0.e.b.v1.q1$a */
    /* JADX INFO: compiled from: UseCaseConfigFactory.java */
    public enum a {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* JADX INFO: renamed from: z0.e.b.v1.q1$b */
    /* JADX INFO: compiled from: UseCaseConfigFactory.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        UseCaseConfigFactory mo15068a(Context context) throws InitializationException;
    }

    /* JADX INFO: renamed from: a */
    Config3 mo15201a(a aVar);
}
