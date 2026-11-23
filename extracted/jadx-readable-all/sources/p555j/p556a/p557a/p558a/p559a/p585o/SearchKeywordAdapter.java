package p555j.p556a.p557a.p558a.p559a.p585o;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Keyword;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemKeywordBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.o.e, reason: use source file name */
/* JADX INFO: compiled from: SearchKeywordAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchKeywordAdapter extends BaseListAdapter<Keyword, ItemKeywordBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Keyword, Unit> f31703f;

    /* JADX INFO: renamed from: j.a.a.a.a.o.e$a */
    /* JADX INFO: compiled from: SearchKeywordAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Keyword, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31704g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Keyword keyword) {
            Intrinsics2.m13089e(keyword, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.o.e$b */
    /* JADX INFO: compiled from: SearchKeywordAdapter.kt */
    public static final class b extends DiffUtil.e<Keyword> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Keyword keyword, Keyword keyword2) {
            Keyword keyword3 = keyword;
            Keyword keyword4 = keyword2;
            Intrinsics2.m13089e(keyword3, "oldItem");
            Intrinsics2.m13089e(keyword4, "newItem");
            return Intrinsics2.m13085a(keyword3, keyword4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Keyword keyword, Keyword keyword2) {
            Keyword keyword3 = keyword;
            Keyword keyword4 = keyword2;
            Intrinsics2.m13089e(keyword3, "oldItem");
            Intrinsics2.m13089e(keyword4, "newItem");
            return keyword3.getId() == keyword4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchKeywordAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SearchKeywordAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31704g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_keyword;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemKeywordBinding itemKeywordBinding = (ItemKeywordBinding) viewDataBinding;
        Intrinsics2.m13089e(itemKeywordBinding, "binding");
        View view = itemKeywordBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new SearchKeywordAdapter2(itemKeywordBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchKeywordAdapter(InterfaceC6164l<? super Keyword, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31703f = interfaceC6164l;
    }
}
