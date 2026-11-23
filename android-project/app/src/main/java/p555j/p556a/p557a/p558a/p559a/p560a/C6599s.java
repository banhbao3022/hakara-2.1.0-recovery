package p555j.p556a.p557a.p558a.p559a.p560a;

import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p080e.p081a.Statistics;
import p007c.p080e.p081a.StatisticsCallback;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p534c.p535a.Async;
import p526i1.p534c.p535a.Async2;

/* JADX INFO: renamed from: j.a.a.a.a.a.s */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6599s implements StatisticsCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f31034a;

    /* JADX INFO: renamed from: j.a.a.a.a.a.s$a */
    /* JADX INFO: compiled from: ProcessActivity.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Async<ProcessActivity>, Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Statistics f31036h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Statistics statistics) {
            super(1);
            this.f31036h = statistics;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Async<ProcessActivity> async) {
            Async<ProcessActivity> async2 = async;
            Intrinsics2.m13089e(async2, "$receiver");
            Statistics statistics = this.f31036h;
            Intrinsics2.m13088d(statistics, "it");
            int i = statistics.f2813f;
            ProcessActivity processActivity = C6599s.this.f31034a;
            ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
            processActivity.f33737P = processActivity.durationSeconds();
            Async2.m13838a(async2, new C6598r(this, i));
            return Unit.f29502a;
        }
    }

    public C6599s(ProcessActivity processActivity) {
        this.f31034a = processActivity;
    }

    @Override // p007c.p080e.p081a.StatisticsCallback
    /* JADX INFO: renamed from: a */
    public final void mo1610a(Statistics statistics) {
        Async2.m13839b(this.f31034a, null, new a(statistics), 1);
    }
}
