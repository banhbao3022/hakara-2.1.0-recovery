package p555j.p556a.p557a.p558a.p559a.p573i.p575d0;

import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.block.BlockActivity;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel5;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.d0.b, reason: use source file name */
/* JADX INFO: compiled from: BlockActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockActivity3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BlockActivity f31429g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ User f31430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockActivity3(BlockActivity blockActivity, User user) {
        super(0);
        this.f31429g = blockActivity;
        this.f31430h = user;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        ProfileViewModel6 profileViewModel6 = (ProfileViewModel6) this.f31429g.f33814B.getValue();
        int id = this.f31430h.getId();
        Objects.requireNonNull(profileViewModel6);
        C5729a.m12428A(C8310a.m16440e(profileViewModel6), null, 0, new ProfileViewModel5(profileViewModel6, id, 2, null), 3, null);
        SkuDao.a.m14092i0(this.f31429g, R.string.message_unblock_success, 0, 2);
        ArrayList arrayList = (ArrayList) this.f31429g.mo13969R().f32034q.m421d();
        if (arrayList != null) {
            arrayList.remove(this.f31430h);
        }
        BaseListAdapter<User, ? extends ViewDataBinding> baseListAdapterMo13980W = this.f31429g.mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.profile.block.BlockAdapter");
        ((BlockAdapter) baseListAdapterMo13980W).m13977p((List) this.f31429g.mo13969R().f32034q.m421d());
        return Unit.f29502a;
    }
}
