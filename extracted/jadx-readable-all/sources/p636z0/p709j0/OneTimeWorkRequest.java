package p636z0.p709j0;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: renamed from: z0.j0.o, reason: use source file name */
/* JADX INFO: compiled from: OneTimeWorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class OneTimeWorkRequest extends WorkRequest {

    /* JADX INFO: renamed from: z0.j0.o$a */
    /* JADX INFO: compiled from: OneTimeWorkRequest.java */
    public static final class a extends WorkRequest.a<a, OneTimeWorkRequest> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f37293b.f37527d = OverwritingInputMerger.class.getName();
        }
    }

    public OneTimeWorkRequest(a aVar) {
        super(aVar.f37292a, aVar.f37293b, aVar.f37294c);
    }
}
