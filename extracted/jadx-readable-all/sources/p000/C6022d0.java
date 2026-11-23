package p000;

import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreAdapter;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6022d0 extends Lambda implements InterfaceC6164l<User, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29427g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f29428h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f29429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6022d0(int i, Object obj, Object obj2) {
        super(1);
        this.f29427g = i;
        this.f29428h = obj;
        this.f29429i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(User user) {
        int i = this.f29427g;
        if (i == 0) {
            User user2 = user;
            Intrinsics2.m13089e(user2, "it");
            ((ExploreAdapter) this.f29428h).f31097l.mo3b(user2);
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        User user3 = user;
        Intrinsics2.m13089e(user3, "it");
        ((ExploreAdapter) this.f29428h).f31100o.mo3b(user3);
        return Unit.f29502a;
    }
}
