package p555j.p556a.p557a.p558a.p559a.p573i.p577f0;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task3;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p616i.ItemCheckinDayBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.i.f0.e, reason: use source file name */
/* JADX INFO: compiled from: TaskCheckInAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskCheckInAdapter extends BaseListAdapter<Task3, ItemCheckinDayBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Task, Unit> f31453f;

    /* JADX INFO: renamed from: j.a.a.a.a.i.f0.e$a */
    /* JADX INFO: compiled from: TaskCheckInAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Task, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31454g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Task task) {
            Intrinsics2.m13089e(task, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.f0.e$b */
    /* JADX INFO: compiled from: TaskCheckInAdapter.kt */
    public static final class b extends DiffUtil.e<Task3> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Task3 task3, Task3 task4) {
            Task3 task5 = task3;
            Task3 task6 = task4;
            Intrinsics2.m13089e(task5, "oldItem");
            Intrinsics2.m13089e(task6, "newItem");
            return Intrinsics2.m13085a(task5, task6);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Task3 task3, Task3 task4) {
            Task3 task5 = task3;
            Task3 task6 = task4;
            Intrinsics2.m13089e(task5, "oldItem");
            Intrinsics2.m13089e(task6, "newItem");
            return task5.getDay() == task6.getDay();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskCheckInAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TaskCheckInAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31454g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_checkin_day;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskCheckInAdapter(InterfaceC6164l<? super Task, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31453f = interfaceC6164l;
    }
}
