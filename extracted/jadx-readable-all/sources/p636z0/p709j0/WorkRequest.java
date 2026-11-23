package p636z0.p709j0;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import p636z0.p709j0.p710y.p719s.WorkSpec;

/* JADX INFO: renamed from: z0.j0.v, reason: use source file name */
/* JADX INFO: compiled from: WorkRequest.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkRequest {

    /* JADX INFO: renamed from: a */
    public UUID f37289a;

    /* JADX INFO: renamed from: b */
    public WorkSpec f37290b;

    /* JADX INFO: renamed from: c */
    public Set<String> f37291c;

    /* JADX INFO: renamed from: z0.j0.v$a */
    /* JADX INFO: compiled from: WorkRequest.java */
    public static abstract class a<B extends a<?, ?>, W extends WorkRequest> {

        /* JADX INFO: renamed from: b */
        public WorkSpec f37293b;

        /* JADX INFO: renamed from: c */
        public Set<String> f37294c = new HashSet();

        /* JADX INFO: renamed from: a */
        public UUID f37292a = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f37293b = new WorkSpec(this.f37292a.toString(), cls.getName());
            this.f37294c.add(cls.getName());
        }

        /* JADX INFO: renamed from: a */
        public final W m15895a() {
            OneTimeWorkRequest.a aVar = (OneTimeWorkRequest.a) this;
            WorkSpec workSpec = aVar.f37293b;
            if (workSpec.f37540q && Build.VERSION.SDK_INT >= 23 && workSpec.f37533j.f37245d) {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            OneTimeWorkRequest oneTimeWorkRequest = new OneTimeWorkRequest(aVar);
            this.f37292a = UUID.randomUUID();
            WorkSpec workSpec2 = new WorkSpec(this.f37293b);
            this.f37293b = workSpec2;
            workSpec2.f37524a = this.f37292a.toString();
            return oneTimeWorkRequest;
        }
    }

    public WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        this.f37289a = uuid;
        this.f37290b = workSpec;
        this.f37291c = set;
    }

    /* JADX INFO: renamed from: a */
    public String m15894a() {
        return this.f37289a.toString();
    }
}
