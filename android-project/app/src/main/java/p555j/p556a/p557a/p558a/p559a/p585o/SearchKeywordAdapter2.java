package p555j.p556a.p557a.p558a.p559a.p585o;

import mtp.media.karaoke.data.model.Keyword;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemKeywordBinding;

/* JADX INFO: renamed from: j.a.a.a.a.o.f, reason: use source file name */
/* JADX INFO: compiled from: SearchKeywordAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchKeywordAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemKeywordBinding f31705g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SearchKeywordAdapter f31706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKeywordAdapter2(ItemKeywordBinding itemKeywordBinding, SearchKeywordAdapter searchKeywordAdapter) {
        super(0);
        this.f31705g = itemKeywordBinding;
        this.f31706h = searchKeywordAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Keyword keyword = this.f31705g.f32633u;
        if (keyword != null) {
            InterfaceC6164l<Keyword, Unit> interfaceC6164l = this.f31706h.f31703f;
            Intrinsics2.m13088d(keyword, "this");
            interfaceC6164l.mo3b(keyword);
        }
        return Unit.f29502a;
    }
}
