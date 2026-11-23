package mtp.media.karaoke.addon.firebase.message;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: MyFirebaseWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MyFirebaseWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFirebaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics2.m13089e(context, "appContext");
        Intrinsics2.m13089e(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.AbstractC0224a doWork() {
        Intrinsics2.m13089e("Performing long running task in scheduled job", "message");
        ListenableWorker.AbstractC0224a.c cVar = new ListenableWorker.AbstractC0224a.c();
        Intrinsics2.m13088d(cVar, "Result.success()");
        return cVar;
    }
}
