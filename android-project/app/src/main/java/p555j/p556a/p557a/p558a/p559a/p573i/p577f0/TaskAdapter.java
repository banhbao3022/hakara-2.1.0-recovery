package p555j.p556a.p557a.p558a.p559a.p573i.p577f0;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task;
import p000.C7390o0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemTaskBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.i.f0.d, reason: use source file name */
/* JADX INFO: compiled from: TaskAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskAdapter extends BaseListAdapter<Task, ItemTaskBinding> {

    /* JADX INFO: renamed from: f */
    public TaskCheckInAdapter f31450f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Task, Unit> f31451g;

    /* JADX INFO: renamed from: j.a.a.a.a.i.f0.d$a */
    /* JADX INFO: compiled from: TaskAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Task, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31452g = new a();

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

    /* JADX INFO: renamed from: j.a.a.a.a.i.f0.d$b */
    /* JADX INFO: compiled from: TaskAdapter.kt */
    public static final class b extends DiffUtil.e<Task> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Task task, Task task2) {
            Task task3 = task;
            Task task4 = task2;
            Intrinsics2.m13089e(task3, "oldItem");
            Intrinsics2.m13089e(task4, "newItem");
            return Intrinsics2.m13085a(task3, task4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Task task, Task task2) {
            Task task3 = task;
            Task task4 = task2;
            Intrinsics2.m13089e(task3, "oldItem");
            Intrinsics2.m13089e(task4, "newItem");
            return task3.getId() == task4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TaskAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31452g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_task;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemTaskBinding itemTaskBinding = (ItemTaskBinding) viewDataBinding;
        Intrinsics2.m13089e(itemTaskBinding, "binding");
        View view = itemTaskBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C7390o0(0, itemTaskBinding, this));
        TextView textView = itemTaskBinding.f32450t;
        Intrinsics2.m13088d(textView, "btnAction");
        SkuDao.a.m14067S(textView, new C7390o0(1, itemTaskBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemTaskBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        if (i == 0) {
            ItemTaskBinding itemTaskBinding = (ItemTaskBinding) baseListAdapter3.f32043u;
            RecyclerView recyclerView = itemTaskBinding.f32452v;
            Intrinsics2.m13088d(recyclerView, "recyclerViewCheckIn");
            if (recyclerView.getAdapter() == null) {
                RecyclerView recyclerView2 = itemTaskBinding.f32452v;
                Intrinsics2.m13088d(recyclerView2, "recyclerViewCheckIn");
                recyclerView2.setAdapter(this.f31450f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskAdapter(InterfaceC6164l<? super Task, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31451g = interfaceC6164l;
        this.f31450f = new TaskCheckInAdapter(null, 1, null);
    }
}
