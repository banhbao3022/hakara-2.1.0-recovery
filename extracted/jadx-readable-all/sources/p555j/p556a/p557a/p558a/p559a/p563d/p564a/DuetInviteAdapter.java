package p555j.p556a.p557a.p558a.p559a.p563d.p564a;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p000.C0001a0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemDuetInviteBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.d.a.a, reason: use source file name */
/* JADX INFO: compiled from: DuetInviteAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetInviteAdapter extends BaseListAdapter<Recording, ItemDuetInviteBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Recording, Unit> f31143f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Recording, Unit> f31144g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Recording, Unit> f31145h;

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31146g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31147h = new a(1);

        /* JADX INFO: renamed from: i */
        public static final a f31148i = new a(2);

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ int f31149j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31149j = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Recording recording) {
            int i = this.f31149j;
            if (i == 0) {
                Intrinsics2.m13089e(recording, "it");
                return Unit.f29502a;
            }
            if (i == 1) {
                Intrinsics2.m13089e(recording, "it");
                return Unit.f29502a;
            }
            if (i != 2) {
                throw null;
            }
            Intrinsics2.m13089e(recording, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.d.a.a$b */
    /* JADX INFO: compiled from: DuetInviteAdapter.kt */
    public static final class b extends DiffUtil.e<Recording> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Recording recording, Recording recording2) {
            Recording recording3 = recording;
            Recording recording4 = recording2;
            Intrinsics2.m13089e(recording3, "oldItem");
            Intrinsics2.m13089e(recording4, "newItem");
            return Intrinsics2.m13085a(recording3, recording4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Recording recording, Recording recording2) {
            Recording recording3 = recording;
            Recording recording4 = recording2;
            Intrinsics2.m13089e(recording3, "oldItem");
            Intrinsics2.m13089e(recording4, "newItem");
            return recording3.getId() == recording4.getId();
        }
    }

    public DuetInviteAdapter() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DuetInviteAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, InterfaceC6164l interfaceC6164l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31146g : interfaceC6164l, (i & 2) != 0 ? a.f31147h : interfaceC6164l2, (i & 4) != 0 ? a.f31148i : interfaceC6164l3);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_duet_invite;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemDuetInviteBinding itemDuetInviteBinding = (ItemDuetInviteBinding) viewDataBinding;
        Intrinsics2.m13089e(itemDuetInviteBinding, "binding");
        View view = itemDuetInviteBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C0001a0(0, itemDuetInviteBinding, this));
        RelativeLayout relativeLayout = itemDuetInviteBinding.f32870C;
        Intrinsics2.m13088d(relativeLayout, "viewAccount");
        SkuDao.a.m14067S(relativeLayout, new C0001a0(1, itemDuetInviteBinding, this));
        TextView textView = itemDuetInviteBinding.f32872t;
        Intrinsics2.m13088d(textView, "btnJoinDuet");
        SkuDao.a.m14067S(textView, new C0001a0(2, itemDuetInviteBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DuetInviteAdapter(InterfaceC6164l<? super Recording, Unit> interfaceC6164l, InterfaceC6164l<? super Recording, Unit> interfaceC6164l2, InterfaceC6164l<? super Recording, Unit> interfaceC6164l3) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "viewAccountClickListener");
        Intrinsics2.m13089e(interfaceC6164l3, "joinDuetClickListener");
        this.f31143f = interfaceC6164l;
        this.f31144g = interfaceC6164l2;
        this.f31145h = interfaceC6164l3;
    }
}
